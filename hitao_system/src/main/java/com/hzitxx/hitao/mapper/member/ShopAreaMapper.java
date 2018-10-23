package com.hzitxx.hitao.mapper.member;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopArea;

public interface ShopAreaMapper {
	/**
	 * 查询所有数据
	 */
	List<ShopArea> selectAll(Map<String,Object> map);
	/**
	 * 根据id查询数据
	 */
	ShopArea selectOne(int areaId);
	/**
	 * 根据区域名称查询父级区域
	 */
	List<ShopArea> findShopArea(String areaName);
	/**
	 * 根据id修改数据
	 */
	int updateById(ShopArea shopArea);
	/**
	 * 增加数据
	 */
	int add(ShopArea shopArea);
	/**
	 * 根据ID删除数据
	 */
	int deleteById(ShopArea shopArea);
	/**
	 * 根据id逻辑删除数据
	 */
	int delete(ShopArea shopArea);
	
}
