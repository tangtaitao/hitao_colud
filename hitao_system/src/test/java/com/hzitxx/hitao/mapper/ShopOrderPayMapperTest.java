package com.hzitxx.hitao.mapper;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopOrderLog;
import com.hzitxx.hitao.entity.ShopOrderPay;
import com.netflix.discovery.converters.Auto;

/**
 * 测试ShopOrderPayMapper
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopOrderPayMapperTest {
	// 自动注入mapper对象
	@Autowired
	private ShopOrderPayMapper shopOrderPayMapper;

	/**
	 * 测试增加一条数据
	 */
	@Test
	public void testAddShopOrderLog() {
		ShopOrderPay shopOrderPay = new ShopOrderPay();
		shopOrderPay.setApiPayState(1);
		shopOrderPay.setBuyerId(1);
		shopOrderPay.setPaySn(1L);
		int i = shopOrderPayMapper.addShopOrderPay(shopOrderPay);
		System.out.println(i);
	}

	/**
	 * 测试删除一条数据
	 */
	@Test
	public void testDeleteById() {
		int i = shopOrderPayMapper.deleteById(2);
		System.out.println(i);
	}

	/**
	 * 测试更新一条数据
	 */
	@Test
	public void testUpdateById() {
		ShopOrderPay shopOrderPay = new ShopOrderPay();
		shopOrderPay.setPayId(1);
		shopOrderPay.setApiPayState(2);
		shopOrderPay.setBuyerId(2);
		shopOrderPay.setPaySn(2L);
		int i = shopOrderPayMapper.updateById(shopOrderPay);
		System.out.println(i);
	}

	/**
	 * 查询一条信息
	 */
	@Test
	public void testFindOne() {
		ShopOrderPay shopOrderPay = shopOrderPayMapper.findOne(1);
		System.out.println(shopOrderPay);
	}

	/**
	 * 搜索数据
	 */
	@Test
	public void testSreachShopOrderLog() {
		Map<String, Object> map = new HashMap<>();
		map.put("buyerId", 2);
		List<ShopOrderPay> list = shopOrderPayMapper.searchShopOrderPay(map);
		System.out.println(list);
	}
}
