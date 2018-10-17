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

import com.hzitxx.hitao.entity.ShopAdv;
import com.hzitxx.hitao.service.marketing.ShopAdvService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 广告的controller层
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/shopAdv")
public class ShopAdvController {
	// 自动注入ShopAdvservice对象
	@Autowired
	private ShopAdvService shopAdvService;

	/**
	 * 添加数据
	 * 
	 * @param shopOrder
	 * @return
	 */
	@PostMapping("/addShopAdv")
	public ServerResponse<Integer> addShopAdv(@RequestBody ShopAdv shopAdv) {
		// 添加数据
		ServerResponse<Integer> serverResponse = shopAdvService.addShopAdv(shopAdv);
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
		ServerResponse<Integer> serverResponse = shopAdvService.deleteById(advId);
		return serverResponse;
	}

	/**
	 * 根据orderId修改信息
	 * 
	 * @param shopAdv
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<Integer> updateById(@RequestBody ShopAdv shopAdv) {
		// 修改信息
		ServerResponse<Integer> serverResponse = shopAdvService.updateById(shopAdv);
		return serverResponse;
	}

	/**
	 * 根据orderId查询数据
	 * 
	 * @param advId
	 * @return
	 */
	@GetMapping("/findOne")
	public ServerResponse<ShopAdv> findOne(Integer advId) {
		// 查询一条数据
		ServerResponse<ShopAdv> serverResponse = shopAdvService.findOne(advId);
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
	public ServerResponse<LayuiEntity<ShopAdv>> searchShopOrder(String value,
			@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "limit", defaultValue = "20") Integer limit) {
		Map<String, Object> map = new HashMap<>();
		ServerResponse<LayuiEntity<ShopAdv>> serverResponse = shopAdvService.searchShopAdv(map, page, limit);
		return serverResponse;
	}
}
