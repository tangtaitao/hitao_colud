package com.hzitxx.hitao.service.shopgoods;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopFrontCategory;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopFrontCategoryService的方法
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopFrontCategoryServiceTest {
	@Autowired
	private ShopFrontCategoryService service;

	/**
	 * 测试增加类目
	 */
	@Test
	public void testAddShopFrontCategory() {
		ShopFrontCategory shopFrontCategory = new ShopFrontCategory();
		shopFrontCategory.setCatId(19);
		shopFrontCategory.setCatName("测试12");
		ServerResponse<?> result = service.addShopFrontCategory(shopFrontCategory);
		System.out.println(result.getMsg());
	}

	/**
	 * 测试查询类目信息
	 */
	@Test
	public void testSelectShopFrontCategory() {
		ServerResponse<LayuiEntity<ShopFrontCategory>> list = service.selectShopFrontCategory(1,5,null);
		System.out.println(list.getData().getData());
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
		ServerResponse<?> result = service.updateById(shopFrontCategory);
		System.out.println(result.getMsg());
	}

	/**
	 * 测试根据id删除类目信息
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<?> result = service.deleteById(17);
		System.out.println(result.getMsg());
	}
}
