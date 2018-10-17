package com.hzitxx.hitao.mapper.shopgoods;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopFrontCategory;

/**
 * 类目信息接口
 * @author wujun
 *
 */
public interface ShopFrontCategoryMapper {

	/**
	 * 增加类目
	 * 
	 * @param shopFrontCategory
	 * @return
	 */
	int addShopFrontCategory(ShopFrontCategory shopFrontCategory);

	/**
	 * 查询类目信息
	 * 
	 * @param map
	 * @return
	 */
	List<ShopFrontCategory> selectShopFrontCategory(Map<String, Object> map);

	
	/**
	 * 根据id修改类目信息
	 * @param shopFrontCategory
	 * @return
	 */
	int updateById(ShopFrontCategory shopFrontCategory);
	
	/**
	 * 根据id删除类目信息
	 * @param frontCatId
	 * @return
	 */
	int deleteById(Integer frontCatId);
}
