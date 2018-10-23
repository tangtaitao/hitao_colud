package com.hzitxx.hitao.service.member;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopMember;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

public interface ShopMemberService {
	/**
	 * 查询
	 * @param shopMember
	 * @return
	 */
	ServerResponse selectAll();
	/**
	 * 增加
	 * @param shopMember
	 * @return
	 */
	ServerResponse insertShopMember(ShopMember shopMember);
	/**
	 * 修改
	 */
	ServerResponse updateShopMember(ShopMember shopMember);
	/**
	 * 根据id逻辑删除
	 */
	ServerResponse deleteById(Map<String,Object>map);
	
	
	/**
	 * 数据查询分页
	 */
	ServerResponse<LayuiEntity<ShopMember>> page(int page,int limit,Map<String,Object> map);
	/**
	 * 根据id 查询数据
	 */
	ServerResponse<ShopMember> selectById(int memberId);
	
}
