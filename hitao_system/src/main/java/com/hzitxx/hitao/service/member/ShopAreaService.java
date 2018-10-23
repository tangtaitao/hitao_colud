package com.hzitxx.hitao.service.member;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopArea;
import com.hzitxx.hitao.utils.ServerResponse;

public interface ShopAreaService {
	/**
	 * 查询所有数据
	 */
	ServerResponse selectAll(Map<String,Object> map);
	/**
	 * 根据id查询数据
	 */
	ServerResponse selectOne(int areaId);
	/**
	 * 根据区域名称查询父级区域
	 */
	ServerResponse findShopArea(String areaName);
	/**
	 * 增加数据
	 */
	ServerResponse add(ShopArea shopArea);
	/**
	 * 根据id修改数据
	 */
	ServerResponse updateById(ShopArea shopArea);
	/**
	 * 根据ID删除数据
	 */
	ServerResponse deleteById(ShopArea shopArea);
	/**
	 * 根据id逻辑删除数据
	 */
	ServerResponse delete(ShopArea shopArea);
	/**
	 * 分页查询
	 */
	ServerResponse page(int page,int limit,Map<String,Object> map);
}
