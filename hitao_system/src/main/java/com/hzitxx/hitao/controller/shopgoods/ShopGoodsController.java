package com.hzitxx.hitao.controller.shopgoods;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 * ShopGoods控制层
 * @author wujun
 *
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.ShopGoods;
import com.hzitxx.hitao.service.shopgoods.ShopGoodsService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 商品控制层
 * @author wujun
 *
 */
@Controller
@RestController
@RequestMapping("/shopGoods")
public class ShopGoodsController {

	@Autowired
	private ShopGoodsService service;

	/**
	 * 分页查询goods信息
	 * @param page
	 * @param limit
	 * @return
	 */
	@GetMapping("/getPage")
	public ServerResponse<LayuiEntity<ShopGoods>> getPage(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "10") int limit,ShopGoods shopGoods) {
		Map<String, Object> map = new HashMap<>();
		map.put("goodsId", shopGoods.getGoodsId());
		return service.selectShopGoods(page, limit, map);
	}
	
	/**
	 * 增加goods
	 * @param goods
	 * @return
	 */
	@PostMapping("/addShopGoods")
	public ServerResponse<?> addShopGoods(@RequestBody ShopGoods goods) {
		goods.setCreatedTime(new Date());
		return service.addShopGoods(goods);
	}

	/**
	 * 更新goods信息
	 * @param goods
	 * @return
	 */
	@PostMapping("/updateShopGoods")
	public ServerResponse<?> updateShopGoods(@RequestBody ShopGoods goods) {
		goods.setUpdatedTime(new Date());
		return service.updateShopGoods(goods);
	}
	
	/**
	 * 根据id删除
	 * @param goodsId
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<?> deleteById( Integer goodsId) {
		return service.deleteById(goodsId);
	}
	
}
