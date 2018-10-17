package com.hzitxx.hitao.service.privilege;

import java.util.List;

import com.hzitxx.hitao.entity.ShopMenu;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

public interface ShopMenuService {
	/**
	 * 新增用户信息
	 * @return
	 */
	public ServerResponse<Integer> addMenu(ShopMenu shopMenu);
	/**
	 * 修改用户信息
	 * @return
	 */
	public ServerResponse<Integer> updateMenu(ShopMenu shopMenu);
	/**
	 * 删除用户信息
	 * @param adminId
	 * @return
	 */
	public ServerResponse<Integer> deleteMenu(Integer id);
	/**
	 * 查询所有用户
	 * @param map
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopMenu>> LayuiEntity(int page,int limit);
	/**
	 * 根据ID查询数据
	 * @param adminId
	 * @return
	 */
	public ServerResponse<List<ShopMenu>> findOne(Integer id);

}
