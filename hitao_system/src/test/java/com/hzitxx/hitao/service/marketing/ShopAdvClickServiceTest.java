package com.hzitxx.hitao.service.marketing;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopAdv;
import com.hzitxx.hitao.entity.ShopAdvClick;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopAdvClickService
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopAdvClickServiceTest {
	// 自动注入ShopAdvService对象
	@Autowired
	private ShopAdvClickService shopAdvClickService;

	/**
	 * 测试添加一条数据
	 */
	@Test
	public void testAddShopAdv() {
		ShopAdvClick shopAdvClick = new ShopAdvClick();
		shopAdvClick.setAdvName("tt");
		shopAdvClick.setApId(1);
		shopAdvClick.setApName("pp");
		shopAdvClick.setClickNum(11);
		ServerResponse<Integer> serverResponse = shopAdvClickService.addShopAdvClick(shopAdvClick);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试删除一条数据
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<Integer> serverResponse = shopAdvClickService.deleteById(2);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试修改一条数据
	 */
	@Test
	public void testUpdateById() {
		ShopAdvClick shopAdvClick = new ShopAdvClick();
		shopAdvClick.setAdvId(2);
		shopAdvClick.setAdvName("qq");
		shopAdvClick.setApId(1);
		shopAdvClick.setApName("ww");
		shopAdvClick.setClickNum(11);
		ServerResponse<Integer> serverResponse = shopAdvClickService.updateById(shopAdvClick);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试查询一条数据
	 */
	@Test
	public void testFindOne() {
		ServerResponse<ShopAdvClick> serverResponse = shopAdvClickService.findOne(1);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg()+ serverResponse.getData());
	}

	/**
	 * 测试搜索数据并分页
	 */
	@Test
	public void testSearchShopAdv() {
		Map<String, Object> map = new HashMap<>();
		ServerResponse<LayuiEntity<ShopAdvClick>> serverResponse = shopAdvClickService.searchShopAdvClick(map, 1, 10);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg() + serverResponse.getData().getData());

	}

}
