package com.hzitxx.hitao.service.order;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopOrder;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 处理订单
 * 
 * @author Administrator
 *
 */
public interface ShopOrderService {

	/**
	 * 新增订单
	 * 
	 * @param shopOrder
	 * @return
	 */
	ServerResponse<Integer> addShopOrder(ShopOrder shopOrder);

	/**
	 * 根据id删除订单
	 */
	ServerResponse<Integer> deleteById(Integer orderId);

	/**
	 * 更新订单
	 */
	ServerResponse<Integer> updateById(ShopOrder shopOrder);

	/**
	 * 根据id查询一条数据
	 */
	ServerResponse<ShopOrder> findOne(Integer orderId);

	/**
	 * 查询数据及分页
	 * 
	 * @param map
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopOrder>> searchShopOrder(Map<String, Object> map, int page, int limit);
}
