package com.hzitxx.hitao.mapper.member;

import java.util.List;

import com.hzitxx.hitao.entity.ShopFavorites;

public interface ShopFavoritesMapper {
	/**
	 * 查询所有数据
	 */
	List<ShopFavorites> selectAll();
	/**
	 * 根据id查询数据
	 */
	List<ShopFavorites> selectById(int favId);
	/**
	 * 增加数据
	 */
	int add(ShopFavorites shopFavorite);
	/**
	 * 根据id修改数据
	 */
	int updateById(ShopFavorites shopFavorite);
	/**
	 * 根据id删除数据
	 */
	int deleteById(int favId);
}
