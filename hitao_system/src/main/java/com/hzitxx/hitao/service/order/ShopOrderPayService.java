package com.hzitxx.hitao.service.order;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer;
import com.hzitxx.hitao.entity.ShopOrderPay;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

public interface ShopOrderPayService {
	/**
	 * 添加一条数据
	 * 
	 * @param shopOrderPay
	 * @return
	 */
	ServerResponse<Integer> addShopOrderPay(ShopOrderPay shopOrderPay);

	/**
	 * 根据id删除一条数据
	 * 
	 * @param payId
	 * @return
	 */
	ServerResponse<Integer> deleteById(Integer payId);

	/**
	 * 更新一条数据
	 * 
	 * @param shopOrderPay
	 * @return
	 */
	ServerResponse<Integer> updateById(ShopOrderPay shopOrderPay);

	/**
	 * 根据id查询一条数据
	 * 
	 * @param payId
	 * @return
	 */
	ServerResponse<ShopOrderPay> findOne(Integer payId);

	/**
	 * 搜索数据
	 * 
	 * @param map 为空则查询所有数据
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopOrderPay>> searchShopOrderPay(Map<String, Object> map,int page,int limit);
}
