package com.hzitxx.hitao.service.marketing;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopAdv;
import com.hzitxx.hitao.entity.ShopAdvPosition;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopAdvPositionService
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopAdvPositionServiceTest {
	// 自动注入ShopAdvService对象
	@Autowired
	private ShopAdvPositionService shopAdvPositionService;

	/**
	 * 测试添加一条数据
	 */
	@Test
	public void testAddShopAdv() {
		ShopAdvPosition shopAdvPosition = new ShopAdvPosition();
		shopAdvPosition.setAdvNum(1);
		shopAdvPosition.setApClass(1);
		shopAdvPosition.setApName("tt");
		shopAdvPosition.setClickNum(12);
		ServerResponse<Integer> serverResponse = shopAdvPositionService.addShopAdvPosition(shopAdvPosition);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试删除一条数据
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<Integer> serverResponse = shopAdvPositionService.deleteById(3);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试修改一条数据
	 */
	@Test
	public void testUpdateById() {
		ShopAdvPosition shopAdvPosition = new ShopAdvPosition();
		shopAdvPosition.setApId(4);
		shopAdvPosition.setAdvNum(2);
		shopAdvPosition.setApClass(2);
		shopAdvPosition.setApName("pp");
		shopAdvPosition.setClickNum(21);
		ServerResponse<Integer> serverResponse = shopAdvPositionService.updateById(shopAdvPosition);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试查询一条数据
	 */
	@Test
	public void testFindOne() {
		ServerResponse<ShopAdvPosition> serverResponse = shopAdvPositionService.findOne(1);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg() + serverResponse.getData());
	}

	/**
	 * 测试搜索数据并分页
	 */
	@Test
	public void testSearchShopAdv() {
		Map<String, Object> map = new HashMap<>();
		ServerResponse<LayuiEntity<ShopAdvPosition>> serverResponse = shopAdvPositionService.searchShopAdvPosition(map,
				1, 10);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg() + serverResponse.getData().getData());

	}

}
