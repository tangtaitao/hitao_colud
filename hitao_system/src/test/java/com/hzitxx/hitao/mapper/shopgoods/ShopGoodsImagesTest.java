package com.hzitxx.hitao.mapper.shopgoods;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopGoodsImages;
import com.hzitxx.hitao.mapper.shopgoods.ShopGoodsImagesMapper;

/**
 * 测试ShopGoodsImagesMapper
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = SystemMicroService8083.class) 
public class ShopGoodsImagesTest {

	@Autowired
	private ShopGoodsImagesMapper mapper;
	
	/**
	 * 测试添加商品图片
	 */
	@Test
	public void testAddShopGoodsImages() {
		ShopGoodsImages shopGoodsImages=new ShopGoodsImages();
		shopGoodsImages.setGoodsId(12);
		shopGoodsImages.setColorId(1);
		int result=mapper.addShopGoodsImages(shopGoodsImages);
		System.out.println(result);
	}
	
	/**
	 * 测试查询商品图片
	 */
	@Test
	public void testSelectShopGoodsImages() {
		List<ShopGoodsImages> list =mapper.selectShopGoodsImages(null);
		System.out.println(list);
	}
	
	/**
	 * 测试根据id修改商品图片
	 */
	@Test
	public void testUpdateById() {
		ShopGoodsImages shopGoodsImages=new ShopGoodsImages();
		shopGoodsImages.setGoodsImageId(6);
		shopGoodsImages.setGoodsId(12);
		shopGoodsImages.setColorId(2);
		int result=mapper.updateById(shopGoodsImages);
		System.out.println(result);
	}
	
	/**
	 * 测试根据id删除
	 */
	@Test
	public void testDeleteById() {
		int result=mapper.deleteById(6);
		System.out.println(result);
	}
}
