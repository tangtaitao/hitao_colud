package com.hzitxx.hitao.service.shopgoods;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopBrand;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopBrandService的方法
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopBrandServiceTest {
	@Autowired
	private ShopBrandService service ;

	/**
	 * 测试增加品牌信息
	 */
	@Test
	public void testAddShopBrand() {
		ShopBrand shopBrand = new ShopBrand();
		shopBrand.setBrandName("honor");
		shopBrand.setBrandClass("手机");
		ServerResponse<?> result = service.addShopBrand(shopBrand);
		System.out.println(result.getMsg());
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
		ServerResponse<?> result = service.updateById(shopBrand);
		System.out.println(result.getMsg());
	}
	
	/**
	 * 测试根据id删除品牌信息
	 */
	@Test
	public void deleteById() {
		ServerResponse<?> result = service.deleteById(16);
		System.out.println(result.getMsg());
	}
	
	/**
	 * 测试查询品牌信息
	 */
	@Test
	public void testSelectShopBrand() {
		ServerResponse<LayuiEntity<ShopBrand>> list=service.selectShopBrand(null);
		System.out.println(list.getData().getData());
	}
	
	/**
	 * 测试批量删除
	 */
	@Test
	public void testDeleteByIds() {
		String [] ids= {"22","23"};
		ServerResponse<?> result =service.deleteByIds(ids);
		System.out.println(result.getMsg());
	}
}
