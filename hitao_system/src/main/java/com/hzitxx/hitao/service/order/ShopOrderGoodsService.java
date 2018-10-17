package com.hzitxx.hitao.service.order;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopOrderGoods;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

public interface ShopOrderGoodsService {
	/**
	 * 添加一条数据
	 * 
	 * @param shopOrderGoods
	 * @return
	 */
	ServerResponse<Integer> addShopOrderGoods(ShopOrderGoods shopOrderGoods);

	/**
	 * 根据id删除一条数据
	 * 
	 * @param recId
	 * @return
	 */
	ServerResponse<Integer> deleteById(Integer recId);

	/**
	 * 更新一条数据
	 * 
	 * @param shopOrderGoods
	 * @return
	 */
	ServerResponse<Integer> updateById(ShopOrderGoods shopOrderGoods);

	/**
	 * 根据id查询一条数据
	 * 
	 * @param recId
	 * @return
	 */
	ServerResponse<ShopOrderGoods> findOne(Integer recId);

	/**
	 * 搜索数据
	 * 
	 * @param map 为空则查询所有数据
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopOrderGoods>> searchShopOrderGoods(Map<String, Object> map, int page, int limit);

}
