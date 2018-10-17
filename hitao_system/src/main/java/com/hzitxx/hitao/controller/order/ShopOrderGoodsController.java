package com.hzitxx.hitao.controller.order;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.ShopOrderGoods;
import com.hzitxx.hitao.service.order.ShopOrderGoodsService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 订单商品的controller层
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/shopOrderGoods")
public class ShopOrderGoodsController {
	// 自动注入ShopOrderservice对象
	@Autowired
	private ShopOrderGoodsService shopOrderGoodsService;

	/**
	 * 添加数据
	 * 
	 * @param shopOrder
	 * @return
	 */
	@PostMapping("/addShopOrderGoods")
	public ServerResponse<Integer> addShopOrderGoods(@RequestBody ShopOrderGoods shopOrderGoods) {
		// 设置创建时间
		shopOrderGoods.setCreatedTime(new Date());
		// 添加数据
		ServerResponse<Integer> serverResponse = shopOrderGoodsService.addShopOrderGoods(shopOrderGoods);
		return serverResponse;

	}

	/**
	 * 根据订单id删除订单信息
	 * 
	 * @param recId
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<Integer> deleteById(Integer recId) {
		// 删除数据
		ServerResponse<Integer> serverResponse = shopOrderGoodsService.deleteById(recId);
		return serverResponse;
	}

	/**
	 * 根据orderId修改信息
	 * 
	 * @param shopOrder
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<Integer> updateById(@RequestBody ShopOrderGoods shopOrderGoods) {
		// 设置修改时间
		shopOrderGoods.setUpdatedTime(new Date());
		// 修改信息
		ServerResponse<Integer> serverResponse = shopOrderGoodsService.updateById(shopOrderGoods);
		return serverResponse;
	}

	/**
	 * 根据orderId查询数据
	 * 
	 * @param orderId
	 * @return
	 */
	@GetMapping("/findOne")
	public ServerResponse<ShopOrderGoods> findOne(Integer recId) {
		// 查询一条数据
		ServerResponse<ShopOrderGoods> serverResponse = shopOrderGoodsService.findOne(recId);
		return serverResponse;
	}

	/**
	 * 获取所有数据及分页
	 * 
	 * @param page
	 * @param limit
	 * @return
	 */
	@GetMapping("/page")
	public ServerResponse<LayuiEntity<ShopOrderGoods>> searchShopOrder(String value,
			@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "limit", defaultValue = "20") Integer limit) {
		Map<String, Object> map = new HashMap<>();
		ServerResponse<LayuiEntity<ShopOrderGoods>> serverResponse = shopOrderGoodsService.searchShopOrderGoods(map,
				page, limit);
		return serverResponse;
	}
}
