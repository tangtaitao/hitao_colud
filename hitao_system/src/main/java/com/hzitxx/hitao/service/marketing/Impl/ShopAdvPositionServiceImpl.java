package com.hzitxx.hitao.service.marketing.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopAdv;
import com.hzitxx.hitao.entity.ShopAdvPosition;
import com.hzitxx.hitao.mapper.marketing.ShopAdvMapper;
import com.hzitxx.hitao.mapper.marketing.ShopAdvPositionMapper;
import com.hzitxx.hitao.service.marketing.ShopAdvPositionService;
import com.hzitxx.hitao.service.marketing.ShopAdvService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 广告位置表的service层
 * 
 * @author Administrator
 *
 */
@Service
public class ShopAdvPositionServiceImpl implements ShopAdvPositionService {
	// 自动注入ShopAdvService对象
	@Autowired
	private ShopAdvPositionMapper shopAdvPositionMapper;

	/**
	 * 添加一条数据
	 */
	@Override
	public ServerResponse<Integer> addShopAdvPosition(ShopAdvPosition shopAdvPosition) {
		// 添加数据
		int i = shopAdvPositionMapper.addShopAdvPosition(shopAdvPosition);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("添加成功");
		} else {
			// 失败
			return ServerResponse.createByErrorMessage("添加失败");
		}
	}

	/**
	 * 删除一条数据
	 */
	@Override
	public ServerResponse<Integer> deleteById(Integer apId) {
		// 删除数据
		int i = shopAdvPositionMapper.deleteById(apId);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("删除成功");
		} else {
			// 失败
			return ServerResponse.createByErrorMessage("删除失败");
		}
	}

	/**
	 * 修改一条数据
	 */
	@Override
	public ServerResponse<Integer> updateById(ShopAdvPosition shopAdvPosition) {
		// 修改数据
		int i = shopAdvPositionMapper.updateById(shopAdvPosition);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("修改成功");
		} else {
			// 失败
			return ServerResponse.createByErrorMessage("修改失败");
		}
	}

	/**
	 * 查询一条信息
	 */
	@Override
	public ServerResponse<ShopAdvPosition> findOne(Integer apId) {
		// 查询信息
		ShopAdvPosition shopAdvPosition = shopAdvPositionMapper.findOne(apId);
		// 判断是否成功
		if (shopAdvPosition != null) {
			// 成功
			return ServerResponse.createBySuccess("一条广告信息", shopAdvPosition);
		} else {
			// 失败
			return ServerResponse.createByErrorMessage("查询失败");
		}
	}

	/**
	 * 搜索数据并分页
	 */
	@Override
	public ServerResponse<LayuiEntity<ShopAdvPosition>> searchShopAdvPosition(Map<String, Object> map, int page,
			int limit) {
		// 分页
		PageHelper.startPage(page, limit);
		// 查询数据
		List<ShopAdvPosition> list = shopAdvPositionMapper.searchShopAdvPosition(map);
		// 创建pageInfo获取数据
		PageInfo<ShopAdvPosition> pageInfo = new PageInfo<>(list);
		// 创建layui实体类
		LayuiEntity<ShopAdvPosition> layuiEntity = new LayuiEntity<>();
		// 设置属性值
		layuiEntity.setCode(0);
		layuiEntity.setMsg("广告信息");
		layuiEntity.setCount(pageInfo.getTotal());
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess("广告信息", layuiEntity);
	}

}
