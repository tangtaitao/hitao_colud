package com.hzitxx.hitao.service.others;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopOffpayArea;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopOffpayAreaService
 * 
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopOffpayAreaServiceTest {

	@Autowired
	private ShopOffpayAreaService service;

	/**
	 * 测试增加货到货款支持地区
	 */
	@Test
	public void testAddShopOffpayArea() {
		ShopOffpayArea shopOffpayArea = new ShopOffpayArea();
		shopOffpayArea.setAreaId("wjd");
		shopOffpayArea.setIsDel(0);
		shopOffpayArea.setCreatedTime(new Date());
		ServerResponse<?> result = service.addShopOffpayArea(shopOffpayArea);
		System.out.println(result.getMsg());
	}

	/**
	 * 测试货到货款支持地区
	 */
	@Test
	public void testSelectShopOffpayArea() {
		ServerResponse<LayuiEntity<ShopOffpayArea>> result = service.selectShopOffpayArea(null);
		System.out.println(result.getData().getData());
	}
	
	
	/**
	 * 测试根据id修改货到货款支持地区
	 */
	@Test
	public void testuUpdateById() {
		ShopOffpayArea shopOffpayArea = new ShopOffpayArea();
		shopOffpayArea.setAreaId("asd");
		shopOffpayArea.setCreatedTime(new Date());
		ServerResponse<?> result=service.updateById(shopOffpayArea);
		System.out.println(result.getMsg());
	}
	
	/**
	 * 测试根据id货到货款支持地区
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<?> result=service.deleteById("asd");
		System.out.println(result.getMsg());
	}
}
