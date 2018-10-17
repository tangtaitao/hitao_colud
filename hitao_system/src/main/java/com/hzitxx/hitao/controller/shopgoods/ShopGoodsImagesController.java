package com.hzitxx.hitao.controller.shopgoods;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.ShopGoodsImages;
import com.hzitxx.hitao.service.shopgoods.ShopGoodsImagesService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 商品图片控制层
 * @author wujun
 *
 */
@Controller
@RestController
@RequestMapping("/shopGoodsImages")
public class ShopGoodsImagesController {
	@Autowired
	private ShopGoodsImagesService service;

	/**
	 * 获取商品图片信息
	 * @return
	 */
	@GetMapping("/getPage")
	public ServerResponse<LayuiEntity<ShopGoodsImages>> getPage() {
		Map<String, Object> map = new HashMap<>();
		return service.selectShopGoodsImages(map);
	}
	
	/**
	 * 增加商品图片
	 * @param shopGoodsImages
	 * @return
	 */
	@PostMapping("/addShopGoodsImages")
	public ServerResponse<?> addShopGoodsImages(@RequestBody ShopGoodsImages shopGoodsImages){
		return service.addShopGoodsImages(shopGoodsImages);
	}
	
	/**
	 * 编辑商品属性图片
	 * @param shopGoodsImages
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<?> updateById(@RequestBody ShopGoodsImages shopGoodsImages){
		return service.updateById(shopGoodsImages);
	}
	
	/**
	 * 根据id删除商品图片信息
	 * @param goodsImageId
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<?> deleteById(Integer goodsImageId){
		return service.deleteById(goodsImageId);
	}
}
