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

import com.hzitxx.hitao.entity.ShopBrand;
import com.hzitxx.hitao.service.shopgoods.ShopBrandService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 商品品牌控制层
 * 
 * @author wujun
 *
 */
@Controller
@RestController
@RequestMapping("/shopBrand")
public class ShopBrandController {

	@Autowired
	private ShopBrandService service;

	/**
	 * 获取商品品牌信息
	 * 
	 * @return
	 */
	@GetMapping("/getPage")
	public ServerResponse<LayuiEntity<ShopBrand>> getPage() {
		Map<String, Object> map = new HashMap<>();
		return service.selectShopBrand(map);
	}

	/**
	 * 增加商品品牌
	 * 
	 * @param shopBrand
	 * @return
	 */
	@PostMapping("/addShopBrand")
	public ServerResponse<?> addShopBrand(@RequestBody ShopBrand shopBrand) {
		shopBrand.setCreatedTime(new Date());
		return service.addShopBrand(shopBrand);
	}

	/**
	 * 编辑商品品牌信息
	 * 
	 * @param shopBrand
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<?> updateById(@RequestBody ShopBrand shopBrand) {
		shopBrand.setUpdatedTime(new Date());
		return service.updateById(shopBrand);
	}

	/**
	 * 根据id删除商品品牌信息
	 * 
	 * @param brandId
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<?> deleteById(Integer brandId) {
		return service.deleteById(brandId);
	}

	/**
	 * 根据id批量删除数据
	 * 
	 * @param ids
	 * @return
	 */
	@GetMapping("/deleteByIds")
	public ServerResponse<?> deleteByIds(String[] brandIds) {
		return service.deleteByIds(brandIds);
	}
}
