package com.hzitxx.hitao.mapper;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopOrderLog;
import com.hzitxx.hitao.entity.ShopOrderPay;

/**
 * 操作shop_order_pay表
 * 
 * @author Administrator
 *
 */
public interface ShopOrderPayMapper {
	/**
	 * 添加一条数据
	 * 
	 * @param shopOrderPay
	 * @return
	 */
	int addShopOrderPay(ShopOrderPay shopOrderPay);

	/**
	 * 根据id删除一条数据
	 * 
	 * @param payId
	 * @return
	 */
	int deleteById(Integer payId);

	/**
	 * 更新一条数据
	 * 
	 * @param shopOrderPay
	 * @return
	 */
	int updateById(ShopOrderPay shopOrderPay);

	/**
	 * 根据id查询一条数据
	 * 
	 * @param payId
	 * @return
	 */
	ShopOrderPay findOne(Integer payId);

	/**
	 * 搜索数据
	 * 
	 * @param map 为空则查询所有数据
	 * @return
	 */
	List<ShopOrderPay> searchShopOrderPay(Map<String, Object> map);
}
