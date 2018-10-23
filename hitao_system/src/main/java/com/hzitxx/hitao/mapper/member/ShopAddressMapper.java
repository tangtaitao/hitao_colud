package com.hzitxx.hitao.mapper.member;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopAddress;

public interface ShopAddressMapper {
	/**
	 * 查询shop_address中所有数据
	 */
	List<ShopAddress> selectAll(Map<String,Object> map);
	/**
	 * 根据会员编号或者收货人查询数据
	 */
	List<ShopAddress> select(Map<String,Object> map);
	/**
	 * 向shop_address中增加数据
	 */
	int insert(ShopAddress shopAddress);
	/**
	 * 根据会员编号或者收货人修改shop_address中的数据
	 */
	int updateById(ShopAddress shopAddress);
	/**
	 * 根据会员id删除shop_address中的数据
	 */
	int deleteById(Integer id);
}
