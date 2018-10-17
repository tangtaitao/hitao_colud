package com.hzitxx.hitao.mapper.shopgoods;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopGoodsContent;
import com.hzitxx.hitao.mapper.shopgoods.ShopGoodsContentMapper;

/**
 * 测试ShopGoodsContentMapper
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = SystemMicroService8083.class) 
public class ShopGoodsContentTest {

	@Autowired
	private ShopGoodsContentMapper mapper;
	/**
	 * 测试增加内容
	 */
	@Test
	public void testAddShopGoodsContent() {
		ShopGoodsContent shopGoodsContent=new ShopGoodsContent();
		shopGoodsContent.setGoodsId(12);
		shopGoodsContent.setContent("拉拉");
		int result=mapper.addShopGoodsContent(shopGoodsContent);
		System.out.println(result);
	}
	
	/**
	 * 测试查询商品内容
	 */
	@Test
	public void testSelectShopGoodsContent() {
		List<ShopGoodsContent> list = mapper.selectShopGoodsContent(null);
		System.out.println(list);
	}
	
	/**
	 * 测试根据id修改数据
	 */
	@Test
	public void testUpdateById() {
		ShopGoodsContent shopGoodsContent=new ShopGoodsContent();
		shopGoodsContent.setGoodsId(12);
		shopGoodsContent.setContent("拉拉03");
		int result=mapper.updateById(shopGoodsContent);
		System.out.println(result);
	}
	
	/**
	 * 根据id删除
	 */
	@Test
	public void testDeleteById() {
		int result=mapper.deleteById(12);
		System.out.println(result);
	}
}
