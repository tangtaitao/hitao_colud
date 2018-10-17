package com.hzitxx.hitao.service.order;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopOrderLog;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 处理订单处理记录表
 * 
 * @author Administrator
 *
 */
public interface ShopOrderLogService {
	/**
	 * 新增一条数据
	 * 
	 * @param shopOrderLog
	 * @return
	 */
	ServerResponse<Integer> addShopOrderLog(ShopOrderLog shopOrderLog);

	/**
	 * 根据id删除订单
	 */
	ServerResponse<Integer> deleteById(Integer logId);

	/**
	 * 更新订单
	 */
	ServerResponse<Integer> updateById(ShopOrderLog shopOrderLog);

	/**
	 * 根据id查询一条数据
	 */
	ServerResponse<ShopOrderLog> findOne(Integer logId);

	/**
	 * 查询数据及分页
	 * 
	 * @param map
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopOrderLog>> searchShopOrderLog(Map<String, Object> map, int page, int limit);
}
