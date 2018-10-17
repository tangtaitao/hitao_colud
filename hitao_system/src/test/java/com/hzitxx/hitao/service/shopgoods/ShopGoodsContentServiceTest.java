package com.hzitxx.hitao.service.shopgoods;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopGoodsContent;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopGoodsContentService
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = SystemMicroService8083.class) 
public class ShopGoodsContentServiceTest {
	@Autowired
	private ShopGoodsContentService service;
	/**
	 * 测试增加内容
	 */
	@Test
	public void testAddShopGoodsContent() {
		ShopGoodsContent shopGoodsContent=new ShopGoodsContent();
		shopGoodsContent.setGoodsId(12);
		shopGoodsContent.setContent("拉拉");
		ServerResponse<?> result=service.addShopGoodsContent(shopGoodsContent);
		System.out.println(result.getMsg());
	}
	
	/**
	 * 测试查询商品内容
	 */
	@Test
	public void testSelectShopGoodsContent() {
		ServerResponse<LayuiEntity<ShopGoodsContent>> list = service.selectShopGoodsContent(null);
		System.out.println(list.getData().getData());
	}
	
	/**
	 * 测试根据id修改数据
	 */
	@Test
	public void testUpdateById() {
		ShopGoodsContent shopGoodsContent=new ShopGoodsContent();
		shopGoodsContent.setGoodsId(12);
		shopGoodsContent.setContent("拉拉03");
		ServerResponse<?> result=service.updateById(shopGoodsContent);
		System.out.println(result.getMsg());
	}
	
	/**
	 * 根据id删除
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<?> result=service.deleteById(12);
		System.out.println(result.getMsg());
	}
}
