package com.hzitxx.hitao.mapper.member;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopArea;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopAreaTest {
	@Autowired
	private ShopAreaMapper mapper;
	/**
	 * 测试查询所有数据
	 */
	@Test
	public void selectAllTest() {
		Map<String,Object> map = new HashMap();
		System.out.println(mapper.selectAll(map));
	}
	/**
	 * 测试增加数据
	 */
	@Test
	public void addTest() {
		ShopArea shopArea = new ShopArea();
		shopArea.setAreaId(100001);
		shopArea.setAreaName("小海");
		shopArea.setAreaParentId(0);
		
		System.out.println(mapper.add(shopArea));
		//System.out.println(mapper.selectOne(100008));
	}
	/**
	 * 测试根据id查询数据
	 */
	@Test
	public void selectOneTest() {
		System.out.println(mapper.selectOne(110000));
	}
	/**
	 * 测试修改数据
	 */
	@Test
	public void updateById() {
		ShopArea shopArea = new ShopArea();
		shopArea.setAreaName("大海");
		shopArea.setAreaId(100009);
		System.out.println(mapper.updateById(shopArea));
	}
}
