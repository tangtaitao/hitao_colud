package com.hzitxx.hitao.controller.shopgoods;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.ShopGoodsCategory;
import com.hzitxx.hitao.service.shopgoods.ShopGoodsCategoryService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 商品分类控制表
 * @author wujun
 *
 */
@Controller
@RestController
@RequestMapping("/shopGoodsCategory")
public class ShopGoodsCategoryController {
	@Autowired
	private ShopGoodsCategoryService service;

	/**
	 * 获取商品分类信息
	 * @return
	 */
	@GetMapping("/getPage")
	public ServerResponse<LayuiEntity<ShopGoodsCategory>> getPage() {
		Map<String, Object> map = new HashMap<>();
		return service.selectShopGoodsCategory(map);
	}
	
	
	/**
	 * 根据父id查询
	 * @return
	 */
	@GetMapping("/findByPId")
	public ServerResponse<List<ShopGoodsCategory>> findByPId(Integer pId) {
		Map<String, Object> map = new HashMap<>();
		map.put("parentId", pId);
		return service.findByPId(map);
	}
	/**
	 * 增加商品分类
	 * @param shopGoodsCategory
	 * @return
	 */
	@PostMapping("/addShopGoodsCategory")
	public ServerResponse<?> addShopGoodsCategory(@RequestBody ShopGoodsCategory shopGoodsCategory){
		shopGoodsCategory.setCreatedTime(new Date());
		return service.addShopGoodsCategory(shopGoodsCategory);
	}
	
	/**
	 * 编辑商品分来信息
	 * @param shopGoodsCategory
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<?> updateById(@RequestBody ShopGoodsCategory shopGoodsCategory){
		shopGoodsCategory.setUpdatedTime(new Date());
		return service.updateById(shopGoodsCategory);
	}
	
	/**
	 * 根据id删除商品分类信息
	 * @param catId
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<?> deleteById(Integer catId){
		return service.deleteById(catId);
	}
}
