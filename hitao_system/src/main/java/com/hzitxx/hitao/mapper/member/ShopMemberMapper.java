package com.hzitxx.hitao.mapper.member;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopMember;

public interface ShopMemberMapper {
	/**
	 * shop_member的查询
	 */
	List<ShopMember> selectAll();
	/**
	 * 根据id修改shop_member
	 */
	int updateShopMember(ShopMember shopMember);
	/**
	 * 向shop_member中增加数据
	 */
	int insertShopMember(ShopMember shopMember);
	/**
	 * 根据id逻辑删除shop_member中数据
	 */
	int deleteById(Map<String,Object>map);
	
	/**
	 * 根据id 查询数据
	 */
	ShopMember selectById(int memberId);
}
