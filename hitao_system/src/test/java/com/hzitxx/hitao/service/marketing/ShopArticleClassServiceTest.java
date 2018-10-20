package com.hzitxx.hitao.service.marketing;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopArticleClass;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopArticleClassService
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopArticleClassServiceTest {
	// 自动注入ShopArticleService对象
	@Autowired
	private ShopArticleClassService shopArticleClassService;

	/**
	 * 测试添加一条数据
	 */
	@Test
	public void testAddShopArticle() {
		ShopArticleClass shopArticleClass = new ShopArticleClass();
		shopArticleClass.setAcCode("1");
		shopArticleClass.setAcName("12");
		shopArticleClass.setAcParentId(1);
		ServerResponse<Integer> serverResponse = shopArticleClassService.addShopArticleClass(shopArticleClass);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试删除一条数据
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<Integer> serverResponse = shopArticleClassService.deleteById(8);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试修改一条数据
	 */
	@Test
	public void testUpdateById() {
		ShopArticleClass shopArticleClass = new ShopArticleClass();
		shopArticleClass.setAcId(8);
		shopArticleClass.setAcSort(1);
		shopArticleClass.setAcName("tt");
		ServerResponse<Integer> serverResponse = shopArticleClassService.updateById(shopArticleClass);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试查询一条数据
	 */
	@Test
	public void testFindOne() {
		ServerResponse<ShopArticleClass> serverResponse = shopArticleClassService.findOne(1);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg() + serverResponse.getData());
	}

	/**
	 * 测试搜索数据并分页
	 */
	@Test
	public void testSearchShopAdv() {
		Map<String, Object> map = new HashMap<>();
		ServerResponse<LayuiEntity<ShopArticleClass>> serverResponse = shopArticleClassService
				.searchShopArticleClass(map, 1, 10);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg() + serverResponse.getData().getData());

	}

}
