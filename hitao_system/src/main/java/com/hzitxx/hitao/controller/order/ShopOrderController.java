package com.hzitxx.hitao.controller.order;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.ShopOrder;
import com.hzitxx.hitao.service.order.ShopOrderService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;
import com.mysql.fabric.Server;

/**
 * 订单的controller层
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/shopOrder")
public class ShopOrderController {
	// 自动注入ShopOrderservice对象
	@Autowired
	private ShopOrderService shopOrderService;

	/**
	 * 添加数据
	 * 
	 * @param shopOrder
	 * @return
	 */
	@PostMapping("/addShopOrder")
	public ServerResponse<Integer> addShopOrder(@RequestBody ShopOrder shopOrder) {
		// 设置创建时间
		shopOrder.setCreatedTime(new Date());
		// 添加数据
		ServerResponse<Integer> serverResponse = shopOrderService.addShopOrder(shopOrder);
		return serverResponse;

	}

	/**
	 * 根据订单id删除订单信息
	 * 
	 * @param orderId
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<Integer> deleteById(Integer orderId) {
		// 删除数据
		ServerResponse<Integer> serverResponse = shopOrderService.deleteById(orderId);
		return serverResponse;
	}

	/**
	 * 根据orderId修改信息
	 * 
	 * @param shopOrder
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<Integer> updateById(@RequestBody ShopOrder shopOrder) {
		// 设置修改时间
		shopOrder.setUpdatedTime(new Date());
		// 修改信息
		ServerResponse<Integer> serverResponse = shopOrderService.updateById(shopOrder);
		return serverResponse;
	}

	/**
	 * 根据orderId查询数据
	 * 
	 * @param orderId
	 * @return
	 */
	@GetMapping("/findOne")
	public ServerResponse<ShopOrder> findOne(Integer orderId) {
		// 查询一条数据
		ServerResponse<ShopOrder> serverResponse = shopOrderService.findOne(orderId);
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
	public ServerResponse<LayuiEntity<ShopOrder>> searchShopOrder(String value,
			@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "limit", defaultValue = "20") Integer limit) {
		Map<String, Object> map = new HashMap<>();
		ServerResponse<LayuiEntity<ShopOrder>> serverResponse = shopOrderService.searchShopOrder(map, page, limit);
		return serverResponse;
	}
}
