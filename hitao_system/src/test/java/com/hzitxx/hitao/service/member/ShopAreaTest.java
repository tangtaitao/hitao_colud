package com.hzitxx.hitao.service.member;


import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopArea;



@RunWith(SpringRunner.class)
@SpringBootTest
@Service
public class ShopAreaTest {
	@Autowired
	private ShopAreaService service;
	/**
	 * 测试查询所有数据
	 */
	@Test
	public void selectAllTest() {
		Map<String,Object> map = new HashMap();
		System.out.println(service.selectAll(map));
	}
	/**
	 * 测试根据ID查询数据
	 */
	@Test
	public void selectOne() {
		System.out.println(service.selectOne(110000));
	}
	/**
	 * 测试增加数据
	 */
	@Test
	public void addTest() {
		ShopArea shopArea = new ShopArea();
		shopArea.setAreaId(1100);
		shopArea.setAreaName("LPL");
		//shopAres.setAreaSort("");
		System.out.println(service.add(shopArea));
	}
	/**
	 * 测试根据id修改数据
	 */
	@Test
	public void updateByIdTest() {
		ShopArea shopArea = new ShopArea();
		shopArea.setAreaId(100009);
		shopArea.setAreaName("王八");
		System.out.println(service.updateById(shopArea));
	}
	/**
	 * 测试分页查询
	 */
	@Test
	public void pageTest() {
		System.out.println(service.page(1, 10, null));
	}
}
