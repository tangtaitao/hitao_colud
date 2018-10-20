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

import com.alibaba.fastjson.JSON;
import com.hzitxx.hitao.entity.ShopGoodsAttrTemplate;
import com.hzitxx.hitao.service.shopgoods.ShopGoodsAttrTemplateService;
import com.hzitxx.hitao.utils.ServerResponse;
import com.hzitxx.hitao.utils.ShopCategoryUtils;

/**
 * 商品属性模板控制层
 * 
 * @author wujun
 *
 */
@RequestMapping("/shopGoodsAttrTemplate")
@RestController
@Controller
public class ShopGoodsAttrTemplateController {

	@Autowired
	private ShopGoodsAttrTemplateService service;

	/**
	 * 获取商品属性信息
	 * 
	 * @return
	 */
	@GetMapping("/getPage")
	public ServerResponse<String> getPage(ShopGoodsAttrTemplate shopGoodsAttrTemplate) {
		Map<String, Object> map = new HashMap<>();
		map.put("catId", shopGoodsAttrTemplate.getCatId());
		return service.selectShopGoodsAttrTemplate(map);
	}

	/**
	 * 编辑商品属性模板
	 * 
	 * @param shopGoodsAttrTemplate
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<?> updateById(@RequestBody ShopCategoryUtils shopCategoryUtils) {
		ShopGoodsAttrTemplate shopGoodsAttrTemplate=new ShopGoodsAttrTemplate();
		shopGoodsAttrTemplate.setCreatedTime(new Date());
		shopGoodsAttrTemplate.setCatId(Integer.parseInt(shopCategoryUtils.getCatId()));
		shopGoodsAttrTemplate.setAttrValue(JSON.toJSONString(shopCategoryUtils.getAttrTemp()));
		return service.updateById(shopGoodsAttrTemplate);
	}

	/**
	 * 增加商品属性模板信息
	 * 
	 * @param shopGoodsAttrTemplate
	 * @return
	 */
	@PostMapping("/addShopGoodsAttrTemplate")
	public ServerResponse<?> updateById(@RequestBody ShopGoodsAttrTemplate shopGoodsAttrTemplate) {
		shopGoodsAttrTemplate.setUpdatedTime(new Date());
		return service.addShopGoodsAttrTemplate(shopGoodsAttrTemplate);
	}

	/**
	 * 根据id删除商品属性模板信息
	 * 
	 * @param goodsId
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<?> deleteById(Integer goodsId) {
		return service.deleteById(goodsId);
	}
}
