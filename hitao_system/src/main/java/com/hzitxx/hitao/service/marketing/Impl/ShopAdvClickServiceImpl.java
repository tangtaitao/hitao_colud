package com.hzitxx.hitao.service.marketing.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopAdvClick;
import com.hzitxx.hitao.mapper.marketing.ShopAdvClickMapper;
import com.hzitxx.hitao.service.marketing.ShopAdvClickService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 广告点击率表的service层
 * 
 * @author Administrator
 *
 */
@Service
public class ShopAdvClickServiceImpl implements ShopAdvClickService {
	// 自动注入ShopAdvClickService对象
	@Autowired
	private ShopAdvClickMapper shopAdvClickMapper;

	/**
	 * 添加一条数据
	 */
	@Override
	public ServerResponse<Integer> addShopAdvClick(ShopAdvClick shopAdvClick) {
		// 添加数据
		int i = shopAdvClickMapper.addShopAdvClick(shopAdvClick);
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
	public ServerResponse<Integer> deleteById(Integer advId) {
		// 删除数据
		int i = shopAdvClickMapper.deleteById(advId);
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
	public ServerResponse<Integer> updateById(ShopAdvClick shopAdvClick) {
		// 修改数据
		int i = shopAdvClickMapper.updateById(shopAdvClick);
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
	public ServerResponse<ShopAdvClick> findOne(Integer advId) {
		// 查询信息
		ShopAdvClick shopAdvClick = shopAdvClickMapper.findOne(advId);
		// 判断是否成功
		if (shopAdvClick != null) {
			// 成功
			return ServerResponse.createBySuccess("一条广告信息", shopAdvClick);
		} else {
			// 失败
			return ServerResponse.createByErrorMessage("查询失败");
		}
	}

	/**
	 * 搜索数据并分页
	 */
	@Override
	public ServerResponse<LayuiEntity<ShopAdvClick>> searchShopAdvClick(Map<String, Object> map, int page, int limit) {
		// 分页
		PageHelper.startPage(page, limit);
		// 查询数据
		List<ShopAdvClick> list = shopAdvClickMapper.searchShopAdvClick(map);
		// 创建pageInfo获取数据
		PageInfo<ShopAdvClick> pageInfo = new PageInfo<>(list);
		// 创建layui实体类
		LayuiEntity<ShopAdvClick> layuiEntity = new LayuiEntity<>();
		// 设置属性值
		layuiEntity.setCode(0);
		layuiEntity.setMsg("广告信息");
		layuiEntity.setCount(pageInfo.getTotal());
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess("广告信息", layuiEntity);
	}

}
