package com.hzitxx.hitao.service.member;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopAddress;

import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

public interface ShopAddressService {
	/**
	 * 查询所有数据
	 */
	ServerResponse selectAll(Map<String,Object> map);
	/**
	 * 根据会员编号或者收货人查询数据
	 */
	ServerResponse select(Map<String,Object> map);
	/**
	 * 增加数据
	 */
	ServerResponse<ShopAddress> insert(ShopAddress shopAddress);
	/**
	 * 修改数据
	 */
	ServerResponse<ShopAddress> updateById(ShopAddress shopAddress);
	/**
	 * 删除数据
	 */
	ServerResponse<ShopAddress> deleteById(Integer id);
	/**
	 * 分页查询
	 */
	ServerResponse page(int page,int limit,Map<String,Object> map);
}
