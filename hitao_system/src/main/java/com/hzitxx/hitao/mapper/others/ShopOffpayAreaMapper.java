package com.hzitxx.hitao.mapper.others;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopOffpayArea;

/**
 * 货到货款支持地区接口
 * 
 * @author wujun
 *
 */
public interface ShopOffpayAreaMapper {

	/**
	 * 增加货到货款支持地区
	 * 
	 * @param shopOffpayArea
	 * @return
	 */
	int addShopOffpayArea(ShopOffpayArea shopOffpayArea);

	/**
	 * 查询货到货款支持地区
	 * @param map
	 * @return
	 */
	List<ShopOffpayArea> selectShopOffpayArea(Map<String, Object> map);
	
	/**
	 * 根据id修改货到货款支持地区
	 * @param shopOffpayArea
	 * @return
	 */
	int updateById(ShopOffpayArea shopOffpayArea);
	
	/**
	 * 根据id删除货到货款支持地区
	 * @param areaId
	 * @return
	 */
	int deleteById(String areaId);
}
