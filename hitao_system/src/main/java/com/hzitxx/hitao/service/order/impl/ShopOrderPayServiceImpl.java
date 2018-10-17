package com.hzitxx.hitao.service.order.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopOrder;
import com.hzitxx.hitao.entity.ShopOrderPay;
import com.hzitxx.hitao.mapper.order.ShopOrderPayMapper;
import com.hzitxx.hitao.service.order.ShopOrderPayService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

@Service
public class ShopOrderPayServiceImpl implements ShopOrderPayService {
	// 自动注入ShopOrderPayservice对象
	@Autowired
	private ShopOrderPayMapper shopOrderPayMapper;

	/**
	 * 添加一条数据
	 */
	@Override
	public ServerResponse<Integer> addShopOrderPay(ShopOrderPay shopOrderPay) {
		// 添加数据
		int i = shopOrderPayMapper.addShopOrderPay(shopOrderPay);
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
	public ServerResponse<Integer> deleteById(Integer payId) {
		// 删除数据
		int i = shopOrderPayMapper.deleteById(payId);
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
	public ServerResponse<Integer> updateById(ShopOrderPay shopOrderPay) {
		// 修改数据
		int i = shopOrderPayMapper.updateById(shopOrderPay);
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
	public ServerResponse<ShopOrderPay> findOne(Integer payId) {
		// 查询数据
		ShopOrderPay shopOrderPay = shopOrderPayMapper.findOne(payId);
		// 判断是否成功
		if (shopOrderPay != null) {
			// 成功
			return ServerResponse.createBySuccess("一条订单支付数据", shopOrderPay);
		}
		// 失败
		return ServerResponse.createByErrorMessage("查询失败");
	}

	/**
	 * 搜索数据并分页
	 */
	@Override
	public ServerResponse<LayuiEntity<ShopOrderPay>> searchShopOrderPay(Map<String, Object> map, int page, int limit) {
		// 实现分页
		PageHelper.startPage(page, limit);
		// 查询数据
		List<ShopOrderPay> list = shopOrderPayMapper.searchShopOrderPay(map);
		// 创建一个PageInfo对象,以便获取数据
		PageInfo<ShopOrderPay> pageInfo = new PageInfo<>(list);
		// 创建LayuiEntity对象返回数据
		LayuiEntity<ShopOrderPay> layuiEntity = new LayuiEntity<>();
		// 添加数据
		layuiEntity.setCode(0);// 0表示成功
		layuiEntity.setMsg("订单信息");
		layuiEntity.setCount(pageInfo.getTotal());// 获取数据总数
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess("订单数据", layuiEntity);
	}
}
