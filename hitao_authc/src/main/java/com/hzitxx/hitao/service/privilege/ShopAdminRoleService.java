package com.hzitxx.hitao.service.privilege;

import java.util.List;

import com.hzitxx.hitao.entity.ShopAdminRole;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

public interface ShopAdminRoleService {
	/**
	 *  新增
	 * @param SAR
	 * @return
	 */
	public ServerResponse<Integer> addSAR(ShopAdminRole SAR);
	/**
	 *  修改
	 * @param SAR
	 * @return
	 */
	public ServerResponse<Integer> updateSAR(ShopAdminRole SAR);
	/**
	 *  根据id删除用户
	 * @param id
	 * @return
	 */
	public ServerResponse<Integer> deleteSAR(Integer id);
	/**
	 *  查询所有的数据
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopAdminRole>> findAll(int page,int limit);
	/**
	 * 根据id查询一条数据
	 * @param id
	 * @return
	 */
	public ServerResponse<List<ShopAdminRole>> findOne(Integer id);
}
