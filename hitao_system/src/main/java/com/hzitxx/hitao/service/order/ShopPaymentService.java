package com.hzitxx.hitao.service.order;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopPayment;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 操作shop_payment表
 * 
 * @author Administrator
 *
 */
public interface ShopPaymentService {
	/**
	 * 添加一条信息
	 * 
	 * @param shopPayment
	 * @return
	 */
	ServerResponse<Integer> addShopPayment(ShopPayment shopPayment);

	/**
	 * 根据id删除一条数据
	 * 
	 * @param paymentId
	 * @return
	 */
	ServerResponse<Integer> deleteById(Integer paymentId);

	/**
	 * 根据Id更新数据
	 * 
	 * @param shopPayment
	 * @return
	 */
	ServerResponse<Integer> updateById(ShopPayment shopPayment);

	/**
	 * 根据Id查询一条信息
	 * 
	 * @param paymentId
	 * @return
	 */
	ServerResponse<ShopPayment> findOne(Integer paymentId);

	/**
	 * 搜索数据
	 * 
	 * @param map 用户搜索的数据信息，为空则为查询所有数据
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopPayment>> searchShopPayment(Map<String, Object> map,int page,int limit);
}
