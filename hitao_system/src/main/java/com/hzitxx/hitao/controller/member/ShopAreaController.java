package com.hzitxx.hitao.controller.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzitxx.hitao.entity.ShopArea;
import com.hzitxx.hitao.service.member.ShopAreaService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

@Controller
@RequestMapping("/shopArea")
public class ShopAreaController {
	@Autowired
	private ShopAreaService service;
	/**
	 * 查询所有数据
	 */
//	@GetMapping("selectAll")
//	@ResponseBody
//	public ServerResponse<ShopArea> selectAll() {
//		return service.selectAll();
//	}
	/**
	 * 分页查询
	 */
	@GetMapping("/page")
	@ResponseBody
	public ServerResponse<LayuiEntity<ShopArea>> page(@RequestParam(value="page",defaultValue="1") int page,
			@RequestParam(value="limit",defaultValue="10") int limit,String searchParam,String searchValue){
		Map<String,Object> map = new HashMap();
		if("1".equals(searchParam)) {
			map.put("areaDeep", 1);
			map.put("areaName", searchValue);
		}else if("2".equals(searchParam)){
			map.put("areaDeep", 2);
			map.put("areaName", searchValue);
		}else if("3".equals(searchParam)){
			map.put("areaDeep", 3);
			map.put("areaName", searchValue);
		}
		
		return service.page(page, limit, map);
	}
	/**
	 * 根据id查询数据
	 */
	@GetMapping("/findOne")
	@ResponseBody
	public ServerResponse<ShopArea> selectOne(int areaId){
		return service.selectOne(areaId);
	}
	/**
	 * 增加数据
	 */
	@PostMapping("/add")
	@ResponseBody
	public ServerResponse<ShopArea> add(@RequestBody ShopArea shopArea){
		return service.add(shopArea);
	}
	/**
	 * 根据id修改数据
	 */
	@PostMapping("/updateById")
	@ResponseBody
	public ServerResponse<ShopArea> updateById(@RequestBody ShopArea shopArea){
		return service.updateById(shopArea);
	}
	/**
	 * 根据区域名称查询父级区域
	 */
	@GetMapping("/findShopArea")
	@ResponseBody
	public ServerResponse findShopArea(String areaName) {
		return service.findShopArea(areaName);
	}
	/**
	 * 根据id逻辑删除数据
	 */
	@PostMapping("/delete")
	@ResponseBody
	public ServerResponse<ShopArea> delete(@RequestBody ShopArea shopArea){
		return service.delete(shopArea);
	}
}
