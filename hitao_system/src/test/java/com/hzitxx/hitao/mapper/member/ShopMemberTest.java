package com.hzitxx.hitao.mapper.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopMember;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SystemMicroService8083.class)

public class ShopMemberTest {
	@Autowired
	private ShopMemberMapper mapper;
	/**
	 * 测试查询
	 */
	@Test
	public void selectAllTest() {
		List<ShopMember> list = mapper.selectAll();
		//System.out.println(list.size());
		System.out.println(list);
	}
	/**
	 * 测试修改
	 */
	@Test
	public void updateTest() {
		ShopMember shopMember =new ShopMember();
		shopMember.setMemberName("易淼");
		shopMember.setMemberId(11);
		int result = mapper.updateShopMember(shopMember);
		System.out.println(result);
	}
	/**
	 * 测试删除
	 */
	@Test
	public void deleteByIdTest() {
		Map<String,Object> map = new HashMap();
		map.put("isDel", 1);
		map.put("memberId", 11);
		int result = mapper.deleteById(map);
		System.out.println(result);
	}
	
}
