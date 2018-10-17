package com.hzitxx.hitao.service.marketing;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopAdv;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopAdvService
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopAdvServiceTest {
	// 自动注入ShopAdvService对象
	@Autowired
	private ShopAdvService shopAdvService;

	/**
	 * 测试添加一条数据
	 */
	@Test
	public void testAddShopAdv() {
		ShopAdv shopAdv = new ShopAdv();
		shopAdv.setAdvContent("tt");
		shopAdv.setAdvId(1);
		shopAdv.setAdvTitle("tt");
		shopAdv.setApId(1);
		ServerResponse<Integer> serverResponse = shopAdvService.addShopAdv(shopAdv);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试删除一条数据
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<Integer> serverResponse = shopAdvService.deleteById(6);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试修改一条数据
	 */
	@Test
	public void testUpdateById() {
		ShopAdv shopAdv = new ShopAdv();
		shopAdv.setAdvContent("pp");
		shopAdv.setAdvId(6);
		shopAdv.setAdvTitle("pp");
		shopAdv.setClickNum(12);
		ServerResponse<Integer> serverResponse = shopAdvService.updateById(shopAdv);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试查询一条数据
	 */
	@Test
	public void testFindOne() {
		ServerResponse<ShopAdv> serverResponse = shopAdvService.findOne(5);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg()+serverResponse.getData());
	}
	/**
	 * 测试搜索数据并分页
	 */
	@Test
	public void testSearchShopAdv() {
		Map<String, Object> map=new HashMap<>();
		ServerResponse<LayuiEntity<ShopAdv>> serverResponse = shopAdvService.searchShopAdv(map, 1, 10);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg()+serverResponse.getData().getData());

	}

}
