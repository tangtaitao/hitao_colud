package com.hzitxx.hitao.service.order.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopOrder;
import com.hzitxx.hitao.entity.ShopOrderGoods;
import com.hzitxx.hitao.mapper.order.ShopOrderGoodsMapper;
import com.hzitxx.hitao.service.order.ShopOrderGoodsService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

@Service
public class ShopOrderGoodsServiceImpl implements ShopOrderGoodsService {
	// 自动注入ShopOrderGoodsMapper对象
	@Autowired
	private ShopOrderGoodsMapper shopOrderGoodsMapper;

	/**
	 * 添加一条数据
	 */
	@Override
	public ServerResponse<Integer> addShopOrderGoods(ShopOrderGoods shopOrderGoods) {
		// 添加数据
		int i = shopOrderGoodsMapper.addShopOrderGoods(shopOrderGoods);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("添加成功");
		}
		// 失败
		return ServerResponse.createByErrorMessage("添加失败");
	}

	/**
	 * 删除一条数据
	 */
	@Override
	public ServerResponse<Integer> deleteById(Integer recId) {
		// 删除数据
		int i = shopOrderGoodsMapper.deleteById(recId);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("删除成功");
		}
		// 失败
		return ServerResponse.createByErrorMessage("删除失败");
	}

	/**
	 * 修改一条数据
	 */
	@Override
	public ServerResponse<Integer> updateById(ShopOrderGoods shopOrderGoods) {
		// 修改数据
		int i = shopOrderGoodsMapper.updateById(shopOrderGoods);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("修改成功");
		}
		// 失败
		return ServerResponse.createByErrorMessage("修改失败");
	}

	/**
	 * 查询一条数据
	 */
	@Override
	public ServerResponse<ShopOrderGoods> findOne(Integer recId) {
		// 查询数据
		ShopOrderGoods shopOrderGoods = shopOrderGoodsMapper.findOne(recId);
		// 判断是否成功
		if (shopOrderGoods != null) {
			// 成功
			return ServerResponse.createBySuccess("一条订单商品数据", shopOrderGoods);
		}
		// 失败
		return ServerResponse.createByErrorMessage("查询失败");
	}

	/**
	 * 搜索数据并分页
	 */
	@Override
	public ServerResponse<LayuiEntity<ShopOrderGoods>> searchShopOrderGoods(Map<String, Object> map, int page,
			int limit) {
		// 实现分页
		PageHelper.startPage(page, limit);
		// 查询数据
		List<ShopOrderGoods> list = shopOrderGoodsMapper.searchShopOrderGoods(map);
		// 创建一个PageInfo对象,以便获取数据
		PageInfo<ShopOrderGoods> pageInfo = new PageInfo<>(list);
		// 创建LayuiEntity对象返回数据
		LayuiEntity<ShopOrderGoods> layuiEntity = new LayuiEntity<>();
		// 添加数据
		layuiEntity.setCode(0);// 0表示成功
		layuiEntity.setMsg("订单信息");
		layuiEntity.setCount(pageInfo.getTotal());// 获取数据总数
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess("订单数据", layuiEntity);
	}

}
