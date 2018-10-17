package com.hzitxx.hitao.mapper.order;

import static org.mockito.Matchers.longThat;
import static org.mockito.Matchers.startsWith;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopOrderGoods;
import com.hzitxx.hitao.entity.ShopOrderLog;
import com.hzitxx.hitao.mapper.order.ShopOrderGoodsMapper;

/**
 * 测试ShopOrderGoodsMapper
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopOrderGoodsMapperTest {

	// 自动注入mapper
	@Autowired
	private ShopOrderGoodsMapper shopOrdergoodsMapper;

	/**
	 * 测试增加一条数据
	 */
	@Test
	public void testAddShopOrderLog() {
		ShopOrderGoods shopOrderGoods = new ShopOrderGoods();
		shopOrderGoods.setBuyerId(1);
		shopOrderGoods.setCommisRate(1);
		shopOrderGoods.setCreatedTime(new Date());
		shopOrderGoods.setGoodsId(1);
		shopOrderGoods.setGoodsImage("1");
		shopOrderGoods.setGoodsName("1");
		shopOrderGoods.setGoodsNum(1);
		shopOrderGoods.setGoodsPayPrice(1L);
		shopOrderGoods.setGoodsPrice(new BigDecimal(1));
		shopOrderGoods.setGoodsType(1);
		shopOrderGoods.setOrderId(1);
		shopOrderGoods.setPromotionsId(1);
		int i = shopOrdergoodsMapper.addShopOrderGoods(shopOrderGoods);
		System.out.println(i);
	}

	/**
	 * 测试删除一条数据
	 */
	@Test
	public void testDeleteById() {
		int i = shopOrdergoodsMapper.deleteById(2);
		System.out.println(i);
	}

	/**
	 * 测试更新一条数据
	 */
	@Test
	public void testUpdateById() {
		ShopOrderGoods shopOrderGoods = new ShopOrderGoods();
		shopOrderGoods.setBuyerId(2);
		shopOrderGoods.setCommisRate(2);
		shopOrderGoods.setGoodsId(2);
		shopOrderGoods.setGoodsImage("2");
		shopOrderGoods.setGoodsName("2");
		shopOrderGoods.setGoodsNum(2);
		shopOrderGoods.setGoodsPayPrice(2L);
		shopOrderGoods.setGoodsPrice(new BigDecimal(2));
		shopOrderGoods.setGoodsType(2);
		shopOrderGoods.setOrderId(2);
		shopOrderGoods.setPromotionsId(2);
		shopOrderGoods.setIsDel(1);
		shopOrderGoods.setRecId(1);
		shopOrderGoods.setUpdatedTime(new Date());
		int i = shopOrdergoodsMapper.updateById(shopOrderGoods);
		System.out.println(i);
	}

	/**
	 * 查询一条信息
	 */
	@Test
	public void testFindOne() {
		ShopOrderGoods shopOrderGoods = shopOrdergoodsMapper.findOne(1);
		System.out.println(shopOrderGoods);
	}

	/**
	 * 搜索数据
	 */
	@Test
	public void testSreachShopOrderLog() {
		Map<String, Object> map =new HashMap<>();
		List<ShopOrderGoods> list = shopOrdergoodsMapper.searchShopOrderGoods(map);
		System.out.println(list);
	}
}
