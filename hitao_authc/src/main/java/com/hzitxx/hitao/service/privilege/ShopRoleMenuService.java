package com.hzitxx.hitao.service.privilege;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hzitxx.hitao.entity.ShopRoleMenu;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

@Service
public interface ShopRoleMenuService {
	/**
	 * 新增
	 * @param SRM
	 * @return
	 */
	public ServerResponse<Integer> addSRM(ShopRoleMenu SRM);
	/**
	 * 更新
	 * @param SRM
	 * @return
	 */
	public ServerResponse<Integer> updateSRM(ShopRoleMenu SRM);
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	public ServerResponse<Integer> deleteSRM(Integer id);
	/**
	 * 分页查询
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopRoleMenu>> layuiEntity(int page, int limit);
	/**
	 * 根据id查询一条数据
	 * @param id
	 * @return
	 */
	public ServerResponse<List<ShopRoleMenu>> findOne(Integer id);
}
