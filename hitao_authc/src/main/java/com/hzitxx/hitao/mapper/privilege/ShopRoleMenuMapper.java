package com.hzitxx.hitao.mapper.privilege;

import java.util.List;

import com.hzitxx.hitao.entity.ShopRoleMenu;

public interface ShopRoleMenuMapper {
	/**
	 * 新增
	 * @param SRM
	 * @return
	 */
	public int addSRM(ShopRoleMenu SRM);
	/**
	 * 修改
	 * @param SRM
	 * @return
	 */
	public int updateSRM(ShopRoleMenu SRM);
	/**
	 * 删除
	 * @param SRM
	 * @return
	 */
	public int deleteSRM(Integer id);
	/**
	 * 查询所有数据
	 * @return
	 */
	public List<ShopRoleMenu> findAll();
	/**
	 * 查询一条数据
	 * @param id
	 * @return
	 */
	public List<ShopRoleMenu> findOne(Integer id);
}
