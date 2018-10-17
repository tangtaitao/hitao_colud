package com.hzitxx.hitao.service.order.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopOrder;
import com.hzitxx.hitao.mapper.order.ShopOrderMapper;
import com.hzitxx.hitao.service.order.ShopOrderService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 处理订单操作
 * 
 * @author Administrator
 *
 */
@Service
public class ShopOrderServiceImpl implements ShopOrderService {
	// 自动注入ShopOrderMapper对象
	@Autowired
	private ShopOrderMapper shopOrderMapper;

	/**
	 * 添加订单,返回添加结果
	 */
	@Override
	public ServerResponse<Integer> addShopOrder(ShopOrder shopOrder) {
		// 添加订单
		int i = shopOrderMapper.addShopOrder(shopOrder);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("添加成功");
		}
		// 失败
		return ServerResponse.createByErrorMessage("添加失败");
	}

	@Override
	public ServerResponse<Integer> deleteById(Integer orderId) {
		// 删除订单
		int i = shopOrderMapper.deleteById(orderId);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("删除成功");
		}
		// 失败
		return ServerResponse.createByErrorMessage("删除失败");
	}

	@Override
	public ServerResponse<Integer> updateById(ShopOrder shopOrder) {
		// 更新订单
		int i = shopOrderMapper.updateById(shopOrder);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("修改成功");
		}
		// 失败
		return ServerResponse.createByErrorMessage("修改失败");
	}

	@Override
	public ServerResponse<ShopOrder> findOne(Integer orderId) {
		// 查询一条数据
		ShopOrder shopOrder = shopOrderMapper.findOne(orderId);
		return ServerResponse.createBySuccess("一条订单信息", shopOrder);
	}

	@Override
	public ServerResponse<LayuiEntity<ShopOrder>> searchShopOrder(Map<String, Object> map, int page, int limit) {
		// 实现分页
		PageHelper.startPage(page, limit);
		// 查询数据
		List<ShopOrder> list = shopOrderMapper.searchShopOrder(map);
		// 创建一个PageInfo对象,以便获取数据
		PageInfo<ShopOrder> pageInfo = new PageInfo<>(list);
		// 创建LayuiEntity对象返回数据
		LayuiEntity<ShopOrder> layuiEntity = new LayuiEntity<>();
		// 添加数据
		layuiEntity.setCode(0);// 0表示成功
		layuiEntity.setMsg("订单信息");
		layuiEntity.setCount(pageInfo.getTotal());// 获取数据总数
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess("订单数据", layuiEntity);
	}
}