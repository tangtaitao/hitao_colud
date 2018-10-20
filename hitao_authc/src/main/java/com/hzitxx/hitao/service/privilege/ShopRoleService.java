package com.hzitxx.hitao.service.privilege;

import java.util.List;

import com.hzitxx.hitao.entity.ShopRole;
import com.hzitxx.hitao.utils.ServerResponse;
import com.hzitxx.hitao.utils.LayuiEntity;
public interface ShopRoleService {	
	/**
	 * 新增数据
	 * @param shopRole
	 * @return
	 */
	public ServerResponse<Integer> addRole(ShopRole shopRole);
	/**
	 * 修改数据
	 * @param shopRole
	 * @return
	 */
	public ServerResponse<Integer> updateRole(ShopRole shopRole);
	/**
	 * 删除数据
	 * @param roleId
	 * @return
	 */
	public ServerResponse<Integer> deleteRole(Integer roleId);
	/**
	 * 查询所有数据
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopRole>> LayuiEntity(int page,int limit);
	/**
	 * 查询一条数据
	 * @param roleId
	 * @return
	 */
	public ServerResponse<ShopRole> findOne(Integer roleId);
}
