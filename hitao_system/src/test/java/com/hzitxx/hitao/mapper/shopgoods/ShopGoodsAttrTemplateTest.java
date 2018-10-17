package com.hzitxx.hitao.mapper.shopgoods;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopGoodsAttrTemplate;
import com.hzitxx.hitao.mapper.shopgoods.ShopGoodsAttrTemplateMapper;

/**
 * 测试ShopGoodsAttrTemplateMapper
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = SystemMicroService8083.class) 
public class ShopGoodsAttrTemplateTest {

	@Autowired
	private ShopGoodsAttrTemplateMapper mapper;
	
	/**
	 * 测试增加商品属性模板
	 */
	@Test
	public void testAddShopGoodsAttrTemplate() {
		ShopGoodsAttrTemplate shopGoodsAttrTemplate =new ShopGoodsAttrTemplate();
		shopGoodsAttrTemplate.setCatId(5);
		int result=mapper.addShopGoodsAttrTemplate(shopGoodsAttrTemplate);
		System.out.println(result);
	}
	
	/**
	 * 测试根据id删除商品信息
	 */
	@Test
	public void testDeleteById() {
		int result=mapper.deleteById(24);
		System.out.println(result);
	}
	/**
	 * 测试根据id修改商品属性模板
	 */
	@Test
	public void testUpdateById() {
		ShopGoodsAttrTemplate shopGoodsAttrTemplate=new ShopGoodsAttrTemplate();
		shopGoodsAttrTemplate.setAttrId(25);
		shopGoodsAttrTemplate.setCatId(7);
		int result =mapper.updateById(shopGoodsAttrTemplate);
		System.out.println(result);
	}
	
	
	/**
	 * 测试查询商品属性模板
	 */
	@Test
	public void testSelectShopGoodsAttrTemplate() {
		List<ShopGoodsAttrTemplate> list = mapper.selectShopGoodsAttrTemplate(null);
		System.out.println(list);
	}
}
