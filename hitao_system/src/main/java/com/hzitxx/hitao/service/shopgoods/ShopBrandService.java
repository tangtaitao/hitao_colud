package com.hzitxx.hitao.service.shopgoods;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopBrand;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopBrandService接口层
 * @author wujun
 *
 */
public interface ShopBrandService {

	/**
	 * 增加品牌
	 * @param shopBrand
	 * @return
	 */
	ServerResponse<?> addShopBrand(ShopBrand shopBrand);
	
	/**
	 * 查询品牌信息
	 * @param map
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopBrand>> selectShopBrand(Map<String, Object> map );
	
	/**
	 * 根据id修改
	 * @param shopBrand
	 * @return
	 */
	ServerResponse<?> updateById(ShopBrand shopBrand);
	
	/**
	 * 根据id删除品牌信息
	 * @param brandId
	 * @return
	 */
	ServerResponse<?> deleteById(Integer brandId);

	/**
	 * 根据id批量删除品牌信息
	 * @param ids
	 * @return
	 */
	ServerResponse<?> deleteByIds(String[] ids);
}
