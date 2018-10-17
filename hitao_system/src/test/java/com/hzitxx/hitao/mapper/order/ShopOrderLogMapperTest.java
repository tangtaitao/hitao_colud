package com.hzitxx.hitao.mapper.order;


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
import com.hzitxx.hitao.mapper.order.ShopOrderLogMapper;

/**
 * 测试ShopOrderLogMapper
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopOrderLogMapperTest {

	// 自动注入mapper
	@Autowired
	private ShopOrderLogMapper shopOrderLogMapper;

	/**
	 * 测试增加一条数据
	 */
	@Test
	public void testAddShopOrderLog() {
		ShopOrderLog shopOrderLog = new ShopOrderLog();
		shopOrderLog.setLogMsg("1");
		shopOrderLog.setLogOrderstate(1);
		shopOrderLog.setLogRole("1");
		shopOrderLog.setLogTime(new Date());
		shopOrderLog.setLogUser("1");
		shopOrderLog.setOrderId(1);
		int i = shopOrderLogMapper.addShopOrderLog(shopOrderLog);
		System.out.println(i);
	}

	/**
	 * 测试删除一条数据
	 */
	@Test
	public void testDeleteById() {
		int i = shopOrderLogMapper.deleteById(2);
		System.out.println(i);
	}

	/**
	 * 测试更新一条数据
	 */
	@Test
	public void testUpdateById() {
		ShopOrderLog shopOrderLog = new ShopOrderLog();
		shopOrderLog.setLogId(1);
		shopOrderLog.setLogMsg("2");
		shopOrderLog.setLogOrderstate(2);
		shopOrderLog.setLogRole("2");
		shopOrderLog.setLogTime(new Date());
		shopOrderLog.setLogUser("2");
		shopOrderLog.setOrderId(2);
		int i = shopOrderLogMapper.updateById(shopOrderLog);
		System.out.println(i);
	}

	/**
	 * 查询一条信息
	 */
	@Test
	public void testFindOne() {
		ShopOrderLog shopOrderLog = shopOrderLogMapper.findOne(1);
		System.out.println(shopOrderLog);
	}

	/**
	 * 搜索数据
	 */
	@Test
	public void testSreachShopOrderLog() {
		Map<String, Object> map = new HashMap<>();
		map.put("orderId", 2);
		List<ShopOrderLog> list = shopOrderLogMapper.searchShopOrderLog(map);
		System.out.println(list);
	}
}
