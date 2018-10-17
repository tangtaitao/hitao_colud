package com.hzitxx.hitao.service.order;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopOrderPay;
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
public class ShopOrderPayServiceTest {
	// 自动注入ShopOrderLogService对象
	@Autowired
	private ShopOrderPayService shopOrderPayService;

	/**
	 * 测试新增数据
	 */
	@Test
	public void testAddShopOrderLog() {
		ShopOrderPay shopOrderPay = new ShopOrderPay();
		shopOrderPay.setBuyerId(1);
		shopOrderPay.setApiPayState(1);
		ServerResponse<Integer> serverResponse = shopOrderPayService.addShopOrderPay(shopOrderPay);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试删除数据
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<Integer> serverResponse = shopOrderPayService.deleteById(2);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试修改数据
	 */
	@Test
	public void testUpdateById() {
		ShopOrderPay shopOrderPay = new ShopOrderPay();
		shopOrderPay.setPayId(2);
		shopOrderPay.setBuyerId(2);
		shopOrderPay.setApiPayState(0);
		ServerResponse<Integer> serverResponse = shopOrderPayService.updateById(shopOrderPay);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试查询一条数据
	 * 
	 */
	@Test
	public void testFindOne() {
		ServerResponse<ShopOrderPay> serverResponse = shopOrderPayService.findOne(1);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg() + serverResponse.getData());
	}

	/**
	 * 测试搜索数据并分页
	 */
	@Test
	public void testSearchShopOrderLog() {
		Map<String, Object> map = new HashMap<>();
		ServerResponse<LayuiEntity<ShopOrderPay>> serverResponse = shopOrderPayService.searchShopOrderPay(map, 1, 10);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg() + serverResponse.getData().getCount()
				+ serverResponse.getData().getData());
	}
}
