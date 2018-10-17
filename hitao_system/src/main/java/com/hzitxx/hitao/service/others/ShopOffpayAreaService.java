package com.hzitxx.hitao.service.others;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopOffpayArea;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopOffpayAreaService接口层
 * @author wujun
 *
 */
public interface ShopOffpayAreaService {

	/**
	 * 增加货到货款支持地区
	 * 
	 * @param shopOffpayArea
	 * @return
	 */
	ServerResponse<?> addShopOffpayArea(ShopOffpayArea shopOffpayArea);

	/**
	 * 查询货到货款支持地区
	 * @param map
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopOffpayArea>> selectShopOffpayArea(Map<String, Object> map);
	
	/**
	 * 根据id修改货到货款支持地区
	 * @param shopOffpayArea
	 * @return
	 */
	ServerResponse<?> updateById(ShopOffpayArea shopOffpayArea);
	
	/**
	 * 根据id删除货到货款支持地区
	 * @param areaId
	 * @return
	 */
	ServerResponse<?> deleteById(String areaId);
}
