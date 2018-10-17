package com.hzitxx.hitao.mapper.others;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopSetting;
import com.hzitxx.hitao.mapper.others.ShopSettingMapper;

/**
 * 测试ShopSettingMapper
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopSettingTest {

	@Autowired
	private ShopSettingMapper mapper;

	/**
	 * 测试查询系统设置
	 */
	@Test
	public void testSelectShopSetting() {
		List<ShopSetting> list = mapper.selectShopSetting(null);
		System.out.println(list);
	}

	/**
	 * 测试增加系统设置
	 */
	@Test
	public void testAddShopSetting() {
		ShopSetting shopSetting = new ShopSetting();
		shopSetting.setName("消息管理");
		shopSetting.setValue("/msg");
		int result = mapper.addShopSetting(shopSetting);
		System.out.println(result);
	}

	/**
	 * 测试柑橘id修改系统设置
	 */
	@Test
	public void testUpdateById() {
		ShopSetting shopSetting = new ShopSetting();
		shopSetting.setId(1);
		shopSetting.setName("消息管理12");
		shopSetting.setValue("/msg");
		int result = mapper.updateById(shopSetting);
		System.out.println(result);
	}

	/**
	 * 测试根据id删除系统设置
	 */
	@Test
	public void testDeleteById() {
		int result = mapper.deleteById(1);
		System.out.println(result);
	}
}
