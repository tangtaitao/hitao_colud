package com.hzitxx.hitao.mapper.others;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopSalenum;
/**
 * 测试ShopSalenumMapper
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopSalenumTest {

	@Autowired
	private ShopSalenumMapper mapper;
	
	/**
	 * 测试增加销售统计信息
	 */
	@Test
	public void testAddShopSalenum() {
		ShopSalenum shopSalenum=new ShopSalenum();
		shopSalenum.setDate(5);
		shopSalenum.setGoodsId(11);
		shopSalenum.setSalenum(1000);
		int result= mapper.addShopSalenum(shopSalenum);
		System.out.println(result);
	}
	
	
	/**
	 * 测试查询统计信息
	 */
	@Test
	public void testSelectShopSalenum() {
		List<ShopSalenum> shopSalenums=mapper.selectShopSalenum(null);
		System.out.println(shopSalenums);
	}
	
	/**
	 * 测试根据id修改销售统计信息
	 */
	@Test
	public void testUpdateById() {
		ShopSalenum shopSalenum=new ShopSalenum();
		shopSalenum.setId(1);
		shopSalenum.setDate(6);
		shopSalenum.setGoodsId(14);
		shopSalenum.setSalenum(1000);
		int result= mapper.updateById(shopSalenum);
		System.out.println(result);
	}
	
	/**
	 * 根据id删除
	 */
	@Test
	public void testDeleteById() {
		int result=mapper.deleteById(1);
		System.out.println(result);
	}
}
