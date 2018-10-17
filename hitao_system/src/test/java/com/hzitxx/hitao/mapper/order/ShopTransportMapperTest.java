package com.hzitxx.hitao.mapper.order;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopTransport;
import com.hzitxx.hitao.mapper.order.ShopTransportMapper;
/**
 * 测试ShopTransportMapper
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopTransportMapperTest {
	// 自动注入mapper对象
	@Autowired
	private ShopTransportMapper shopTransportMapper;

	/**
	 * 测试根据id查找一条数据
	 */
	@Test
	public void testFindOne() {
		ShopTransport shopTransport = shopTransportMapper.findOne(1);
		System.out.println(shopTransport);
	}

	/**
	 * 测试添加一条数据
	 */
	@Test
	public void testAddShopTransport() {
		ShopTransport shopTransport = new ShopTransport();
		shopTransport.setTitle("c");
		shopTransport.setSendTplId(1);
		shopTransport.setIsDel(0);
		shopTransport.setCreatedTime(new Date());
		int i = shopTransportMapper.addShopTransport(shopTransport);
		System.out.println(1);
	}

	/**
	 * 测试根据id修改一条信息
	 */
	@Test
	public void testUpdateById() {
		ShopTransport shopTransport = new ShopTransport();
		shopTransport.setId(3);
		shopTransport.setTitle("c");
		shopTransport.setSendTplId(1);
		shopTransport.setIsDel(1);
		shopTransport.setUpdatedTime(new Date());
		int i = shopTransportMapper.updateById(shopTransport);
		System.out.println(i);
	}

	/**
	 * 测试删除一条信息
	 */
	@Test
	public void testDeleteById() {
		int i = shopTransportMapper.deleteById(3);
		System.out.println(i);
	}

	/**
	 * 测试查询信息
	 */
	@Test
	public void testSearchShopTransport() {
		Map<String, Object> map = new HashMap<>();
		List<ShopTransport> list = shopTransportMapper.searchShopTransport(map);
		System.out.println(list);
	}
}
