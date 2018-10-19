package com.hzitxx.hitao.privilege.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.AuthcMicroService8082;
import com.hzitxx.hitao.entity.ShopAdmin;
import com.hzitxx.hitao.mapper.privilege.ShopAdminMapper;
import com.hzitxx.hitao.mapper.privilege.ShopMenuMapper;
import com.hzitxx.hitao.utils.TreeDataUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AuthcMicroService8082.class)
public class ShopAdminMapperTest {
	@Autowired
	private ShopAdminMapper mapper;
	@Autowired
	private ShopMenuMapper mapper1;
	
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
	@Test
	public void testFindByParentId() {
	 List<TreeDataUtil> findByParentId = mapper1.findByParentId(1);
		System.out.println(findByParentId);
	}
	
}
