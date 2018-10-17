package com.hzitxx.hitao.mapper.marketing;

import static org.mockito.Matchers.longThat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopArticle;

/**
 * 测试ShopArticleMapper
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopArticleMapperTest {
	// 自动注入mapper对象
	@Autowired
	private ShopArticleMapper shopArticleMapper;

	/**
	 * 测试添加数据
	 */
	@Test
	public void testAddShopArticle() {
		ShopArticle shopArticle = new ShopArticle();
		shopArticle.setArticleTitle("123");
		int i = shopArticleMapper.addShopArticle(shopArticle);
		System.out.println(i);
	}

	/**
	 * 测试删除一条数据
	 */
	@Test
	public void testDeleteById() {
		int i = shopArticleMapper.deleteById(2);
		System.out.println(i);
	}

	/**
	 * 测试更新数据
	 */
	@Test
	public void testUpdateById() {
		ShopArticle shopArticle = new ShopArticle();
		shopArticle.setArticleId(1);
		shopArticle.setArticleTitle("2");
		int i = shopArticleMapper.updateById(shopArticle);
		System.out.println(i);
	}

	/**
	 * 测试查询一条数据
	 */
	@Test
	public void testFindOne() {
		ShopArticle findOne = shopArticleMapper.findOne(1);
		System.out.println(findOne);
	}

	/**
	 * 测试搜索数据
	 */
	@Test
	public void testSearchShopArticle() {
		Map<String, Object> map = new HashMap<>();
		map.put("articleTitle", "2");
		List<ShopArticle> list = shopArticleMapper.searchShopArticle(map);
		System.out.println(list);
	}
}
