package com.hzitxx.hitao.mapper.shopgoods;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopGoodsAttr;
import com.hzitxx.hitao.mapper.shopgoods.ShopGoodsAttrMapper;

/**
 * 测试ShopGoodsAttrMapper
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = SystemMicroService8083.class) 
public class ShopGoodsAttrTest {

	@Autowired
	private ShopGoodsAttrMapper mapper;
	
	/**
	 * 测试增加商品属性
	 */
	@Test
	public void testAddShopGoodsAttr() {
		ShopGoodsAttr shopGoodsAttr=new ShopGoodsAttr();
		shopGoodsAttr.setGoodsId(26);
		shopGoodsAttr.setCatId(14);
		shopGoodsAttr.setAttrId(1);
		int result=mapper.addShopGoodsAttr(shopGoodsAttr);
		System.out.println(result);
	}
	
	/**
	 * 测试查询商品属性
	 */
	@Test
	public void testSelectShopGoodsAttr() {
		List<ShopGoodsAttr> list =mapper.selectShopGoodsAttr(null);
		System.out.println(list);
	}
	
	
	/**
	 * 测试根据id删除商品信息
	 */
	@Test
	public void testUpdateById() {
		ShopGoodsAttr shopGoodsAttr=new ShopGoodsAttr();
		shopGoodsAttr.setGoodsId(26);
		shopGoodsAttr.setAttrId(2);
		int result =mapper.updateById(shopGoodsAttr);
		System.out.println(result);
	}
	
	/**
	 * 测试根据id来物理删除
	 */
	@Test
	public void testDeleteById() {
		int result=mapper.deleteById(26);
		System.out.println(result);
	}
}
