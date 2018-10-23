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

import com.hzitxx.hitao.entity.ShopMember;
import com.hzitxx.hitao.service.member.ShopMemberService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;
@RequestMapping("/shopMember")
@Controller
public class ShopMemberController {
	@Autowired
	private ShopMemberService service;
	/**
	 * 查询分页数据
	 */
	@GetMapping("/main")
	@ResponseBody
	public ServerResponse<LayuiEntity<ShopMember>> main(@RequestParam(value = "page", defaultValue = "1")int page,@RequestParam(value="limit",defaultValue="10")int limit) {
		System.out.println(service.page(page, limit, null));
		return service.page(page, limit, null);
	}
	/**
	 * 查询所有数据
	 */
	@GetMapping("/main1")
	@ResponseBody
	public ServerResponse<ShopMember> main1() {
		 ServerResponse<ShopMember> sr = service.selectAll();
		 System.out.println(sr);
		return sr;
	}
	/**
	 * 增加数据
	 */
	@PostMapping("/main2")
	@ResponseBody
	public ServerResponse<ShopMember> main2(@RequestBody ShopMember shopMember) {
//		shopMember.setMemberName("大王");
//		shopMember.setMemberTruename("最大");
		ServerResponse<ShopMember> list = service.insertShopMember(shopMember);
		return list;
	}
	/**
	 * 修改数据
	 */
	@PostMapping("/main3")
	@ResponseBody
	public ServerResponse<ShopMember> main3(@RequestBody ShopMember shopMember){
		
//		shopMember.setMemberId(37);
//		shopMember.setMemberName("小王");
		return service.updateShopMember(shopMember);
	}
	/**
	 * 根据id逻辑删除数据
	 */
	@GetMapping("/deleteById")
	@ResponseBody
	public ServerResponse deleteById(int memberId,int isDel) {
		Map<String,Object> map = new HashMap();
		map.put("isDel", isDel);
		map.put("memberId", memberId);
		return service.deleteById(map);
	}
}
