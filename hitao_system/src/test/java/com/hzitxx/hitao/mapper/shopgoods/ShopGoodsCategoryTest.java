package com.hzitxx.hitao.mapper.shopgoods;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopGoodsCategory;
import com.hzitxx.hitao.mapper.shopgoods.ShopGoodsCategoryMapper;

/**
 * 测试ShopGoodsCategoryMapper
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopGoodsCategoryTest {

	@Autowired
	private ShopGoodsCategoryMapper mapper;

	/**
	 * 测试增加商品分类
	 */
	@Test
	public void testAddShopGoodsCategory() {
		ShopGoodsCategory shopGoodsCategory = new ShopGoodsCategory();
		shopGoodsCategory.setCatName("测试1");
		shopGoodsCategory.setParentId(17);
		int result=mapper.addShopGoodsCategory(shopGoodsCategory);
		System.out.println(result);
	}

	/**
	 * 测试查询
	 */
	@Test
	public void testSelectShopGoodsCategory() {
		List<ShopGoodsCategory> list = mapper.selectShopGoodsCategory(null);
		System.out.println(list);
	}

	/**
	 * 测试根据id修改
	 */
	@Test
	public void testUpdateById() {
		ShopGoodsCategory shopGoodsCategory = new ShopGoodsCategory();
		shopGoodsCategory.setCatId(23);
		shopGoodsCategory.setParentId(18);
		int result = mapper.updateById(shopGoodsCategory);
		System.out.println(result);
	}

	/**
	 * 根据id删除
	 */
	@Test
	public void testDeleteById() {
		int result = mapper.deleteById(23);
		System.out.println(result);
	}
}
