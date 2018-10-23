package com.hzitxx.hitao.service.member;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopMember;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopMemberTest {
	@Autowired
	private ShopMemberService service;
	@Test
	/**
	 * 测试查询所有数据
	 */
	public void selectAllTest() {
		//ShopMember shopMember = new ShopMember();
		System.out.println(service.selectAll());
	}
	@Test
	/**
	 * 增加数据
	 */
	public void insertShopMember() {
		ShopMember shopMember = new ShopMember();
		shopMember.setMemberName("吃饭");
		System.out.println(service.insertShopMember(shopMember));
	}
	/**
	 * 测试分页查询
	 */
	@Test
	public void page() {
		Map<String,Object> map = new HashMap();
		//map.put(memberName, value)
		System.out.println(service.page(1, 10, null));
	}
	/**
	 * 测试根据id逻辑删除
	 */
	@Test
	public void  deleteByIdTest() {
		Map<String,Object> map = new HashMap();
		map.put("isDel", 1);
		map.put("memberId", 11);
		System.out.println(service.deleteById(map));
	}
}
