package com.hzitxx.hitao.controller.others;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.ShopSetting;
import com.hzitxx.hitao.service.others.ShopSettingService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

@Controller
@RestController
@RequestMapping("/shopSetting")
public class ShopSettingController {
	@Autowired
	private ShopSettingService service;

	/**
	 * 获取系统设置
	 * @return
	 */
	@GetMapping("/getPage")
	public ServerResponse<LayuiEntity<ShopSetting>> getPage() {
		Map<String, Object> map = new HashMap<>();
		return service.selectShopSetting(map);
	}
	
	/**
	 * 增加系统设置
	 * @param shopSetting
	 * @return
	 */
	@PostMapping("/addShopSetting")
	public ServerResponse<?> addShopSetting(@RequestBody ShopSetting shopSetting){
		return service.addShopSetting(shopSetting);
	}
	
	/**
	 * 编辑系统设置
	 * @param shopSetting
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<?> updateById(@RequestBody ShopSetting shopSetting){
		return service.updateById(shopSetting);
	}
	
	/**
	 * 根据id删除系统设置
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<?> deleteById(Integer id){
		return service.deleteById(id);
	}
}
