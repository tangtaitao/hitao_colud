package com.hzitxx.hitao.controller.privilege;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzitxx.hitao.entity.ShopAdmin;
import com.hzitxx.hitao.service.privilege.ShopAdminService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

@Controller
@RequestMapping("/Administrator")
public class ShopAdminController {
	@Autowired
	private ShopAdminService service;
	//post提交方式
	@GetMapping("/page")
	@ResponseBody
	public ServerResponse<LayuiEntity<ShopAdmin>> page(int page,int limit){
		return service.LayuiEntity(page, limit);
	}
	@PostMapping("/addAdmin")
	@ResponseBody
	public ServerResponse<Integer> addAdmin(@RequestBody ShopAdmin shopAdmin){
		return service.addAdmin(shopAdmin);
	}
	@PostMapping("/updateAdmin")
	@ResponseBody
	public ServerResponse<Integer> updateAdmin(@RequestBody ShopAdmin shopAdmin){
		return service.updateAdmin(shopAdmin);
	}
	@GetMapping("/deleteAdmin")
	@ResponseBody
	public ServerResponse<Integer> deleteAdmin(Integer adminId){
		return service.deleteAdmin(adminId);
	}
	@GetMapping("/inquire")
	@ResponseBody
	public ServerResponse<List<ShopAdmin>> inquire(Integer adminId){
		return service.findOne(adminId);
	}
	@PostMapping("/login")
	@ResponseBody
	public ServerResponse<Map<String,Object>> login(@RequestBody ShopAdmin shopAdmin){
		System.out.println(shopAdmin);
		return service.login(shopAdmin);
		
	}
}
