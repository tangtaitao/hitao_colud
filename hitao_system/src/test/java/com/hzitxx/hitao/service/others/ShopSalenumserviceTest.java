package com.hzitxx.hitao.service.others;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopSalenum;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopSalenumservice
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopSalenumserviceTest {
	@Autowired
	private ShopSalenumService service;
	
	/**
	 * 测试增加销售统计信息
	 */
	@Test
	public void testAddShopSalenum() {
		ShopSalenum shopSalenum=new ShopSalenum();
		shopSalenum.setDate(6);
		shopSalenum.setGoodsId(11);
		shopSalenum.setSalenum(1000);
		ServerResponse<?> result= service.addShopSalenum(shopSalenum);
		System.out.println(result.getMsg());
	}
	
	
	/**
	 * 测试查询统计信息
	 */
	@Test
	public void testSelectShopSalenum() {
		ServerResponse<LayuiEntity<ShopSalenum>> shopSalenums=service.selectShopSalenum(null);
		System.out.println(shopSalenums.getData().getData());
	}
	
	/**
	 * 测试根据id修改销售统计信息
	 */
	@Test
	public void testUpdateById() {
		ShopSalenum shopSalenum=new ShopSalenum();
		shopSalenum.setId(3);
		shopSalenum.setDate(61);
		shopSalenum.setGoodsId(14);
		shopSalenum.setSalenum(1000);
		ServerResponse<?> result= service.updateById(shopSalenum);
		System.out.println(result.getMsg());
	}
	
	/**
	 * 根据id删除
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<?> result=service.deleteById(2);
		System.out.println(result.getMsg());
	}
}
