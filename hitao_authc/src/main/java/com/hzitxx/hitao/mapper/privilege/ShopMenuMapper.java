package com.hzitxx.hitao.mapper.privilege;

import java.util.List;

import com.hzitxx.hitao.entity.ShopMenu;

public interface ShopMenuMapper {
	/**
	 * 新增用户信息
	 * @return
	 */
	public int addMenu(ShopMenu shopMenu);
	/**
	 * 修改用户信息
	 * @return
	 */
	public int updateMenu(ShopMenu shopMenu);
	/**
	 * 删除用户信息
	 * @param adminId
	 * @return
	 */
	public int deleteMenu(Integer id);
	/**
	 * 查询所有用户
	 * @param map
	 * @return
	 */
	public List<ShopMenu> findAll();
	/**
	 * 根据ID查询数据
	 * @param adminId
	 * @return
	 */
	public List<ShopMenu> findOne(Integer id);
}
