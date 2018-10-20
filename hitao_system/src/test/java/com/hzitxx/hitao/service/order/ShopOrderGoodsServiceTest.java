package com.hzitxx.hitao.service.order;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopOrderGoods;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopOrderGoodsService
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopOrderGoodsServiceTest {
	// 自动注入ShopOrderGoodsservice对象
	@Autowired
	private ShopOrderGoodsService shopOrderGoodsService;

	/**
	 * 测试添加订单
	 */
	@Test
	public void testAddShopOrder() {
		ShopOrderGoods shopOrderGoods = new ShopOrderGoods();
		shopOrderGoods.setBuyerId(1);
		shopOrderGoods.setCreatedTime(new Date());
		shopOrderGoods.setGoodsName("11");
		ServerResponse<Integer> serverResponse = shopOrderGoodsService.addShopOrderGoods(shopOrderGoods);
		System.out.println(serverResponse.getStatus());
		System.out.println(serverResponse.getMsg());
	}

	/**
	 * 测试删除订单
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<Integer> deleteById = shopOrderGoodsService.deleteById(2);
		System.out.println(deleteById.getStatus() + deleteById.getMsg());
	}

	/**
	 * 测试更新订单
	 */
	@Test
	public void testUpdateById() {
		ShopOrderGoods shopOrderGoods = new ShopOrderGoods();
		shopOrderGoods.setRecId(2);
		shopOrderGoods.setUpdatedTime(new Date());
		shopOrderGoods.setGoodsType(1);
		shopOrderGoods.setGoodsPayPrice(2L);
		ServerResponse<Integer> id = shopOrderGoodsService.updateById(shopOrderGoods);
		System.out.println(id.getStatus() + id.getMsg());
	}

	/**
	 * 测试查询一条信息
	 */
	@Test
	public void testFindOne() {
		ServerResponse<ShopOrderGoods> serverResponse = shopOrderGoodsService.findOne(1);
		System.out.println(serverResponse.getStatus());
		System.out.println(serverResponse.getData());
	}

	/**
	 * 测试查询数据
	 */
	@Test
	public void testSeacrchShopOrder() {
		Map<String, Object> map = new HashMap<>();
		ServerResponse<LayuiEntity<ShopOrderGoods>> serverResponse = shopOrderGoodsService.searchShopOrderGoods(map, 1,
				2);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg() + serverResponse.getData().getCount()
				+ serverResponse.getData().getData());
	}
}
