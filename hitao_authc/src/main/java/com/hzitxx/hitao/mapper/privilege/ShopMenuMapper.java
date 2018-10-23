package com.hzitxx.hitao.mapper.privilege;

import java.util.List;

import com.hzitxx.hitao.entity.ShopMenu;
import com.hzitxx.hitao.utils.TreeDataUtil;

public interface ShopMenuMapper {
	/**
	 * 新增用户信息
	 * 
	 * @return
	 */
	public int addMenu(ShopMenu shopMenu);

	/**
	 * 修改用户信息
	 * 
	 * @return
	 */
	public int updateMenu(ShopMenu shopMenu);

	/**
	 * 删除用户信息
	 * 
	 * @param adminId
	 * @return
	 */
	public int deleteMenu(Integer id);

	/**
	 * 查询所有用户
	 * 
	 * @param map
	 * @return
	 */
	public List<ShopMenu> findAll();

	/**
	 * 根据ID查询数据
	 * 
	 * @param adminId
	 * @return
	 */
	public ShopMenu findOne(Integer id);

	/**
	 * 根据父id查询数据(供树状结构使用)
	 * 
	 * @param parentId
	 * @return
	 */
	public List<TreeDataUtil> findByParentId(Integer parentId);

	/**
	 * 根据id查询数据(供树状结构使用)
	 */
	public TreeDataUtil findById(Integer id);
}
