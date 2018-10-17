package com.hzitxx.hitao.mapper.order;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopOrderLog;

/**
 * 操作shop_order_log表
 * 
 * @author Administrator
 *
 */
public interface ShopOrderLogMapper {
	/**
	 * 添加一条数据
	 * 
	 * @param shopOrderLog
	 * @return
	 */
	int addShopOrderLog(ShopOrderLog shopOrderLog);

	/**
	 * 根据id删除一条数据
	 * 
	 * @param logId
	 * @return
	 */
	int deleteById(Integer logId);

	/**
	 * 更新一条数据
	 * 
	 * @param shopOrderLog
	 * @return
	 */
	int updateById(ShopOrderLog shopOrderLog);
	
	/**
	 * 根据id查询一条数据
	 * @param logId
	 * @return
	 */
	ShopOrderLog findOne(Integer logId);
	
	/**
	 * 搜索数据
	 * @param map  为空则查询所有数据
	 * @return
	 */
	List<ShopOrderLog> searchShopOrderLog(Map<String, Object> map);
}
