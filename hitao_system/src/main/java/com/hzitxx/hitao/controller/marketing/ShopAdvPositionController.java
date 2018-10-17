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

import com.hzitxx.hitao.entity.ShopAdvPosition;
import com.hzitxx.hitao.service.marketing.ShopAdvPositionService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 广告位置的controller层
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/shopAdvPosition")
public class ShopAdvPositionController {
	// 自动注入ShopAdvPositionservice对象
	@Autowired
	private ShopAdvPositionService shopAdvPositionService;

	/**
	 * 添加数据
	 * 
	 * @param shopAdvPosition
	 * @return
	 */
	@PostMapping("/addShopAdvPosition")
	public ServerResponse<Integer> addShopAdvPosition(@RequestBody ShopAdvPosition shopAdvPosition) {
		// 添加数据
		ServerResponse<Integer> serverResponse = shopAdvPositionService.addShopAdvPosition(shopAdvPosition);
		return serverResponse;

	}

	/**
	 * 根据订单id删除订单信息
	 * 
	 * @param advId
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<Integer> deleteById(Integer apId) {
		// 删除数据
		ServerResponse<Integer> serverResponse = shopAdvPositionService.deleteById(apId);
		return serverResponse;
	}

	/**
	 * 根据orderId修改信息
	 * 
	 * @param shopAdv
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<Integer> updateById(@RequestBody ShopAdvPosition shopAdvPosition) {
		// 修改信息
		ServerResponse<Integer> serverResponse = shopAdvPositionService.updateById(shopAdvPosition);
		return serverResponse;
	}

	/**
	 * 根据orderId查询数据
	 * 
	 * @param advId
	 * @return
	 */
	@GetMapping("/findOne")
	public ServerResponse<ShopAdvPosition> findOne(Integer apId) {
		// 查询一条数据
		ServerResponse<ShopAdvPosition> serverResponse = shopAdvPositionService.findOne(apId);
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
	public ServerResponse<LayuiEntity<ShopAdvPosition>> searchShopOrder(String value,
			@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "limit", defaultValue = "20") Integer limit) {
		Map<String, Object> map = new HashMap<>();
		ServerResponse<LayuiEntity<ShopAdvPosition>> serverResponse = shopAdvPositionService.searchShopAdvPosition(map, page, limit);
		return serverResponse;
	}
}
