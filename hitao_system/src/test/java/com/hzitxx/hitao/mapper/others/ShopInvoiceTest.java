package com.hzitxx.hitao.mapper.others;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.SystemMicroService8083;
import com.hzitxx.hitao.entity.ShopInvoice;

/**
 * 测试ShopInvoiceMapper
 * 
 * @author wujun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SystemMicroService8083.class)
public class ShopInvoiceTest {

	@Autowired
	private ShopInvoiceMapper mapper;

	/**
	 * 测试增加商品发票信息
	 */
	@Test
	public void testAddShopInvoice() {
		ShopInvoice shopInvoice = new ShopInvoice();
		shopInvoice.setMemberId(10);
		shopInvoice.setInvState(1);
		shopInvoice.setInvTitle("普通发票");
		int result = mapper.addShopInvoice(shopInvoice);
		System.out.println(result);
	}
	
	
	/**
	 * 测试查询商品发票信息
	 */
	@Test
	public void testSelectShopInvoice() {
		List<ShopInvoice> result= mapper.selectShopInvoice(null);
		System.out.println(result);
	}
	
	/**
	 * 测试根据id修改商品发票信息
	 */
	@Test
	public void testUpdateById() {
		ShopInvoice shopInvoice = new ShopInvoice();
		shopInvoice.setInvId(1);
		shopInvoice.setMemberId(12);
		shopInvoice.setInvState(2);
		shopInvoice.setInvTitle("增值税发票");
		int result = mapper.updateById(shopInvoice);
		System.out.println(result);
	}
	
	/**
	 * 测试根据id删除商品发票信息
	 */
	@Test
	public void testDeleteById() {
		int result = mapper.deleteById(1);
		System.out.println(result);
	}
}
