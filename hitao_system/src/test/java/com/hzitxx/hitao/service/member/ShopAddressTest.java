package com.hzitxx.hitao.service.member;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopAddress;

import com.hzitxx.hitao.utils.ServerResponse;
@RunWith(SpringRunner.class)
@SpringBootTest
@Service
public class ShopAddressTest {
	@Autowired
	private ShopAddressService service;
	/**
	 * 测试查询所有数据
	 */
	@Test
	public void selectAllTest() {
		Map<String,Object> map =new HashMap();
		System.out.println(service.selectAll(map));
	}
	/**
	 * 测试增加数据
	 */
	@Test
	public void insertTest() {
		ShopAddress shopAddress = new ShopAddress();
		shopAddress.setMemberId(6666);
		ServerResponse<ShopAddress> serverResponse = service.insert(shopAddress);
		System.out.println(serverResponse);
	}
	/**
	 * 测试修改数据
	 */
	@Test
	public void updateByIdTest() {
		ShopAddress shopAddress = new ShopAddress();
		shopAddress.setId(25);
		shopAddress.setMemberName("妈卖批");
		ServerResponse<ShopAddress> msg = service.updateById(shopAddress);
		System.out.println(msg);
	}
	/**
	 * 测试删除数据
	 */
	@Test
	public void deleteByIdTest() {
		ServerResponse<ShopAddress> msg = service.deleteById(24);
		System.out.println(msg);
	}
	/**
	 * 测试分页查询
	 */
	@Test
	public void pageTest() {
		//Map<String,Object> map = new HashMap();
		System.out.println(service.page(1, 10, null));
	}
	
}
