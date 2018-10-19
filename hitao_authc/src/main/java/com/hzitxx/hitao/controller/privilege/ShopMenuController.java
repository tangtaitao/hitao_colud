package com.hzitxx.hitao.controller.privilege;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzitxx.hitao.entity.ShopMenu;
import com.hzitxx.hitao.service.privilege.ShopMenuService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;
import com.hzitxx.hitao.utils.TreeDataUtil;

@Controller
@RequestMapping("/Menu")
public class ShopMenuController {
	@Autowired
	private ShopMenuService service;

	@GetMapping("/page")
	@ResponseBody
	public ServerResponse<LayuiEntity<ShopMenu>> page(int page, int limit) {
		return service.LayuiEntity(page, limit);
	}

	@GetMapping("/inquire")
	@ResponseBody
	public ServerResponse<List<ShopMenu>> inquire(Integer id) {
		return service.findOne(id);
	}

	@PostMapping("/addMenu")
	@ResponseBody
	public ServerResponse<Integer> addMenu(ShopMenu shopMenu) {
		return service.addMenu(shopMenu);
	}

	@PostMapping("/updateMenu")
	@ResponseBody
	public ServerResponse<Integer> updateMenu(ShopMenu shopMenu) {
		return service.updateMenu(shopMenu);
	}

	@PostMapping("/deleteMenu")
	@ResponseBody
	public ServerResponse<Integer> deleteMenu(Integer id) {
		return service.deleteMenu(id);
	}

	/**
	 * 获取树状数据
	 */
	@GetMapping("/menuTreeData")
	@ResponseBody
	public ServerResponse<List<TreeDataUtil>> menuTreeData() {
		return service.menuTreeData();
	}

}
