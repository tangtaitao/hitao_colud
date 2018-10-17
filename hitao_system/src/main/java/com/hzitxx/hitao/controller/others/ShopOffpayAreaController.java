package com.hzitxx.hitao.controller.others;

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

import com.hzitxx.hitao.entity.ShopOffpayArea;
import com.hzitxx.hitao.service.others.ShopOffpayAreaService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 货到付款地区控制层
 * @author wujun
 *
 */
@Controller
@RestController
@RequestMapping("/shopOffpayArea")
public class ShopOffpayAreaController {

	@Autowired
	private ShopOffpayAreaService service;

	/**
	 * 查询货到付款地区信息
	 * @return
	 */
	@GetMapping("/getPage")
	public ServerResponse<LayuiEntity<ShopOffpayArea>> getPage() {
		Map<String, Object> map = new HashMap<>();
		return service.selectShopOffpayArea(map);
	}
	
	/**
	 * 增加货到付款地区
	 * @param shopOffpayArea
	 * @return
	 */
	@PostMapping("/addShopOffpayArea")
	public ServerResponse<?> addShopOffpayArea(@RequestBody ShopOffpayArea shopOffpayArea) {
		shopOffpayArea.setCreatedTime(new Date());
		return service.addShopOffpayArea(shopOffpayArea);
	}

	/**
	 * 更新货到付款地区信息
	 * @param shopOffpayArea
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<?> updateById(@RequestBody ShopOffpayArea shopOffpayArea) {
		shopOffpayArea.setUpdatedTime(new Date());
		return service.updateById(shopOffpayArea);
	}
	
	/**
	 * 根据id删除货到付款地区
	 * @param goodsId
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<?> deleteById( String areaId) {
		return service.deleteById(areaId);
	}
	
}
