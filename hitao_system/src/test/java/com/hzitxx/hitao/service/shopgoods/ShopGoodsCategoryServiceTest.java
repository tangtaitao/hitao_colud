package com.hzitxx.hitao.service.shopgoods;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopGoodsCategory;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopGoodsCategoryService
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopGoodsCategoryServiceTest {
	@Autowired
	private ShopGoodsCategoryService service;

	/**
	 * 测试增加商品分类
	 */
	@Test
	public void testAddShopGoodsCategory() {
		ShopGoodsCategory shopGoodsCategory = new ShopGoodsCategory();
		shopGoodsCategory.setCatName("测试1");
		shopGoodsCategory.setParentId(17);
		ServerResponse<?> reslut=service.addShopGoodsCategory(shopGoodsCategory);
		System.out.println(reslut.getMsg());
	}

	/**
	 * 测试查询
	 */
	@Test
	public void testSelectShopGoodsCategory() {
		ServerResponse<LayuiEntity<ShopGoodsCategory>> list = service.selectShopGoodsCategory(null);
		System.out.println(list.getData().getData());
	}

	/**
	 * 测试根据id修改
	 */
	@Test
	public void testUpdateById() {
		ShopGoodsCategory shopGoodsCategory = new ShopGoodsCategory();
		shopGoodsCategory.setCatId(23);
		shopGoodsCategory.setParentId(18);
		ServerResponse<?> result = service.updateById(shopGoodsCategory);
		System.out.println(result.getMsg());
	}

	/**
	 * 根据id删除
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<?> result = service.deleteById(23);
		System.out.println(result.getMsg());
	}
}
