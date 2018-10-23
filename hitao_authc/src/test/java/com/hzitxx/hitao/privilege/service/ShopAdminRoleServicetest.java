package com.hzitxx.hitao.privilege.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.AuthcMicroService8082;
import com.hzitxx.hitao.entity.ShopAdminRole;
import com.hzitxx.hitao.service.privilege.ShopAdminRoleService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AuthcMicroService8082.class)
public class ShopAdminRoleServicetest {
	@Autowired
	private ShopAdminRoleService service;
	
	@Test
	public void addSAR() {
		ShopAdminRole SAR=new ShopAdminRole();
		SAR.setAdminId(66);
		SAR.setRoleId(77);
		service.addSAR(SAR);
	}
	@Test
	public void updateSAR() {
		ShopAdminRole SAR=new ShopAdminRole();
		SAR.setId(52);
		SAR.setAdminId(55);
		SAR.setRoleId(15);
		service.updateSAR(SAR);
	}
	@Test
	public void deleteSAR() {
		service.deleteSAR(52);
	}
}
