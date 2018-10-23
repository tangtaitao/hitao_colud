package com.hzitxx.hitao.service.member;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hzitxx.hitao.entity.ShopFavorites;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopFavoritesTest {
	@Autowired
	private ShopFavoritesService service;
	/**
	 * 测试查询所有数据
	 */
	@Test
	public void selectAllTest() {
		System.out.println(service.selectAll());
	}
	/**
	 * 测试通过id查询数据
	 */
	@Test
	public void selectById() {
		System.out.println(service.selectById(2));
	}
	/**
	 * 测试增加数据
	 */
	@Test
	public void addTest() {
		ShopFavorites shopFavorites = new ShopFavorites();
		shopFavorites.setFavId(8);
		shopFavorites.setMemberId(11);
		shopFavorites.setGoodsId(0);
		shopFavorites.setFavType("1");
		shopFavorites.setGoodsName("角几");
		shopFavorites.setGoodsJingle("2");
		shopFavorites.setMainImage("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1540369839&di=5a71f949686ee7b41709f1f5240be6e6&imgtype=jpg&er=1&src=http%3A%2F%2Fe.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2F91529822720e0cf383ce91c40846f21fbe09aad0.jpg");
		shopFavorites.setFavTime(new Date());
		System.out.println(service.add(shopFavorites));
	}
	/**
	 * 测试根据id修改数据
	 */
	@Test
	public void updateByIdTest() {
		ShopFavorites shopFavorites = new ShopFavorites();
		shopFavorites.setFavId(8);
		shopFavorites.setMemberId(11);
		shopFavorites.setGoodsId(0);
		shopFavorites.setFavType("1");
		shopFavorites.setGoodsName("饭桶");
		shopFavorites.setGoodsJingle("2");
		shopFavorites.setMainImage("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1540369839&di=5a71f949686ee7b41709f1f5240be6e6&imgtype=jpg&er=1&src=http%3A%2F%2Fe.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2F91529822720e0cf383ce91c40846f21fbe09aad0.jpg");
		shopFavorites.setFavTime(new Date());
		//shopFavorites.setFavId(9);
		System.out.println(service.updateById(shopFavorites));
	}
	/**
	 * 测试根据id删除数据
	 */
	@Test
	public void deleteById() {
		System.out.println(service.deleteById(8));
	}
}
