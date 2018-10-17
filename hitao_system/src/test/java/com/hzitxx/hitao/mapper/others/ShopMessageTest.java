package com.hzitxx.hitao.mapper.others;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopMessage;

/**
 * 测试ShopMessageMapper
 * 
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopMessageTest {

	@Autowired
	private ShopMessageMapper mapper;
	
	/**
	 * 测试增加消息
	 */
	@Test
	public void testAddShopMessage() {
		ShopMessage shopMessage=new ShopMessage();
		shopMessage.setMessageParentId(10);
		shopMessage.setFromMemberId(12);
		int result=mapper.addShopMessage(shopMessage);
		System.out.println(result);
	}
	
	/**
	 * 测试查询消息
	 */
	@Test
	public void testSelectShopMessage() {
		List<ShopMessage> result=mapper.selectShopMessage(null);
		System.out.println(result);
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
		int result=mapper.updateById(shopMessage);
		System.out.println(result);
	}
	
	/**
	 * 测试根据id删除消息
	 */
	@Test
	public void testDeleteById() {
		int result=mapper.deleteById(1);
		System.out.println(result);
	}
}
