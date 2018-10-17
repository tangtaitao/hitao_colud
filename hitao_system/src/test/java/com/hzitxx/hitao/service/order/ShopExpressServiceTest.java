package com.hzitxx.hitao.service.order;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopExpress;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopExpressService
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopExpressServiceTest {
	// 自动注入ShopExpressService对象
	@Autowired
	private ShopExpressService shopExpressService;

	/**
	 * 测试添加订单
	 */
	@Test
	public void testAddShopExpress() {
		ShopExpress shopExpress = new ShopExpress();
		shopExpress.seteCode("1");
		shopExpress.seteName("t");
		shopExpress.seteState(1);
		ServerResponse<Integer> serverResponse = shopExpressService.addShopExpress(shopExpress);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试删除订单
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<Integer> serverResponse = shopExpressService.deleteById(2);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试更新订单
	 */
	@Test
	public void testUpdateById() {
		ShopExpress shopExpress = new ShopExpress();
		shopExpress.setId(2);
		shopExpress.setIsDel(1);
		shopExpress.seteName("tt");
		shopExpress.seteLetter("1");
		ServerResponse<Integer> serverResponse = shopExpressService.updateById(shopExpress);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试查询一条信息
	 */
	@Test
	public void testFindOne() {
		ServerResponse<ShopExpress> serverResponse = shopExpressService.findOne(1);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg() + serverResponse.getData());
	}

	/**
	 * 测试查询数据
	 */
	@Test
	public void testSeacrchShopExpress() {
		Map<String, Object> map = new HashMap<>();
		map.put("eCode", "2");
		ServerResponse<LayuiEntity<ShopExpress>> serverResponse = shopExpressService.searchShopExpress(map, 1, 10);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg() + serverResponse.getData().getData());
	}
}
