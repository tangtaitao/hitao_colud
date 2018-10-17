package com.hzitxx.hitao.mapper.shopgoods;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopFrontCategory;
import com.hzitxx.hitao.mapper.shopgoods.ShopFrontCategoryMapper;

/**
 * 测试ShopFrontCategoryMapper
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopFrontCategoryTest {

	@Autowired
	private ShopFrontCategoryMapper mapper;

	/**
	 * 测试增加类目
	 */
	@Test
	public void testAddShopFrontCategory() {
		ShopFrontCategory shopFrontCategory = new ShopFrontCategory();
		shopFrontCategory.setCatId(19);
		shopFrontCategory.setCatName("测试12");
		int result = mapper.addShopFrontCategory(shopFrontCategory);
		System.out.println(result);
	}

	/**
	 * 测试查询类目信息
	 */
	@Test
	public void testSelectShopFrontCategory() {
		List<ShopFrontCategory> list = mapper.selectShopFrontCategory(null);
		System.out.println(list);
	}

	/**
	 * 测试根据id修改类目信息
	 */
	@Test
	public void testUpdateById() {
		ShopFrontCategory shopFrontCategory = new ShopFrontCategory();
		shopFrontCategory.setFrontCatId(17);
		shopFrontCategory.setCatId(10);
		shopFrontCategory.setCatName("测试0");
		int result = mapper.updateById(shopFrontCategory);
		System.out.println(result);
	}

	/**
	 * 测试根据id删除类目信息
	 */
	@Test
	public void testDeleteById() {
		int result = mapper.deleteById(17);
		System.out.println(result);
	}
}
