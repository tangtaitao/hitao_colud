package com.hzitxx.hitao.service.order;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopTransport;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopTransportsErvice
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopTransportServiceTest {
	// 自动注入ShopTransportService对象
	@Autowired
	private ShopTransportService shopTransportService;

	/**
	 * 测试添加运费信息
	 */
	@Test
	public void testAddShopTransport() {
		ShopTransport shopTransport = new ShopTransport();
		shopTransport.setCreatedTime(new Date());
		shopTransport.setTitle("jx");
		ServerResponse<Integer> serverResponse = shopTransportService.addShopTransport(shopTransport);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试删除运费信息
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<Integer> serverResponse = shopTransportService.deleteById(1);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试修改运费信息
	 */
	@Test
	public void testUpdateById() {
		ShopTransport shopTransport = new ShopTransport();
		shopTransport.setId(4);
		shopTransport.setIsDel(1);
		shopTransport.setSendTplId(1);
		shopTransport.setTitle("sz");
		shopTransport.setUpdatedTime(new Date());
		ServerResponse<Integer> serverResponse = shopTransportService.updateById(shopTransport);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试查询一条数据
	 */
	@Test
	public void testFindOne() {
		ServerResponse<ShopTransport> serverResponse = shopTransportService.findOne(4);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg() + serverResponse.getData());
	}

	/**
	 * 测试搜索数据，和查询所有并分页
	 */
	@Test
	public void testSearchShopTransport() {
		Map<String, Object> map = new HashMap<>();
		ServerResponse<LayuiEntity<ShopTransport>> serverResponse = shopTransportService.searchShopTransport(map, 1, 1);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg() + serverResponse.getData().getData());
	}
}
