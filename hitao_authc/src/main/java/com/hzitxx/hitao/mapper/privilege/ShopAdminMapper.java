package com.hzitxx.hitao.mapper.privilege;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopAdmin;


public interface ShopAdminMapper {
	/**
	 * 新增用户信息
	 * @return
	 */
	public int addAdmin(ShopAdmin shopAdmin);
	/**
	 * 注册时判断用户名是否存在
	 * @param adminName
	 * @return
	 */
	public int findAdminName(String adminName);
	/**
	 * 修改用户信息
	 * @return
	 */
	public int updateAdmin(ShopAdmin shopAdmin);
	/**
	 * 删除用户信息
	 * @param adminId
	 * @return
	 */
	public int deleteAdmin(Integer adminId);
	/**
	 * 查询所有用户
	 * @param map
	 * @return
	 */
	public List<ShopAdmin> findAll(Map<String, Object> map);
	/**
	 * 根据ID查询数据
	 * @param adminId
	 * @return
	 */
	public List<ShopAdmin> findOne(Integer adminId);
	/**
	 * 登录
	 * @return
	 */
	public ShopAdmin login(Map<String,Object> map);
}
