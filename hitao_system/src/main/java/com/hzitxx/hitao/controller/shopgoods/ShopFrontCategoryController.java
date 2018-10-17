package com.hzitxx.hitao.controller.shopgoods;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.ShopFrontCategory;
import com.hzitxx.hitao.service.shopgoods.ShopFrontCategoryService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

@Controller
@RestController
@RequestMapping("/shopFrontCategory")
public class ShopFrontCategoryController {
	@Autowired
	private ShopFrontCategoryService service;

	/**
	 * 分页查询类目信息
	 * @param page
	 * @param limit
	 * @return
	 */
	@GetMapping("/getPage")
	public ServerResponse<LayuiEntity<ShopFrontCategory>> getPage(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "10") int limit) {
		Map<String, Object> map = new HashMap<>();
		return service.selectShopFrontCategory(page, limit, map);
	}
	
	/**
	 * 增加类目
	 * @param shopFrontCategory
	 * @return
	 */
	@PostMapping("/addShopFrontCategory")
	public ServerResponse<?> addShopFrontCategory(@RequestBody ShopFrontCategory shopFrontCategory) {
		return service.addShopFrontCategory(shopFrontCategory);
	}

	/**
	 * 更新类目信息
	 * @param shopFrontCategory
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<?> updateById(@RequestBody ShopFrontCategory shopFrontCategory) {
		return service.updateById(shopFrontCategory);
	}
	
	/**
	 * 根据id删除
	 * @param frontCatId
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<?> deleteById( Integer frontCatId) {
		return service.deleteById(frontCatId);
	}
	
}
