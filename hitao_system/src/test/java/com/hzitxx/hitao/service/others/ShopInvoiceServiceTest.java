package com.hzitxx.hitao.service.others;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopInvoice;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 测试ShopInvoiceService
 * 
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopInvoiceServiceTest {

	@Autowired
	private ShopInvoiceService service;

	/**
	 * 测试增加商品发票信息
	 */
	@Test
	public void testAddShopInvoice() {
		ShopInvoice shopInvoice = new ShopInvoice();
		shopInvoice.setMemberId(10);
		shopInvoice.setInvState(1);
		shopInvoice.setInvTitle("普通发票1");
		ServerResponse<?> result = service.addShopInvoice(shopInvoice);
		System.out.println(result.getMsg());
	}
	
	
	/**
	 * 测试查询商品发票信息
	 */
	@Test
	public void testSelectShopInvoice() {
		ServerResponse<LayuiEntity<ShopInvoice>> result= service.selectShopInvoice(null);
		System.out.println(result.getData().getData());
	}
	
	/**
	 * 测试根据id修改商品发票信息
	 */
	@Test
	public void testUpdateById() {
		ShopInvoice shopInvoice = new ShopInvoice();
		shopInvoice.setInvId(2);
		shopInvoice.setMemberId(12);
		shopInvoice.setInvState(2);
		shopInvoice.setInvTitle("增值税发票");
		ServerResponse<?> result = service.updateById(shopInvoice);
		System.out.println(result.getMsg());
	}
	
	/**
	 * 测试根据id删除商品发票信息
	 */
	@Test
	public void testDeleteById() {
		ServerResponse<?> result = service.deleteById(3);
		System.out.println(result.getMsg());
	}
}
