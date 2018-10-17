package com.hzitxx.hitao.mapper.shopgoods;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopBrand;
import com.hzitxx.hitao.mapper.shopgoods.ShopBrandMapper;

/**
 * 测试ShopBrandMapper
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopBrandTest {

	@Autowired
	private ShopBrandMapper mapper;

	/**
	 * 测试增加品牌信息
	 */
	@Test
	public void testAddShopBrand() {
		ShopBrand shopBrand = new ShopBrand();
		shopBrand.setBrandName("honor");
		shopBrand.setBrandClass("手机");
		int result = mapper.addShopBrand(shopBrand);
		System.out.println(result);
	}
	
	/**
	 * 测试根据id修改品牌信息
	 */
	@Test
	public void updateById() {
		ShopBrand shopBrand = new ShopBrand();
		shopBrand.setBrandId(16);
		shopBrand.setBrandName("honor011");
		shopBrand.setBrandClass("手机");
		int result = mapper.updateById(shopBrand);
		System.out.println(result);
	}
	
	/**
	 * 测试根据id删除品牌信息
	 */
	@Test
	public void deleteById() {
		int result = mapper.deleteById(15);
		System.out.println(result);
	}
	
	/**
	 * 测试查询品牌信息
	 */
	@Test
	public void testSelectShopBrand() {
		List<ShopBrand> list=mapper.selectShopBrand(null);
		System.out.println(list);
	}
	
	/**
	 * 测试批量删除
	 */
	@Test
	public void testDeleteByIds() {
		String [] ids= {"19","20"};
		int result =mapper.deleteByIds(ids);
		System.out.println(result);
	}
}
