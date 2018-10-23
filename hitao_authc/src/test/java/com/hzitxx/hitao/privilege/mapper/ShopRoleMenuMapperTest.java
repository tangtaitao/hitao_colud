package com.hzitxx.hitao.privilege.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.AuthcMicroService8082;
import com.hzitxx.hitao.entity.ShopRoleMenu;
import com.hzitxx.hitao.mapper.privilege.ShopRoleMenuMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AuthcMicroService8082.class)
public class ShopRoleMenuMapperTest {
	@Autowired
	private ShopRoleMenuMapper mapper;
	@Test
	public void addSRM() {
		ShopRoleMenu SRM=new ShopRoleMenu();
		SRM.setMenuId(66);
		SRM.setRoleId(12);
		mapper.addSRM(SRM);
	}
	@Test
	public void updateSMR() {
		ShopRoleMenu SRM=new ShopRoleMenu();
		SRM.setMenuId(77);
		SRM.setRoleId(18);
		mapper.updateSRM(SRM);
	}
	@Test
	public void deleteSRM() {
		mapper.deleteSRM(39);
	}
	@Test
	public void findOne() {
		mapper.findOne(38);
		System.out.println(mapper.findOne(38));
	}
	@Test
	public void findAll() {
		mapper.findAll();
		System.out.println(mapper.findAll());
	}
}
