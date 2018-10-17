package com.hzitxx.hitao.service.order;
/**
 * 测试ShopPaymentService
 * @author Administrator
 *
 */

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopPayment;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopPaymentServiceTest {
	// 自动注入service对象
	@Autowired
	private ShopPaymentService shopPaymentService;

	/**
	 * 测试添加一条信息
	 * 
	 * @param shopPayment
	 * @return
	 */
	@Test
	public void testAddShopPayment() {
		ShopPayment shopPayment = new ShopPayment();
		shopPayment.setCreatedTime(new Date());
		shopPayment.setPaymentCode("2");
		shopPayment.setPaymentId(1);
		shopPayment.setPaymentState(0);
		ServerResponse<Integer> serverResponse = shopPaymentService.addShopPayment(shopPayment);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试根据id删除一条数据
	 * 
	 * @param paymentId
	 * @return
	 */
	@Test
	public void testDeletebyId() {
		ServerResponse<Integer> serverResponse = shopPaymentService.deleteById(2);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试根据Id更新数据
	 * 
	 * @param shopPayment
	 * @return
	 */
	@Test
	public void testUpdateById() {
		ShopPayment shopPayment = new ShopPayment();
		shopPayment.setPaymentId(2);
		shopPayment.setUpdatedTime(new Date());
		shopPayment.setIsDel(1);
		ServerResponse<Integer> serverResponse = shopPaymentService.updateById(shopPayment);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg());
	}

	/**
	 * 测试根据Id查询一条信息
	 * 
	 * @param paymentId
	 * @return
	 */
	@Test
	public void testFindOne() {
		ServerResponse<ShopPayment> serverResponse = shopPaymentService.findOne(1);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg() + serverResponse.getData());
	}

	/**
	 * 测试搜索数据并分页
	 * 
	 * @param map 用户搜索的数据信息，为空则为查询所有数据
	 * @return
	 */
	@Test
	public void testSearchShopPayment() {
		Map<String, Object> map = new HashMap<>();
		ServerResponse<LayuiEntity<ShopPayment>> serverResponse = shopPaymentService.searchShopPayment(map, 1, 10);
		System.out.println(serverResponse.getStatus() + serverResponse.getMsg() + serverResponse.getData().getData());
	}
}
