package com.hzitxx.hitao.mapper.others;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopOffpayArea;

/**
 * 测试ShopOffpayAreaMapper
 * 
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopOffpayAreaTest {

	@Autowired
	private ShopOffpayAreaMapper mapper;

	/**
	 * 测试增加货到货款支持地区
	 */
	@Test
	public void testAddShopOffpayArea() {
		ShopOffpayArea shopOffpayArea = new ShopOffpayArea();
		shopOffpayArea.setAreaId("asd");
		shopOffpayArea.setIsDel(0);
		shopOffpayArea.setCreatedTime(new Date());
		int result = mapper.addShopOffpayArea(shopOffpayArea);
		System.out.println(result);
	}

	/**
	 * 测试货到货款支持地区
	 */
	@Test
	public void testSelectShopOffpayArea() {
		List<ShopOffpayArea> result = mapper.selectShopOffpayArea(null);
		System.out.println(result);
	}
	
	
	/**
	 * 测试根据id修改货到货款支持地区
	 */
	@Test
	public void testuUpdateById() {
		ShopOffpayArea shopOffpayArea = new ShopOffpayArea();
		shopOffpayArea.setAreaId("asd");
		shopOffpayArea.setCreatedTime(new Date());
		int result=mapper.updateById(shopOffpayArea);
		System.out.println(result);
	}
	
	/**
	 * 测试根据id货到货款支持地区
	 */
	@Test
	public void testDeleteById() {
		int result=mapper.deleteById("asd");
		System.out.println(result);
	}
}
