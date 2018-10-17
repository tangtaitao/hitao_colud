package com.hzitxx.hitao.service.others;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopSetting;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopSettingService
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopSettingServiceTest {
	@Autowired
	private ShopSettingService service;

	/**
	 * 测试查询系统设置
	 */
	@Test
	public void testSelectShopSetting() {
		ServerResponse<LayuiEntity<ShopSetting>> list = service.selectShopSetting(null);
		System.out.println(list.getData().getData());
	}

	/**
	 * 测试增加系统设置
	 */
	@Test
	public void testAddShopSetting() {
		ShopSetting shopSetting = new ShopSetting();
		shopSetting.setName("消息管理");
		shopSetting.setValue("/msg");
		ServerResponse<?> result = service.addShopSetting(shopSetting);
		System.out.println(result.getMsg());
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
		ServerResponse<?> result = service.updateById(shopSetting);
		System.out.println(result.getMsg());
	}

	/**
	 * 测试根据id删除系统设置
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<?> result = service.deleteById(1);
		System.out.println(result.getMsg());
	}
}
