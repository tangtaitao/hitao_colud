package com.hzitxx.hitao.service.shopgoods;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopFrontCategory;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopFrontCategoryService接口层
 * @author wujun
 *
 */
public interface ShopFrontCategoryService {
	/**
	 * 增加类目
	 * 
	 * @param shopFrontCategory
	 * @return
	 */
	ServerResponse<?> addShopFrontCategory(ShopFrontCategory shopFrontCategory);

	/**
	 * 查询类目信息
	 * 
	 * @param map
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopFrontCategory>> selectShopFrontCategory(int page,int limit,Map<String, Object> map);

	
	/**
	 * 根据id修改类目信息
	 * @param shopFrontCategory
	 * @return
	 */
	ServerResponse<?> updateById(ShopFrontCategory shopFrontCategory);
	
	/**
	 * 根据id删除类目信息
	 * @param frontCatId
	 * @return
	 */
	ServerResponse<?> deleteById(Integer frontCatId);
}
