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
import com.hzitxx.hitao.entity.ShopAdvPosition;

/**
 * 测试ShopAdvPositionMapper
 * 
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopAdvPositionMapperTest {
	// 自动注入mapper对象
	@Autowired
	private ShopAdvPositionMapper shopAdvPositionMapper;

	/**
	 * 测试新增一条数据
	 */
	@Test
	public void testAddAdvMapper() {
		ShopAdvPosition shopAdvPosition = new ShopAdvPosition();
		shopAdvPosition.setAdvNum(1);
		shopAdvPosition.setApClass(1);
		shopAdvPosition.setApDisplay(1);
		shopAdvPosition.setApHeight(1);
		shopAdvPosition.setApHeight(1);
		shopAdvPosition.setApIntro("1");
		shopAdvPosition.setApName("1");
		shopAdvPosition.setApPrice(1);
		shopAdvPosition.setApWidth(1);
		shopAdvPosition.setClickNum(1);
		shopAdvPosition.setDefaultContent("1");
		shopAdvPosition.setIsUse(1);
		int i = shopAdvPositionMapper.addShopAdvPosition(shopAdvPosition);
		System.out.println(i);
	}

	/**
	 * 测试删除一条信息
	 */
	@Test
	public void testDeleteById() {
		int i = shopAdvPositionMapper.deleteById(2);
		System.out.println(i);
	}

	/**
	 * 测试更新一条信息
	 */
	@Test
	public void testUpdateById() {
		ShopAdvPosition shopAdvPosition = new ShopAdvPosition();
		shopAdvPosition.setApId(1);
		shopAdvPosition.setApName("2");
		int i = shopAdvPositionMapper.updateById(shopAdvPosition);
		System.out.println(i);
	}

	/**
	 * 测试查询一条数据
	 */
	@Test
	public void testFindOne() {
		ShopAdvPosition shopAdvPosition = shopAdvPositionMapper.findOne(1);
		System.out.println(shopAdvPosition);
	}

	/**
	 * 测试搜索数据
	 */
	@Test
	public void testSearchShopAdvPosition() {
		Map<String, Object> map = new HashMap<>();
		map.put("apName", "2");
		List<ShopAdvPosition> list = shopAdvPositionMapper.searchShopAdvPosition(map);
		System.out.println(list);
	}
}
