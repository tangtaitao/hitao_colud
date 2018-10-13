package com.hzitxx.hitao.mapper;

import static org.mockito.Matchers.longThat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopExpress;

/**
 * 测试ShopExpressMapper
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopExpressMapperTest {
	// 自动注入mapper对象
	@Autowired
	private ShopExpressMapper shopExpressMapper;

	/**
	 * 测试新增一条数据
	 */
	@Test
	public void testAddExpressMapper() {
		ShopExpress shopExpress = new ShopExpress();
		shopExpress.seteCode("1");
		shopExpress.seteLetter("1");
		shopExpress.seteName("1");
		shopExpress.seteOrder(1);
		shopExpress.seteState(1);
		shopExpress.seteUrl("url");
		int i = shopExpressMapper.addShopExpress(shopExpress);
		System.out.println(i);
	}

	/**
	 * 测试删除一条信息
	 */
	@Test
	public void testDeleteById() {
		int i = shopExpressMapper.deleteById(2);
		System.out.println(i);
	}

	/**
	 * 测试更新一条信息
	 */
	@Test
	public void testUpdateById() {
		ShopExpress shopExpress = new ShopExpress();
		shopExpress.setId(1);
		shopExpress.seteCode("2");
		shopExpress.seteLetter("2");
		shopExpress.seteName("2");
		shopExpress.seteOrder(2);
		shopExpress.seteState(2);
		shopExpress.seteUrl("url2");
		shopExpress.setIsDel(1);
		int i = shopExpressMapper.updateById(shopExpress);
		System.out.println(i);
	}

	/**
	 * 测试查询一条数据
	 */
	@Test
	public void testFindOne() {
		ShopExpress shopExpress = shopExpressMapper.findOne(1);
		System.out.println(shopExpress);
	}

	/**
	 * 测试搜索数据
	 */
	@Test
	public void testSearchShopExpress() {
		Map<String, Object> map = new HashMap<>();
		map.put("eName", 2);
		List<ShopExpress> list = shopExpressMapper.searchShopExpress(map);
		System.out.println(list);
	}
}
