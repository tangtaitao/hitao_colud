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

import com.hzitxx.hitao.entity.ShopGoodsContent;
import com.hzitxx.hitao.service.shopgoods.ShopGoodsContentService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 商品内容控制层
 * @author wujun
 *
 */
@Controller
@RequestMapping("/shopGoodsContent")
@RestController
public class ShopGoodsContentController {
	@Autowired
	private ShopGoodsContentService service;

	/**
	 * 获取商品内容信息
	 * @return
	 */
	@GetMapping("/getPage")
	public ServerResponse<LayuiEntity<ShopGoodsContent>> getPage() {
		Map<String, Object> map = new HashMap<>();
		return service.selectShopGoodsContent(map);
	}
	
	/**
	 * 增加商品内容
	 * @param shopGoodsContent
	 * @return
	 */
	@PostMapping("/addShopGoodsContent")
	public ServerResponse<?> addShopGoodsContent(@RequestBody ShopGoodsContent shopGoodsContent){
		shopGoodsContent.setCreatedTime(new Date());
		return service.addShopGoodsContent(shopGoodsContent);
	}
	
	/**
	 * 编辑商品内容信息
	 * @param shopGoodsContent
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<?> updateById(@RequestBody ShopGoodsContent shopGoodsContent){
		shopGoodsContent.setUpdatedTime(new Date());
		return service.updateById(shopGoodsContent);
	}
	
	/**
	 * 根据id删除商品内容信息
	 * @param goodsId
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<?> deleteById(Integer goodsId){
		return service.deleteById(goodsId);
	}
}
