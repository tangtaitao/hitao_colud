package com.hzitxx.hitao.mapper.marketing;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopArticleClass;

/**
 * 测试ShopArticleClass
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopArticleClassMapperTest {

	// 自动注入mapper对象
	@Autowired
	private ShopArticleClassMapper shopArticleClassMapper;

	/**
	 * 测试新增信息方法
	 */
	@Test
	public void testAddShopArticleClass() {
		ShopArticleClass shopArticleClass = new ShopArticleClass();
		shopArticleClass.setAcCode("1");
		shopArticleClass.setAcName("1");
		shopArticleClass.setAcParentId(1);
		shopArticleClass.setAcSort(1);
		shopArticleClass.setAcStatus(1);
		shopArticleClass.setCreatedTime(new Date());
		int i = shopArticleClassMapper.addShopArticleClass(shopArticleClass);
		System.out.println(i);
	}

	/**
	 * 删除一条数据
	 */
	@Test
	public void testDeleteById() {
		int i = shopArticleClassMapper.deleteById(6);
		System.out.println(i);
	}

	/**
	 * 更新一条数据
	 */
	@Test
	public void testUpdateById() {
		ShopArticleClass shopArticleClass = new ShopArticleClass();
		shopArticleClass.setAcId(7);
		shopArticleClass.setAcCode("2");
		shopArticleClass.setAcName("2");
		shopArticleClass.setAcParentId(2);
		shopArticleClass.setAcSort(2);
		shopArticleClass.setAcStatus(2);
		shopArticleClass.setUpdatedTime(new Date());
		int i = shopArticleClassMapper.updateById(shopArticleClass);
		System.out.println(i);
	}

	/**
	 * 查询一条数据
	 */
	@Test
	public void testfindOne() {
		ShopArticleClass findOne = shopArticleClassMapper.findOne(4);
		System.out.println(findOne);
	}

	/**
	 * 测试搜索数据
	 */
	@Test
	public void testSearchShopArticleClass() {
		Map<String, Object> map = new HashMap<>();
		map.put("acName", "医疗");
		List<ShopArticleClass> list = shopArticleClassMapper.searchShopArticleClass(map);
		System.out.println(list);
	}
}
