package com.hzitxx.hitao.controller.shopgoods;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.ShopGoodsAttr;
import com.hzitxx.hitao.service.shopgoods.ShopGoodsAttrService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 商品属性控制层
 * 
 * @author wujun
 *
 */
@Controller
@RestController
@RequestMapping("/shopGoodsAttr")
public class ShopGoodsAttrController {
	@Autowired
	private ShopGoodsAttrService service;

	/**
	 * 获取商品属性信息
	 * @return
	 */
	@GetMapping("/getPage")
	public ServerResponse<LayuiEntity<ShopGoodsAttr>> getPage() {
		Map<String, Object> map = new HashMap<>();
		return service.selectShopGoodsAttr(map);
	}
	
	/**
	 * 增加商品属性
	 * @param shopGoodsAttr
	 * @return
	 */
	@PostMapping("/addShopGoodsAttr")
	public ServerResponse<?> addShopGoodsAttr(@RequestBody ShopGoodsAttr shopGoodsAttr){
		shopGoodsAttr.setCreatedTime(new Date());
		return service.addShopGoodsAttr(shopGoodsAttr);
	}
	
	/**
	 * 编辑商品属性信息
	 * @param shopGoodsAttr
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<?> updateById(@RequestBody ShopGoodsAttr shopGoodsAttr){
		shopGoodsAttr.setUpdatedTiime(new Date());
		return service.updateById(shopGoodsAttr);
	}
	
	/**
	 * 根据id删除商品属性信息
	 * @param goodsId
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<?> deleteById(Integer goodsId){
		return service.deleteById(goodsId);
	}
}
