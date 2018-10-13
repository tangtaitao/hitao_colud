package com.hzitxx.hitao.mapper;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopOrder;

/**
 * 操作shop_order表
 * 
 * @author Administrator
 *
 */
public interface ShopOrderMapper {
	/**
	 * 添加一条数据
	 * 
	 * @param shopOrder 新增的用户对象
	 * @return
	 */
	int addShopOrder(ShopOrder shopOrder);

	/**
	 * 根据id删除一条数据
	 * 
	 * @param orderId 订单id
	 * @return
	 */
	int deleteById(Integer orderId);

	/**
	 * 根据id查询一条数据
	 * 
	 * @param orderId 订单id
	 * @return
	 */
	ShopOrder findOne(Integer orderId);

	/**
	 * 查询数据
	 * 
	 * @param map 用户搜索的数据信息，为空则为查询所有数据
	 * @return
	 */
	List<ShopOrder> searchShopOrder(Map<String, Object> map);

	/**
	 * 根据id修改数据（包括逻辑删除）
	 * 
	 * @param shopOrder 用户修改的数据
	 * @return
	 */
	int updateById(ShopOrder shopOrder);
}
