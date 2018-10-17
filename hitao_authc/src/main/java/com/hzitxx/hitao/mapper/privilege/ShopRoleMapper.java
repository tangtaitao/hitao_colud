package com.hzitxx.hitao.mapper.privilege;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopRole;

public interface ShopRoleMapper {
	/**
	 * 新增用户信息
	 * @return
	 */
	public int addRole(ShopRole shopRole);
	/**
	 * 修改用户信息
	 * @return
	 */
	public int updateRole(ShopRole shopRole);
	/**
	 * 删除用户信息
	 * @param adminId
	 * @return
	 */
	public int deleteRole(Integer roleId);
	/**
	 * 查询所有用户
	 * @param map
	 * @return
	 */
	public List<ShopRole> findAll();
	/**
	 * 根据ID查询数据
	 * @param adminId
	 * @return
	 */
	public List<ShopRole> findOne(Integer roleId);
}
