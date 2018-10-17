package com.hzitxx.hitao.service.order;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.coyote.http11.filters.VoidInputFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopOrderLog;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopOrderLogService
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopOrderLogServiceTest {
	// 自动注入ShopOrderLogService对象
	@Autowired
	private ShopOrderLogService shopOrderLogService;

	/**
	 * 测试新增数据
	 */
	@Test
	public void testAddShopOrderLog() {
		ShopOrderLog shopOrderLog = new ShopOrderLog();
		shopOrderLog.setLogMsg("1");
		shopOrderLog.setLogOrderstate(1);
		shopOrderLog.setLogRole("1");
		shopOrderLog.setOrderId(1);
		ServerResponse<Integer> serverResponse = shopOrderLogService.addShopOrderLog(shopOrderLog);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试删除数据
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<Integer> serverResponse = shopOrderLogService.deleteById(3);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试修改数据
	 */
	@Test
	public void testUpdateById() {
		ShopOrderLog shopOrderLog = new ShopOrderLog();
		shopOrderLog.setLogId(2);
		shopOrderLog.setLogTime(new Date());
		shopOrderLog.setLogUser("ttt");
		ServerResponse<Integer> serverResponse = shopOrderLogService.updateById(shopOrderLog);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试查询一条数据
	 * 
	 */
	@Test
	public void testFindOne() {
		ServerResponse<ShopOrderLog> serverResponse = shopOrderLogService.findOne(1);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg() + serverResponse.getData());
	}

	/**
	 * 测试搜索数据并分页
	 */
	@Test
	public void testSearchShopOrderLog() {
		Map<String, Object> map = new HashMap<>();
		ServerResponse<LayuiEntity<ShopOrderLog>> serverResponse = shopOrderLogService.searchShopOrderLog(map, 1, 10);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg() + serverResponse.getData().getCount()+serverResponse.getData().getData());
	}
}
