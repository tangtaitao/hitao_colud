package com.hzitxx.hitao.privilege.service;

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
import com.hzitxx.hitao.service.privilege.ShopMenuService;
import com.hzitxx.hitao.utils.ServerResponse;
import com.hzitxx.hitao.utils.TreeDataUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AuthcMicroService8082.class)
public class ShopAdminServiceTest {
	@Autowired
	private ShopMenuService service;

	@Test
	public void testFindByParentId() {
		ServerResponse<List<TreeDataUtil>> serverResponse = service.menuTreeData();
		System.out.println(serverResponse);
	}

}
