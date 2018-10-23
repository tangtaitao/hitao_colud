package com.hzitxx.hitao.controller.member;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzitxx.hitao.entity.ShopFavorites;
import com.hzitxx.hitao.service.member.ShopFavoritesService;
import com.hzitxx.hitao.utils.ServerResponse;

@Controller
@RequestMapping("/shopFavorites")
public class ShopFavoritesController {
	@Autowired
	private ShopFavoritesService service;
	/**
	 * 查询所有数据
	 */
	@GetMapping("/selectAll")
	@ResponseBody
	public ServerResponse selectAll() {
		return service.selectAll();
	}
	/**
	 * 根据id查询数据
	 */
	@PostMapping("/selectById")
	@ResponseBody
	public ServerResponse selectById(int favId) {
		return service.selectById(favId);
	}
	/**
	 * 增加数据
	 */
	@PostMapping("/add")
	@ResponseBody
	public ServerResponse add(@RequestBody ShopFavorites shopFavorite) {
		return service.add(shopFavorite);
	}
	/**
	 * 根据id修改数据
	 */
	@PostMapping("/updateById")
	@ResponseBody
	public ServerResponse updateById(@RequestBody ShopFavorites shopFavorite) {
		return service.updateById(shopFavorite);
	}
	/**
	 * 根据id删除数据
	 */
	@PostMapping("/deleteById")
	@ResponseBody
	public ServerResponse deleteById(int favId) {
		return service.deleteById(favId);
	}
	/**
	 * 分页查询数据
	 */
	@GetMapping("/page")
	@ResponseBody
	public ServerResponse page(@RequestParam(value="page",defaultValue="1")int page,@RequestParam(value="limit",defaultValue="10")int limit,Map<String,Object>map) {
		return service.page(page, limit, null);
	}
}
