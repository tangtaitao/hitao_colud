package com.hzitxx.hitao.service.shopgoods;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopGoodsAttr;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopGoodsAttrService的方法
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopGoodsAttrServiceTest {

	@Autowired 
	private ShopGoodsAttrService service;
	
	/**
	 * 测试增加商品属性
	 */
	@Test
	public void testAddShopGoodsAttr() {
		ShopGoodsAttr shopGoodsAttr=new ShopGoodsAttr();
		shopGoodsAttr.setGoodsId(26);
		shopGoodsAttr.setCatId(14);
		shopGoodsAttr.setAttrId(1);
		ServerResponse<?> result=service.addShopGoodsAttr(shopGoodsAttr);
		System.out.println(result.getMsg());
	}
	
	/**
	 * 测试查询商品属性
	 */
	@Test
	public void testSelectShopGoodsAttr() {
		ServerResponse<LayuiEntity<ShopGoodsAttr>> list =service.selectShopGoodsAttr(null);
		System.out.println(list.getData().getData());
	}
	
	
	/**
	 * 测试根据id修改商品信息
	 */
	@Test
	public void testUpdateById() {
		ShopGoodsAttr shopGoodsAttr=new ShopGoodsAttr();
		shopGoodsAttr.setGoodsId(26);
		shopGoodsAttr.setAttrId(2);
		ServerResponse<?> result =service.updateById(shopGoodsAttr);
		System.out.println(result.getMsg());
	}
	
	/**
	 * 测试根据id来物理删除
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<?> result=service.deleteById(26);
		System.out.println(result.getMsg());
	}
}
