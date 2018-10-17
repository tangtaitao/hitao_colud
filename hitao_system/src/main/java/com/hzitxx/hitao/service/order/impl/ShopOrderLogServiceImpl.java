package com.hzitxx.hitao.service.order.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopOrderLog;
import com.hzitxx.hitao.mapper.order.ShopOrderLogMapper;
import com.hzitxx.hitao.service.order.ShopOrderLogService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 处理订单处理记录表
 * 
 * @author Administrator
 *
 */
@Service
public class ShopOrderLogServiceImpl implements ShopOrderLogService {
	// 自动注入ShopOrderLogMppper对象
	@Autowired
	private ShopOrderLogMapper shopOrderLogMapper;

	/**
	 * 新增一条数据
	 * 
	 * @param shopOrderLog
	 * @return
	 */
	@Override
	public ServerResponse<Integer> addShopOrderLog(ShopOrderLog shopOrderLog) {
		// 添加数据
		int i = shopOrderLogMapper.addShopOrderLog(shopOrderLog);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("添加成功");
		}
		// 失败
		return ServerResponse.createByErrorMessage("添加失败");
	}

	/**
	 * 根据id删除一条数据
	 */
	@Override
	public ServerResponse<Integer> deleteById(Integer logId) {
		// 删除数据
		int i = shopOrderLogMapper.deleteById(logId);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("删除成功");
		}
		// 失败
		return ServerResponse.createByErrorMessage("删除失败");
	}

	/**
	 * 更新一条数据
	 */
	@Override
	public ServerResponse<Integer> updateById(ShopOrderLog shopOrderLog) {
		// 修改数据
		int i = shopOrderLogMapper.updateById(shopOrderLog);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("修改成功");
		}
		// 失败
		return ServerResponse.createByErrorMessage("修改失败");
	}

	/**
	 * 根据id查询一条数据
	 */
	@Override
	public ServerResponse<ShopOrderLog> findOne(Integer logId) {
		// 查询数据
		ShopOrderLog shopOrderLog = shopOrderLogMapper.findOne(logId);
		// 判断是否成功
		if (shopOrderLog != null) {
			// 成功
			return ServerResponse.createBySuccess("一条订单处理记录", shopOrderLog);
		}
		// 失败
		return ServerResponse.createByErrorMessage("查询失败");
	}

	/**
	 * 查询数据及分页
	 * 
	 * @param map
	 * @return
	 */
	@Override
	public ServerResponse<LayuiEntity<ShopOrderLog>> searchShopOrderLog(Map<String, Object> map, int page, int limit) {
		// 分页
		PageHelper.startPage(page, limit);
		// 查询数据
		List<ShopOrderLog> list = shopOrderLogMapper.searchShopOrderLog(map);
		// 创建PageInfo对象获取数据
		PageInfo<ShopOrderLog> pageInfo = new PageInfo<>(list);
		// 创建LayuiEntity对象用于返回数据
		LayuiEntity<ShopOrderLog> layuiEntity = new LayuiEntity<>();
		// 设置属性值
		layuiEntity.setCode(0);
		layuiEntity.setMsg("订单处理记录");
		layuiEntity.setCount(pageInfo.getTotal());
		layuiEntity.setData(pageInfo.getList());
		// 返回数据
		return ServerResponse.createBySuccess("订单处理记录数据", layuiEntity);
	}

}
