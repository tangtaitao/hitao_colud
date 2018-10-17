package com.hzitxx.hitao.mapper.order;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopOrderGoods;

/**
 * 操作shop_order_goods表
 * 
 * @author Administrator
 *
 */
public interface ShopOrderGoodsMapper {
	/**
	 * 添加一条数据
	 * 
	 * @param shopOrderGoods
	 * @return
	 */
	int addShopOrderGoods(ShopOrderGoods shopOrderGoods);

	/**
	 * 根据id删除一条数据
	 * 
	 * @param recId
	 * @return
	 */
	int deleteById(Integer recId);

	/**
	 * 更新一条数据
	 * 
	 * @param shopOrderGoods
	 * @return
	 */
	int updateById(ShopOrderGoods shopOrderGoods);

	/**
	 * 根据id查询一条数据
	 * 
	 * @param recId
	 * @return
	 */
	ShopOrderGoods findOne(Integer recId);

	/**
	 * 搜索数据
	 * 
	 * @param map 为空则查询所有数据
	 * @return
	 */
	List<ShopOrderGoods> searchShopOrderGoods(Map<String, Object> map);
}
