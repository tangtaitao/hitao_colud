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

import com.hzitxx.hitao.entity.ShopAddress;
import com.hzitxx.hitao.service.member.ShopAddressService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

@Controller
@RequestMapping("/shopAddress")
public class ShopAddressController {
	@Autowired
	private ShopAddressService service;
	/**
	 * 分页查询数据
	 */
	@GetMapping("/page")
	@ResponseBody
	public ServerResponse<LayuiEntity<ShopAddress>> page(@RequestParam(value="page",defaultValue="1") int page,
			@RequestParam(value="limit",defaultValue="10") int limit,String searchParam,String searchValue) {
		Map<String,Object> map = new HashMap();
		
		if("memberId".equals(searchParam)){
			map.put("memberId", searchValue);
			System.out.println(map.get("memberId"));
		}else {
			map.put("memberName", searchValue);
		}
		return service.page(page, limit, map);
	}
	/**
	 * 根据会员编号或者收货人查询数据
	 */
	@GetMapping("/select")
	@ResponseBody
	public ServerResponse select(Object searchParam,Object searchValue) {
		
		Map<String,Object> map = new HashMap();
		if(searchParam.equals("memberId")) {
			map.put("memberId", searchValue);
		}else {
			map.put("memberName", searchValue);
		}
		return service.select(map);
	}
	/**
	 * 增加数据
	 */
	@PostMapping("/add")
	@ResponseBody
	public ServerResponse<ShopAddress> add(@RequestBody ShopAddress shopAddress){
		return service.insert(shopAddress);
	}
	/**
	 * 修改数据
	 */
	@PostMapping("/updateById")
	@ResponseBody
	public ServerResponse<ShopAddress> update(@RequestBody ShopAddress shopAddress){
		return service.updateById(shopAddress);
	}
	/**
	 * 删除数据
	 */
	@PostMapping("/delete")
	@ResponseBody
	public ServerResponse<ShopAddress> delete(int id){
		return service.deleteById(id);
	}
}
