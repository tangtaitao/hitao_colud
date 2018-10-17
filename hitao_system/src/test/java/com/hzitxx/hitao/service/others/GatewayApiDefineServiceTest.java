package com.hzitxx.hitao.service.others;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.GatewayApiDefine;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试GatewayApiDefineService的方法
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class GatewayApiDefineServiceTest {
	@Autowired
	private GatewayApiDefineService service;
	
	/**
	 * 测试查询网关信息
	 */
	@Test
	public void testSelectGatewayApiDefine() {
		ServerResponse<LayuiEntity<GatewayApiDefine>> list =service.selectGatewayApiDefine(null);
		System.out.println(list.getData().getData());
	}
	
	/**
	 * 测试增加网关信息
	 */
	@Test
	public void testAddGatewayApiDefine() {
		GatewayApiDefine gatewayApiDefine=new GatewayApiDefine();
		gatewayApiDefine.setPath("/wj1/**");
		gatewayApiDefine.setServiceId("wujun");
		gatewayApiDefine.setEnabled(0);
		ServerResponse<?> result=service.addGatewayApiDefine(gatewayApiDefine);
		System.out.println(result.getMsg());
	}
	
	/**
	 * 测试根据id修改网关信息
	 */
	@Test
	public void testUpdateById() {
		GatewayApiDefine gatewayApiDefine=new GatewayApiDefine();
		gatewayApiDefine.setId(19);
		gatewayApiDefine.setPath("/wj011/**");
		gatewayApiDefine.setServiceId("wujun01");
		gatewayApiDefine.setEnabled(0);
		ServerResponse<?> result=service.updateById(gatewayApiDefine);
		System.out.println(result.getMsg());
	}
	
	/**
	 * 测试根据id删除网关信息
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<?> reslut= service.deleteById(19);
		System.out.println(reslut.getMsg());
	}
}
