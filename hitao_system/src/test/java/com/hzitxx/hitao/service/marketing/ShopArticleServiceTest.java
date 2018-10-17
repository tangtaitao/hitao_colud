package com.hzitxx.hitao.service.marketing;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopArticle;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopArticleService
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopArticleServiceTest {
	// 自动注入ShopArticleService对象
	@Autowired
	private ShopArticleService shopArticleService;

	/**
	 * 测试添加一条数据
	 */
	@Test
	public void testAddShopArticle() {
		ShopArticle shopArticle = new ShopArticle();
		shopArticle.setArticleAbstract("111");
		shopArticle.setArticleClassId(1);
		shopArticle.setArticleClick(11);
		ServerResponse<Integer> serverResponse = shopArticleService.addShopArticle(shopArticle);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试删除一条数据
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<Integer> serverResponse = shopArticleService.deleteById(2);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试修改一条数据
	 */
	@Test
	public void testUpdateById() {
		ShopArticle shopArticle = new ShopArticle();
		shopArticle.setArticleId(2);
		shopArticle.setArticleClassId(2);
		ServerResponse<Integer> serverResponse = shopArticleService.updateById(shopArticle);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试查询一条数据
	 */
	@Test
	public void testFindOne() {
		ServerResponse<ShopArticle> serverResponse = shopArticleService.findOne(1);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg() + serverResponse.getData());
	}

	/**
	 * 测试搜索数据并分页
	 */
	@Test
	public void testSearchShopAdv() {
		Map<String, Object> map = new HashMap<>();
		ServerResponse<LayuiEntity<ShopArticle>> serverResponse = shopArticleService.searchShopArticle(map, 1, 10);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg() + serverResponse.getData().getData());

	}

}
