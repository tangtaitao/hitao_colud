package com.hzitxx.hitao.privilege.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.AuthcMicroService8082;
import com.hzitxx.hitao.entity.ShopAdminRole;
import com.hzitxx.hitao.mapper.privilege.ShopAdminRoleMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AuthcMicroService8082.class)
public class ShopAdminRoleMapperTest {
	@Autowired
	private ShopAdminRoleMapper mapper;
	
	@Test
	public void ADDSAR() {
		ShopAdminRole SAR=new ShopAdminRole();	
		SAR.setAdminId(12);
		SAR.setRoleId(12);
		mapper.addSAR(SAR);
		System.out.println(mapper.addSAR(SAR));
	}
	@Test
	public void deleteSAR() {
		mapper.deleteSAR(50);
	}
	@Test
	public void updateSAR() {
		ShopAdminRole SAR=new ShopAdminRole();
		SAR.setId(49);
		SAR.setAdminId(13);
		SAR.setRoleId(18);
		mapper.updateSAR(SAR);
	}
	@Test
	public void findOne() {
		mapper.findOne(49);
		System.out.println(mapper.findOne(49));
	}
	@Test
	public void findAll() {
		mapper.findAll();
		System.out.println(mapper.findAll());
	}
}
