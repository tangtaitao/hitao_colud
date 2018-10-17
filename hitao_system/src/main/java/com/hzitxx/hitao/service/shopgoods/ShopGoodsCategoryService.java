package com.hzitxx.hitao.service.shopgoods;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopGoodsCategory;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopGoodsCategoryService接口层
 * 
 * @author wujun
 *
 */
public interface ShopGoodsCategoryService {

	/**
	 * 增加商品分类表
	 * 
	 * @param shopGoodsCategory
	 * @return
	 */
	ServerResponse<?> addShopGoodsCategory(ShopGoodsCategory shopGoodsCategory);

	/**
	 * 查询商品分类
	 * 
	 * @param map
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopGoodsCategory>> selectShopGoodsCategory(Map<String, Object> map);

	/**
	 * 根据id修改
	 * 
	 * @param shopGoodsCategory
	 * @return
	 */
	ServerResponse<?> updateById(ShopGoodsCategory shopGoodsCategory);

	/**
	 * 根据id删除
	 * 
	 * @param catId
	 * @return
	 */
	ServerResponse<?> deleteById(Integer catId);
}
