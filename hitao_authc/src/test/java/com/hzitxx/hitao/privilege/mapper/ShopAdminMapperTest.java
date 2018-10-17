package com.hzitxx.hitao.privilege.mapper;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.AuthcMicroService8082;
import com.hzitxx.hitao.entity.ShopAdmin;
import com.hzitxx.hitao.mapper.privilege.ShopAdminMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AuthcMicroService8082.class)
public class ShopAdminMapperTest {
	@Autowired
	private ShopAdminMapper mapper;
	
	@Test
	public void login() {
		String adminName="admin";
		String adminPassword="123456";
		Map<String, Object> map=new HashMap<>();
		map.put("adminName", adminName);
		map.put("adminPassword", adminPassword);
		ShopAdmin login = mapper.login(map);
		System.out.println(login);
	}
	@Test
	public void addAdminTest() {
		ShopAdmin shopAdmin=new ShopAdmin();
		shopAdmin.setAdminId(23);
		shopAdmin.setAdminName("longer");
		shopAdmin.setAdminPassword("123456");
		mapper.addAdmin(shopAdmin);
	}
}
