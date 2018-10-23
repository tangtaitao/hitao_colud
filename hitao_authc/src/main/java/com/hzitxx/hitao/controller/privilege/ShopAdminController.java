package com.hzitxx.hitao.controller.privilege;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzitxx.hitao.entity.ShopAdmin;
import com.hzitxx.hitao.service.privilege.ShopAdminService;
import com.hzitxx.hitao.utils.JwtTokenUtil;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

@Controller
@RequestMapping("/Administrator")
public class ShopAdminController {
	@Autowired
	private ShopAdminService service;

	// get提交方式
	@GetMapping("/page")
	@ResponseBody
	public ServerResponse<LayuiEntity<ShopAdmin>> page(String adminName, int page, int limit) {
		Map<String, Object> map = new HashMap<>();
		map.put("adminName", adminName);
		System.out.println(adminName);
		return service.LayuiEntity(map, page, limit);
	}

	@PostMapping("/addAdmin")
	@ResponseBody
	public ServerResponse<Integer> addAdmin(@RequestBody ShopAdmin shopAdmin) {
		return service.addAdmin(shopAdmin);
	}

	@PostMapping("/updateAdmin")
	@ResponseBody
	public ServerResponse<Integer> updateAdmin(@RequestBody ShopAdmin shopAdmin) {
		return service.updateAdmin(shopAdmin);
	}

	@GetMapping("/deleteAdmin")
	@ResponseBody
	public ServerResponse<Integer> deleteAdmin(Integer adminId) {
		return service.deleteAdmin(adminId);
	}

	@GetMapping("/inquire")
	@ResponseBody
	public ServerResponse<ShopAdmin> inquire(Integer adminId) {
		return service.findOne(adminId);
	}

	@PostMapping("/login")
	@ResponseBody
	public ServerResponse<Map<String, Object>> login(@RequestBody ShopAdmin shopAdmin) {
		return service.login(shopAdmin);
	}

	/**
	 * 批量删除
	 */
	@GetMapping("/removeBatch")
	@ResponseBody
	public ServerResponse<Integer> removeBatch(String adminIds) {
		String[] split = adminIds.split(",");
		ServerResponse<Integer> serverResponse = null;
		for (int i = 0; i < split.length; i++) {
			serverResponse = service.deleteAdmin(Integer.parseInt(split[i]));
		}
		return serverResponse;
	}

	/**
	 * 判断用户名是否存在
	 */
	@GetMapping("/checkExists")
	@ResponseBody
	public ServerResponse<Integer> checkExists(String adminName) {
		return service.checkExists(adminName);
	}

	/**
	 * 获取登录人的信息
	 */
	@GetMapping("/info")
	@ResponseBody
	public ServerResponse info(@RequestHeader("token") String token) {
		// 解析token获取登录人的id
		String adminId = JwtTokenUtil.getUserId(token);
		// 获取登录人的所有信息
		ServerResponse<ShopAdmin> findOne = service.findOne(Integer.parseInt(adminId));
		// 获取登录人对象
		ShopAdmin shopAdmin = findOne.getData();
		// 不显示密码
		shopAdmin.setAdminPassword(null);
		// 创建一个map集合返回信息
		Map<String, Object> map = new HashMap();
		// 把登录人信息添加进map中
		map.put("shopAdmin", shopAdmin);
		// 添加图片，先写死
		map.put("avatar",
				"https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=925993276,4023638545&fm=27&gp=0.jpg");
		// 添加角色，先写死
		List<String> roles = new ArrayList<>();
		roles.add("admin");
		map.put("roles", roles);
		// 添加权限，先写死
		List<Map<String, Object>> permissions = new ArrayList<>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("path", "/order");
		map2.put("component", "order/order");
		map2.put("name", "order");
		map2.put("meta", "{\\\"title\\\":\\\"order\\\",\\\"icon\\\":\\\"form\\\"}");
		List<Map<String, Object>> children = new ArrayList<>();
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("path", "order");
		map3.put("component", "order/order");
		map3.put("name", "order");
		map3.put("meta", "{\\\"title\\\":\\\"order\\\":\\\"noCache\\\":\\\"true\\\"}");
		map2.put("children", children);
		return ServerResponse.createBySuccess("登录人信息", map);
	}
	
	
}
