package com.hzitxx.hitao.service.privilege;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopAdmin;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

public interface ShopAdminService {

	/**
	 * 新增用户信息
	 * 
	 * @return
	 */
	// public int addAdmin(ShopAdmin shopAdmin);
	public ServerResponse<Integer> addAdmin(ShopAdmin shopAdmin);

	/**
	 * 修改用户信息
	 * 
	 * @return
	 */
	// public int updateAdmin(ShopAdmin shopAdmin);
	public ServerResponse<Integer> updateAdmin(ShopAdmin shopAdmin);

	/**
	 * 删除用户信息
	 * 
	 * @param adminId
	 * @return
	 */
	// public int deleteAdmin(Integer adminId);
	public ServerResponse<Integer> deleteAdmin(Integer adminId);

	/**
	 * 查询所有用户
	 * 
	 * @param map
	 * @return
	 */
	// public List<ShopAdmin> findAll(Map<String,Object> map);
	public ServerResponse<LayuiEntity<ShopAdmin>> LayuiEntity(Map<String, Object> map,int page, int limit);

	/**
	 * 根据ID查询数据
	 * 
	 * @param adminId
	 * @return
	 */
	// public List<ShopAdmin> findOne(Integer adminId);
	public ServerResponse<ShopAdmin> findOne(Integer adminId);

	/**
	 * 登录
	 * 
	 * @param adminName
	 * @param adminPassword
	 * @return
	 */
	public ServerResponse<Map<String, Object>> login(ShopAdmin shopAdmin);

	/**
	 * 检查用户名是否存在
	 * 
	 * @param adminName
	 * @return
	 */
	public ServerResponse<Integer> checkExists(String adminName);
}
