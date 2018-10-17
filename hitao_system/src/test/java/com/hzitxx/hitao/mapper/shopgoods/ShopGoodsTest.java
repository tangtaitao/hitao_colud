package com.hzitxx.hitao.mapper.shopgoods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopGoods;
import com.hzitxx.hitao.mapper.shopgoods.ShopGoodsMapper;

/**
 * 测试ShopGoodsMapper
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) // 指定junit的启动类,让其创建ioc容器
@SpringBootTest(classes = SystemMicroService8083.class) // 指定springboot的入口类，配置文件属性的读取
public class ShopGoodsTest {

	@Autowired
	private ShopGoodsMapper mapper;

	/**
	 * 测试查询goods
	 */
	@Test
	public void testSelectShopGoods() {
		Map<String, Object> map=new HashMap<>();
		ShopGoods shopGoods=new ShopGoods();
		shopGoods.setGoodsId(2);
		map.put("goodsId", shopGoods.getGoodsId());
		List<ShopGoods> list = mapper.selectShopGoods(map);
		System.out.println(list);
	}

	/**
	 * 测试增加goods
	 */
	@Test
	public void testAddShopGoods() {
		ShopGoods goods = new ShopGoods();
		goods.setGoodsName("哇哈哈");
		int result = mapper.addShopGoods(goods);
		System.out.println(result);
	}
	
	/**
	 * 测试更新goods
	 */
	@Test
	public void testUpdateShopGoods() {
		ShopGoods goods = new ShopGoods();
		goods.setGoodsId(28);
		goods.setGoodsName("哇哈哈01");
		goods.setIsDel(1);//测试逻辑删除
		int result= mapper.updateShopGoods(goods);
		System.out.println(result);
	}
	
	/**
	 * 测试物理删除
	 */
	@Test
	public void testDeleteById() {
		int result=mapper.deleteById(26);
		System.out.println(result);
	}
}
