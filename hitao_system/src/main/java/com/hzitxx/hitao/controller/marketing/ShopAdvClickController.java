package com.hzitxx.hitao.controller.marketing;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.ShopAdvClick;
import com.hzitxx.hitao.service.marketing.ShopAdvClickService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 广告分类的controller层
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/shopAdvClick")
public class ShopAdvClickController {
	// 自动注入ShopAdvservice对象
	@Autowired
	private ShopAdvClickService shopAdvClickService;

	/**
	 * 添加数据
	 * 
	 * @param shopOrderClick
	 * @return
	 */
	@PostMapping("/addShopAdvClick")
	public ServerResponse<Integer> addShopAdvClick(@RequestBody ShopAdvClick shopAdvClick) {
		// 添加数据
		ServerResponse<Integer> serverResponse = shopAdvClickService.addShopAdvClick(shopAdvClick);
		return serverResponse;

	}

	/**
	 * 根据订单id删除订单信息
	 * 
	 * @param advId
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<Integer> deleteById(Integer advId) {
		// 删除数据
		ServerResponse<Integer> serverResponse = shopAdvClickService.deleteById(advId);
		return serverResponse;
	}

	/**
	 * 根据orderId修改信息
	 * 
	 * @param shopAdvClick
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<Integer> updateById(@RequestBody ShopAdvClick shopAdvClick) {
		// 修改信息
		ServerResponse<Integer> serverResponse = shopAdvClickService.updateById(shopAdvClick);
		return serverResponse;
	}

	/**
	 * 根据orderId查询数据
	 * 
	 * @param advId
	 * @return
	 */
	@GetMapping("/findOne")
	public ServerResponse<ShopAdvClick> findOne(Integer advId) {
		// 查询一条数据
		ServerResponse<ShopAdvClick> serverResponse = shopAdvClickService.findOne(advId);
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
	public ServerResponse<LayuiEntity<ShopAdvClick>> searchShopOrder(String value,
			@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "limit", defaultValue = "20") Integer limit) {
		Map<String, Object> map = new HashMap<>();
		ServerResponse<LayuiEntity<ShopAdvClick>> serverResponse = shopAdvClickService.searchShopAdvClick(map, page,
				limit);
		return serverResponse;
	}
}
