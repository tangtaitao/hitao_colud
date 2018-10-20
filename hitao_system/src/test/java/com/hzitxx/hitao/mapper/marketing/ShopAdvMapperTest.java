package com.hzitxx.hitao.mapper.marketing;

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
import com.hzitxx.hitao.entity.ShopAdv;

/**
 * 测试ShopAdvMapper
 * 
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopAdvMapperTest {
	// 自动注入mapper对象
	@Autowired
	private ShopAdvMapper shopAdvMapper;

	/**
	 * 测试新增一条数据
	 */
	@Test
	public void testAddAdvMapper() {
		ShopAdv shopAdv = new ShopAdv();
		shopAdv.setAdvContent("1");
		shopAdv.setAdvEndDate(new Date());
		shopAdv.setAdvStartDate(new Date());
		shopAdv.setAdvTitle("1");
		shopAdv.setApId(1);
		shopAdv.setBuyStyle("1");
		shopAdv.setClickNum(1);
		shopAdv.setGoldpay(1);
		shopAdv.setIsAllow(1);
		shopAdv.setMemberId(1);
		shopAdv.setMemberName("1");
		shopAdv.setSlideSort(1);
		int i = shopAdvMapper.addShopAdv(shopAdv);
		System.out.println(i);
	}

	/**
	 * 测试删除一条信息
	 */
	@Test
	public void testDeleteById() {
		int i = shopAdvMapper.deleteById(2);
		System.out.println(i);
	}

	/**
	 * 测试更新一条信息
	 */
	@Test
	public void testUpdateById() {
		ShopAdv shopAdv = new ShopAdv();
		shopAdv.setAdvId(3);
		shopAdv.setAdvContent("2");
		shopAdv.setAdvEndDate(new Date());
		shopAdv.setAdvStartDate(new Date());
		shopAdv.setAdvTitle("2");
		shopAdv.setApId(2);
		shopAdv.setBuyStyle("2");
		shopAdv.setClickNum(2);
		shopAdv.setGoldpay(2);
		shopAdv.setIsAllow(2);
		shopAdv.setMemberId(2);
		shopAdv.setMemberName("2");
		shopAdv.setSlideSort(2);
		int i = shopAdvMapper.updateById(shopAdv);
		System.out.println(i);
	}

	/**
	 * 测试查询一条数据
	 */
	@Test
	public void testFindOne() {
		ShopAdv shopAdv = shopAdvMapper.findOne(3);
		System.out.println(shopAdv);
	}

	/**
	 * 测试搜索数据
	 */
	@Test
	public void testSearchShopExpress() {
		Map<String, Object> map = new HashMap<>();
		List<ShopAdv> list = shopAdvMapper.searchShopAdv(map);
		System.out.println(list);
	}
}
