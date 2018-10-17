package com.hzitxx.hitao.mapper.marketing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopAdvClick;

/**
 * 测试ShopAdvMapper
 * 
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopAdvClickMapperTest {
	// 自动注入mapper对象
	@Autowired
	private ShopAdvClickMapper shopAdvClickMapper;

	/**
	 * 测试新增一条数据
	 */
	@Test
	public void testAddAdvMapper() {
		ShopAdvClick shopAdvClick = new ShopAdvClick();
		shopAdvClick.setAdvName("1");
		shopAdvClick.setApId(1);
		shopAdvClick.setApName("1");
		shopAdvClick.setClickMonth(10);
		shopAdvClick.setClickNum(1);
		shopAdvClick.setClickYear(2018);
		int i = shopAdvClickMapper.addShopAdvClick(shopAdvClick);
		System.out.println(i);
	}

	/**
	 * 测试删除一条信息
	 */
	@Test
	public void testDeleteById() {
		int i = shopAdvClickMapper.deleteById(2);
		System.out.println(i);
	}

	/**
	 * 测试更新一条信息
	 */
	@Test
	public void testUpdateById() {
		ShopAdvClick shopAdvClick = new ShopAdvClick();
		shopAdvClick.setAdvId(1);
		shopAdvClick.setAdvName("2");
		int i = shopAdvClickMapper.updateById(shopAdvClick);
		System.out.println(i);
	}

	/**
	 * 测试查询一条数据
	 */
	@Test
	public void testFindOne() {
		ShopAdvClick shopAdvClick = shopAdvClickMapper.findOne(1);
		System.out.println(shopAdvClick);
	}

	/**
	 * 测试搜索数据
	 */
	@Test
	public void testSearchShopExpress() {
		Map<String, Object> map = new HashMap<>();
		List<ShopAdvClick> list = shopAdvClickMapper.searchShopAdvClick(map);
		System.out.println(list);
	}
}
