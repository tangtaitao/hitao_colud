package com.hzitxx.hitao.service.member;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.hzitxx.hitao.entity.ShopFavorites;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

public interface ShopFavoritesService {
	
	/**
	 * 查询所有数据
	 */
	ServerResponse selectAll();
	/**
	 * 根据id查询数据
	 */
	ServerResponse selectById(int favId);
	/**
	 * 增加数据
	 */
	ServerResponse add(ShopFavorites shopFavorite);
	/**
	 * 根据id修改数据
	 */
	ServerResponse updateById(ShopFavorites shopFavorite);
	/**
	 * 根据id删除数据
	 */
	ServerResponse deleteById(int favId);
	/**
	 * 分页查询
	 */
	ServerResponse<LayuiEntity<ShopFavorites>> page(int page,int limit,Map<String,Object>map);
}
