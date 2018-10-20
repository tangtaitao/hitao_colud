package com.hzitxx.hitao.privilege.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hzitxx.hitao.AuthcMicroService8082;
import com.hzitxx.hitao.entity.ShopRole;
import com.hzitxx.hitao.service.privilege.ShopRoleService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AuthcMicroService8082.class)

public class ShopRoleServiceTest {
	@Autowired
	private ShopRoleService service;
	
	@Test
	public void updateRoleTest() {
		ShopRole shopRole=new ShopRole();
		shopRole.setRoleId(13);
		shopRole.setRoleName("超级无敌宇宙美少女战士");
		service.updateRole(shopRole);
	}
}
