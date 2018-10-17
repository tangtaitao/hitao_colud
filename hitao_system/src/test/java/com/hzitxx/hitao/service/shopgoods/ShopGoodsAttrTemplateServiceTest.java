package com.hzitxx.hitao.service.shopgoods;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopGoodsAttrTemplate;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopGoodsAttrTemplateService
 * 
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopGoodsAttrTemplateServiceTest {

	@Autowired
	private ShopGoodsAttrTemplateService service;

	/**
	 * 测试增加商品属性模板
	 */
	@Test
	public void testAddShopGoodsAttrTemplate() {
		ShopGoodsAttrTemplate shopGoodsAttrTemplate = new ShopGoodsAttrTemplate();
		shopGoodsAttrTemplate.setCatId(5);
		ServerResponse<?> result = service.addShopGoodsAttrTemplate(shopGoodsAttrTemplate);
		System.out.println(result.getMsg());
	}

	/**
	 * 测试根据id删除商品信息
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<?> result = service.deleteById(25);
		System.out.println(result.getMsg());
	}

	/**
	 * 测试根据id修改商品属性模板
	 */
	@Test
	public void testUpdateById() {
		ShopGoodsAttrTemplate shopGoodsAttrTemplate = new ShopGoodsAttrTemplate();
		shopGoodsAttrTemplate.setAttrId(26);
		shopGoodsAttrTemplate.setCatId(7);
		ServerResponse<?> result = service.updateById(shopGoodsAttrTemplate);
		System.out.println(result.getMsg());
	}

	/**
	 * 测试查询商品属性模板
	 */
	@Test
	public void testSelectShopGoodsAttrTemplate() {
		ServerResponse<LayuiEntity<ShopGoodsAttrTemplate>> list = service.selectShopGoodsAttrTemplate(null);
		System.out.println(list.getData().getData());
	}
}
