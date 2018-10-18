package com.hzitxx.hitao.mapper.privilege;

import java.util.List;

import com.hzitxx.hitao.entity.ShopAdminRole;

public interface ShopAdminRoleMapper {
	/**
	 *  新增
	 * @param SAR
	 * @return
	 */
	public int addSAR(ShopAdminRole SAR);
	/**
	 *  修改
	 * @param SAR
	 * @return
	 */
	public int updateSAR(ShopAdminRole SAR);
	/**
	 *  根据id删除用户
	 * @param id
	 * @return
	 */
	public int deleteSAR(Integer id);
	/**
	 *  查询所有的数据
	 * @return
	 */
	public List<ShopAdminRole> findAll();
	/**
	 * 根据id查询一条数据
	 * @param id
	 * @return
	 */
	public List<ShopAdminRole> findOne(Integer id);
}
