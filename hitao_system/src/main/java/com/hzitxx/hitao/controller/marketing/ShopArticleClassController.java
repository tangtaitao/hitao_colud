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

import com.hzitxx.hitao.entity.ShopArticleClass;
import com.hzitxx.hitao.service.marketing.ShopArticleClassService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 文章分类的controller层
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/shopArticleClass")
public class ShopArticleClassController {
	// 自动注入ShopAdvArticleservice对象
	@Autowired
	private ShopArticleClassService shopArticleClassService;

	/**
	 * 添加数据
	 * 
	 * @param shopArticleClass
	 * @return
	 */
	@PostMapping("/addShopArticleClass")
	public ServerResponse<Integer> addShopArticle(@RequestBody ShopArticleClass shopArticleClass) {
		// 添加数据
		ServerResponse<Integer> serverResponse = shopArticleClassService.addShopArticleClass(shopArticleClass);
		return serverResponse;

	}

	/**
	 * 根据订单id删除订单信息
	 * 
	 * @param articleId
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<Integer> deleteById(Integer acId) {
		// 删除数据
		ServerResponse<Integer> serverResponse = shopArticleClassService.deleteById(acId);
		return serverResponse;
	}

	/**
	 * 根据orderId修改信息
	 * 
	 * @param shopArticle
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<Integer> updateById(@RequestBody ShopArticleClass shopArticleClass) {
		// 修改信息
		ServerResponse<Integer> serverResponse = shopArticleClassService.updateById(shopArticleClass);
		return serverResponse;
	}

	/**
	 * 根据orderId查询数据
	 * 
	 * @param advId
	 * @return
	 */
	@GetMapping("/findOne")
	public ServerResponse<ShopArticleClass> findOne(Integer acId) {
		// 查询一条数据
		ServerResponse<ShopArticleClass> serverResponse = shopArticleClassService.findOne(acId);
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
	public ServerResponse<LayuiEntity<ShopArticleClass>> searchShopOrder(String value,
			@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "limit", defaultValue = "20") Integer limit) {
		Map<String, Object> map = new HashMap<>();
		ServerResponse<LayuiEntity<ShopArticleClass>> serverResponse = shopArticleClassService
				.searchShopArticleClass(map, page, limit);
		return serverResponse;
	}
}
