package com.hzitxx.hitao.service.others;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopSalenum;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopSalenumService接口层
 * @author wujun
 *
 */
public interface ShopSalenumService {

	/**
	 * 增加销售统计信息
	 * @param shopSalenum
	 * @return
	 */
	ServerResponse<?> addShopSalenum(ShopSalenum shopSalenum);
	/**
	 * 查询销售统计信息
	 * 
	 * @param shopSalenum
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopSalenum>> selectShopSalenum(Map<String, Object> map);
	
	
	/**
	 * 根据id修改销售统计信息
	 * @param shopSalenum
	 * @return
	 */
	ServerResponse<?> updateById(ShopSalenum shopSalenum);
	
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	ServerResponse<?> deleteById(Integer id);
}
