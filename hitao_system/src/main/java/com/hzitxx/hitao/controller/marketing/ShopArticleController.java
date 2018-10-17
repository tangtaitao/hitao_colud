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
import com.hzitxx.hitao.entity.ShopArticle;
import com.hzitxx.hitao.service.marketing.ShopAdvService;
import com.hzitxx.hitao.service.marketing.ShopArticleService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 文章的controller层
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/shopArticle")
public class ShopArticleController {
	// 自动注入ShopAdvArticleservice对象
	@Autowired
	private ShopArticleService shopArticleService;

	/**
	 * 添加数据
	 * 
	 * @param shopArticle
	 * @return
	 */
	@PostMapping("/addShopArticle")
	public ServerResponse<Integer> addShopArticle(@RequestBody ShopArticle shopArticle) {
		// 添加数据
		ServerResponse<Integer> serverResponse = shopArticleService.addShopArticle(shopArticle);
		return serverResponse;

	}

	/**
	 * 根据订单id删除订单信息
	 * 
	 * @param articleId
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<Integer> deleteById(Integer articleId) {
		// 删除数据
		ServerResponse<Integer> serverResponse = shopArticleService.deleteById(articleId);
		return serverResponse;
	}

	/**
	 * 根据orderId修改信息
	 * 
	 * @param shopArticle
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<Integer> updateById(@RequestBody ShopArticle shopArticle) {
		// 修改信息
		ServerResponse<Integer> serverResponse = shopArticleService.updateById(shopArticle);
		return serverResponse;
	}

	/**
	 * 根据orderId查询数据
	 * 
	 * @param advId
	 * @return
	 */
	@GetMapping("/findOne")
	public ServerResponse<ShopArticle> findOne(Integer articleId) {
		// 查询一条数据
		ServerResponse<ShopArticle> serverResponse = shopArticleService.findOne(articleId);
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
	public ServerResponse<LayuiEntity<ShopArticle>> searchShopOrder(String value,
			@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "limit", defaultValue = "20") Integer limit) {
		Map<String, Object> map = new HashMap<>();
		ServerResponse<LayuiEntity<ShopArticle>> serverResponse = shopArticleService.searchShopArticle(map, page,
				limit);
		return serverResponse;
	}
}
