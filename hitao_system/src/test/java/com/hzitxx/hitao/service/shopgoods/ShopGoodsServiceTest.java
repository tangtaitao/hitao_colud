package com.hzitxx.hitao.service.shopgoods;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopGoods;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;
import com.hzitxx.hitao.utils.ShopGoodsUtils;


/**
 * 测试ShopGoodsService
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopGoodsServiceTest {

	@Autowired
	private ShopGoodsService service;
	
	/**
	 * 测试应用PageHelper分页查询
	 */
	@Test
	public void testSelectShopGoods() {
		ServerResponse<LayuiEntity<ShopGoods>> shopGoods=service.selectShopGoods(1, 5, null);
		System.out.println(shopGoods.getData().getData());
	}
	
	/**
	 * 测试增加goods
	 */
	@Test
	public void testAddShopGoods() {

		ShopGoodsUtils shopGoodsUtils=new ShopGoodsUtils();
		shopGoodsUtils.setGoodsName("haha");
		shopGoodsUtils.setContent("ceshi");
		shopGoodsUtils.setGoodsImages(null);
		shopGoodsUtils.setAttrValue(null);
		shopGoodsUtils.setGcId(6);
		ServerResponse<?> result = service.addShopGoods(shopGoodsUtils);
		System.out.println(result.getMsg());
	}
	
	/**
	 * 测试更新goods
	 */
	@Test
	public void testUpdateShopGoods() {
		ShopGoodsUtils shopGoodsUtils=new ShopGoodsUtils();
		shopGoodsUtils.setGoodsId(45);
		shopGoodsUtils.setGoodsName("haha1");
		shopGoodsUtils.setContent("ceshi1");
		shopGoodsUtils.setGoodsImages(null);
		shopGoodsUtils.setAttrValue(null);
		shopGoodsUtils.setGcId(6);
		ServerResponse<?> result= service.updateShopGoods(shopGoodsUtils);
		System.out.println(result.getMsg());
	}
	
	/**
	 * 测试物理删除
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<?> result=service.deleteById(29);
		System.out.println(result.getMsg());
	}
}
