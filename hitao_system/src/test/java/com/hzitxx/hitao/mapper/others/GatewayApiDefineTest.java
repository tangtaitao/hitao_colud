package com.hzitxx.hitao.mapper.others;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.GatewayApiDefine;
import com.hzitxx.hitao.mapper.others.GatewayApiDefineMapper;

/**
 * 测试GatewayApiDefineMapper
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class GatewayApiDefineTest {

	@Autowired
	private GatewayApiDefineMapper mapper;
	
	/**
	 * 测试查询网关信息
	 */
	@Test
	public void testSelectGatewayApiDefine() {
		List<GatewayApiDefine> list =mapper.selectGatewayApiDefine(null);
		System.out.println(list);
	}
	
	/**
	 * 测试增加网关信息
	 */
	@Test
	public void testAddGatewayApiDefine() {
		GatewayApiDefine gatewayApiDefine=new GatewayApiDefine();
		gatewayApiDefine.setPath("/wj/**");
		gatewayApiDefine.setServiceId("wujun");
		gatewayApiDefine.setEnabled(0);
		int result=mapper.addGatewayApiDefine(gatewayApiDefine);
		System.out.println(result);
	}
	
	/**
	 * 测试根据id修改网关信息
	 */
	@Test
	public void testUpdateById() {
		GatewayApiDefine gatewayApiDefine=new GatewayApiDefine();
		gatewayApiDefine.setId(18);
		gatewayApiDefine.setPath("/wj01/**");
		gatewayApiDefine.setServiceId("wujun01");
		gatewayApiDefine.setEnabled(0);
		int result=mapper.updateById(gatewayApiDefine);
		System.out.println(result);
	}
	
	/**
	 * 测试根据id删除网关信息
	 */
	@Test
	public void testDeleteById() {
		int reslut= mapper.deleteById(18);
		System.out.println(reslut);
	}
}
