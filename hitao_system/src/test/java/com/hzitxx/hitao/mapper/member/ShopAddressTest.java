package com.hzitxx.hitao.mapper.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopAddress;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopAddressTest {
	@Autowired
	private ShopAddressMapper mapper;
	/**
	 * 测试shop_address中查询所有数据
	 */
	@Test
	public void selectAllTest() {
		Map<String,Object> map =new HashMap();
		List<ShopAddress> list = mapper.selectAll(map);
		System.out.println(list);
	}
	/**
	 * 测试向shop_address中增加数据
	 */
	@Test
	public void insertTest() {
		ShopAddress shopAddress = new ShopAddress();
		shopAddress.setMemberName("小弟");
		shopAddress.setProvinceId(456123);
		shopAddress.setCityId(654321);
		shopAddress.setDistrictId(123456);
		int result = mapper.insert(shopAddress);
		System.out.println(result);
	}
	/**
	 * 测试修改shop_address中的数据
	 */
	@Test
	public void updateByIdTest() {
		ShopAddress shopAddress = new ShopAddress();
		shopAddress.setMemberName("大哥");
		shopAddress.setId(19);
		int result = mapper.updateById(shopAddress);
		System.out.println(result);
	}
	/**
	 * 测试根据id删除shop_address中的数据
	 */
	@Test
	public void deleteByIdTest() {
//		ShopAddress shopAddress = new ShopAddress();
//		shopAddress.setId(24);
		int result = mapper.deleteById(24);
		System.out.println(result);
	}
}
