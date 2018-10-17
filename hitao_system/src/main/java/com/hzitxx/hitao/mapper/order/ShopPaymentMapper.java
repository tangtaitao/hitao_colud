package com.hzitxx.hitao.mapper.order;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopPayment;

/**
 * 操作shop_payment表
 * 
 * @author Administrator
 *
 */
public interface ShopPaymentMapper {
	/**
	 * 添加一条信息
	 * 
	 * @param shopPayment
	 * @return
	 */
	int addShopPayment(ShopPayment shopPayment);

	/**
	 * 根据id删除一条数据
	 * 
	 * @param paymentId
	 * @return
	 */
	int deleteById(Integer paymentId);

	/**
	 * 根据Id更新数据
	 * 
	 * @param shopPayment
	 * @return
	 */
	int updateById(ShopPayment shopPayment);

	/**
	 * 根据Id查询一条信息
	 * 
	 * @param paymentId
	 * @return
	 */
	ShopPayment findOne(Integer paymentId);

	/**
	 * 搜索数据
	 * 
	 * @param map 用户搜索的数据信息，为空则为查询所有数据
	 * @return
	 */
	List<ShopPayment> searchShopPayment(Map<String, Object> map);
}
