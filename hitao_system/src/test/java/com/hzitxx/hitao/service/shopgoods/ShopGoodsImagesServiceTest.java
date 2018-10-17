package com.hzitxx.hitao.service.shopgoods;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopGoodsImages;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopGoodsImagesService
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = SystemMicroService8083.class) 
public class ShopGoodsImagesServiceTest {

	@Autowired
	private ShopGoodsImagesService service;
	
	/**
	 * 测试添加商品图片
	 */
	@Test
	public void testAddShopGoodsImages() {
		ShopGoodsImages shopGoodsImages=new ShopGoodsImages();
		shopGoodsImages.setGoodsId(12);
		shopGoodsImages.setColorId(1);
		ServerResponse<?> result=service.addShopGoodsImages(shopGoodsImages);
		System.out.println(result.getMsg());
	}
	
	/**
	 * 测试查询商品图片
	 */
	@Test
	public void testSelectShopGoodsImages() {
		ServerResponse<LayuiEntity<ShopGoodsImages>> list =service.selectShopGoodsImages(null);
		System.out.println(list.getData().getData());
	}
	
	/**
	 * 测试根据id修改商品图片
	 */
	@Test
	public void testUpdateById() {
		ShopGoodsImages shopGoodsImages=new ShopGoodsImages();
		shopGoodsImages.setGoodsImageId(8);
		shopGoodsImages.setGoodsId(12);
		shopGoodsImages.setColorId(2);
		ServerResponse<?> result=service.updateById(shopGoodsImages);
		System.out.println(result.getMsg());
	}
	
	/**
	 * 测试根据id删除
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<?> result=service.deleteById(7);
		System.out.println(result.getMsg());
	}
}
