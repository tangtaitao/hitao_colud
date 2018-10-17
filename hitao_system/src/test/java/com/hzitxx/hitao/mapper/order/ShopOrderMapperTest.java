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
import com.hzitxx.hitao.entity.ShopOrder;
import com.hzitxx.hitao.mapper.order.ShopOrderMapper;

/**
 * 测试ShopOrderMapper
 * 
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopOrderMapperTest {
//自动注入mapper对象
	@Autowired
	private ShopOrderMapper shopOrderMapper;

	/**
	 * 测试添加订单
	 */
	@Test
	public void testAddShopOrder() {
		ShopOrder shopOrder = new ShopOrder();
		shopOrder.setAddTime(new Date());
		shopOrder.setBuyerEmail("123465@qq.com");
		shopOrder.setBuyerId(2);
		shopOrder.setBuyerName("123");
		shopOrder.setCreatedTime(new Date());
		shopOrder.setDelayTime(new Date());
		shopOrder.setEvaluationState(2);
		shopOrder.setFinnshedTime(new Date());
		shopOrder.setGoodsAmount(1L);
//		shopOrder.setIsDel(0);
		shopOrder.setLockState(0);
		shopOrder.setOrderAmount(2L);
		shopOrder.setOrderSn(2L);
		shopOrder.setOrderState(1);
		shopOrder.setPaymentCode("123");
		shopOrder.setPaymentTime(new Date());
		shopOrder.setPaySn(2L);
		shopOrder.setPdAmount(2L);
		shopOrder.setRefundAmount(2L);
		shopOrder.setRefundState(0);
		shopOrder.setShippingCode("123");
		shopOrder.setShippingFee(2L);
		int i = shopOrderMapper.addShopOrder(shopOrder);
		System.out.println(i);
	}

	/**
	 * 测试删除一条信息
	 */
	@Test
	public void testDeleteById() {
		int i = shopOrderMapper.deleteById(2);
		System.out.println(i);
	}

	/**
	 * 测试根据id查询一条信息
	 */
	@Test
	public void testFindOne() {
		ShopOrder shopOrder = shopOrderMapper.findOne(1);
		System.out.println(shopOrder);
	}

	/**
	 * 测试查询数据
	 */
	@Test
	public void testSearchShopOrder() {
		Map<String, Object> map = new HashMap<>();
		map.put("orderId", 1);
		List<ShopOrder> list = shopOrderMapper.searchShopOrder(map);
		System.out.println(list);
	}

	/**
	 * 测试更新信息（包括逻辑删除）
	 */
	@Test
	public void testUpdateById() {
		ShopOrder shopOrder = new ShopOrder();
		shopOrder.setOrderId(1);
		shopOrder.setIsDel(0);
		shopOrder.setUpdatedTime(new Date());
		int i = shopOrderMapper.updateById(shopOrder);
		System.out.println(i);
	}

}
