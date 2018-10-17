package com.hzitxx.hitao.service.marketing;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopAdvPosition;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 广告位置表的service层
 * 
 * @author Administrator
 *
 */

public interface ShopAdvPositionService {
	/**
	 * 添加一条数据
	 * 
	 * @param shopAdvPosition
	 * @return
	 */
	ServerResponse<Integer> addShopAdvPosition(ShopAdvPosition shopAdvPosition);

	/**
	 * 根据id删除一条信息
	 * 
	 * @param apId
	 * @return
	 */
	ServerResponse<Integer> deleteById(Integer apId);

	/**
	 * 根据id修改数据
	 * 
	 * @param shopAdvPosition
	 * @return
	 */
	ServerResponse<Integer> updateById(ShopAdvPosition shopAdvPosition);

	/**
	 * 根据id查询一条数据
	 * 
	 * @param apid
	 * @return
	 */
	ServerResponse<ShopAdvPosition> findOne(Integer apId);

	/**
	 * 根据用户搜索的信息查询数据并分页
	 * 
	 * @param map 用户搜索的数据信息，为空则为查询所有数据
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopAdvPosition>> searchShopAdvPosition(Map<String, Object> map, int page, int limit);
}
