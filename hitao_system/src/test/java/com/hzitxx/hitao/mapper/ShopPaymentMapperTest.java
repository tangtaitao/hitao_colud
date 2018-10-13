package com.hzitxx.hitao.mapper;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopPayment;

/**
 * 测试ShopPaymentMapper
 * 
 * @author Administrator
 *
 */
/*
 * @RunWith(SpringJUnit4ClassRunner.class)
 * 
 * @SpringBootTest(classes = SystemMicroService8083.class)
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopPaymentMapperTest {
	// 自动注入mapper对象
	@Autowired
	private ShopPaymentMapper shopPaymentMapper;

	/**
	 * 测试添加数据
	 */
	@Test
	public void testAddShopPayment() {
		ShopPayment shopPayment = new ShopPayment();
		shopPayment.setCreatedTime(new Date());
		shopPayment.setIsDel(0);
		shopPayment.setPaymentCode("123");
		shopPayment.setPaymentConfig("123");
		shopPayment.setPaymentName("123");
		shopPayment.setPaymentState(0);
		int i = shopPaymentMapper.addShopPayment(shopPayment);
		System.out.println(i);
	}

	/**
	 * 测试删除数据
	 */
	@Test
	public void testDeleteById() {
		int i = shopPaymentMapper.deleteById(2);
		System.out.println(i);
	}

	/**
	 * 测试更新数据（包括逻辑删除）
	 */
	@Test
	public void testUpdateById() {
		ShopPayment shopPayment = new ShopPayment();
		shopPayment.setPaymentId(1);
		shopPayment.setIsDel(1);
		shopPayment.setPaymentName("汤太涛");
		shopPayment.setUpdatedTime(new Date());
		int i = shopPaymentMapper.updateById(shopPayment);
	}

	/**
	 * 测试根据id查询一条信息
	 */
	@Test
	public void testFindOne() {
		ShopPayment shopPayment = shopPaymentMapper.findOne(1);
		System.out.println(shopPayment);
	}

	/**
	 * 测试搜索数据
	 */
	@Test
	public void testSearchShopPayment() {
		Map<String, Object> map = new HashMap<>();
		map.put("paymentName", "汤太涛");
		List<ShopPayment> list = shopPaymentMapper.searchShopPayment(map);
		System.out.println(list);
	}
}
