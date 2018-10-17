package com.hzitxx.hitao.service.others;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopMessage;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopMessageService的方法
 * 
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopMessageServiceTest {

	@Autowired
	private ShopMessageService service;
	/**
	 * 测试增加消息
	 */
	@Test
	public void testAddShopMessage() {
		ShopMessage shopMessage=new ShopMessage();
		shopMessage.setMessageParentId(10);
		shopMessage.setFromMemberId(12);
		ServerResponse<?> result=service.addShopMessage(shopMessage);
		System.out.println(result.getMsg());
	}
	
	/**
	 * 测试查询消息
	 */
	@Test
	public void testSelectShopMessage() {
		ServerResponse<LayuiEntity<ShopMessage>> result=service.selectShopMessage(null);
		System.out.println(result.getData().getData());
	}
	
	/**
	 * 测试根据id修改消息
	 */
	@Test
	public void testUpdateById() {
		ShopMessage shopMessage=new ShopMessage();
		shopMessage.setMessageId(1);
		shopMessage.setMessageParentId(13);
		shopMessage.setFromMemberId(12);
		ServerResponse<?> result=service.updateById(shopMessage);
		System.out.println(result.getMsg());
	}
	
	/**
	 * 测试根据id删除消息
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<?> result=service.deleteById(1);
		System.out.println(result.getMsg());
	}
}
