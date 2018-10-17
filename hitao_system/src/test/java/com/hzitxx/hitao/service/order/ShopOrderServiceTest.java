package com.hzitxx.hitao.service.order;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopOrder;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;
import com.netflix.discovery.converters.Auto;

/**
 * 测试ShopOrderService
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopOrderServiceTest {
	// 自动注入ShopOrderservice对象
	@Autowired
	private ShopOrderService shopOrderService;

	/**
	 * 测试添加订单
	 */
	@Test
	public void testAddShopOrder() {
		ShopOrder shopOrder = new ShopOrder();
		shopOrder.setCreatedTime(new Date());
		ServerResponse<Integer> serverResponse = shopOrderService.addShopOrder(shopOrder);
		System.out.println(serverResponse.getStatus());
		System.out.println(serverResponse.getMsg());
	}

	/**
	 * 测试删除订单
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<Integer> deleteById = shopOrderService.deleteById(4);
		System.out.println(deleteById.getStatus() + deleteById.getMsg());
	}

	/**
	 * 测试更新订单
	 */
	@Test
	public void testUpdateById() {
		ShopOrder shopOrder = new ShopOrder();
		shopOrder.setOrderId(3);
		shopOrder.setOrderSn(3L);
		shopOrder.setUpdatedTime(new Date());
		ServerResponse<Integer> id = shopOrderService.updateById(shopOrder);
		System.out.println(id.getStatus() + id.getMsg());
	}

	/**
	 * 测试查询一条信息
	 */
	@Test
	public void testFindOne() {
		ServerResponse<ShopOrder> serverResponse = shopOrderService.findOne(1);
		System.out.println(serverResponse.getStatus());
		System.out.println(serverResponse.getData());
	}

	/**
	 * 测试查询数据
	 */
	@Test
	public void testSeacrchShopOrder() {
		Map<String, Object> map = new HashMap<>();
		ServerResponse<LayuiEntity<ShopOrder>> searchShopOrder = shopOrderService.searchShopOrder(map, 1, 2);
		System.out.println(searchShopOrder);
		System.out.println(searchShopOrder.getData().getCount());
		System.out.println(searchShopOrder.getData().getData().size());
		System.out.println(searchShopOrder.getData().getData());
	}
}
