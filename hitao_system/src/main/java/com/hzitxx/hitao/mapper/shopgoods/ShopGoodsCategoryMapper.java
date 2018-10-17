package com.hzitxx.hitao.mapper.shopgoods;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopGoodsCategory;

/**
 * 商品分类接口
 * @author wujun
 *
 */
public interface ShopGoodsCategoryMapper {

	/**
	 * 增加商品分类表
	 * @param shopGoodsCategory
	 * @return
	 */
	int addShopGoodsCategory(ShopGoodsCategory shopGoodsCategory);
	
	
	/**
	 * 查询商品分类
	 * @param map
	 * @return
	 */
	List<ShopGoodsCategory> selectShopGoodsCategory(Map<String, Object> map);
	
	
	/**
	 * 根据id修改
	 * @param shopGoodsCategory
	 * @return
	 */
	int updateById(ShopGoodsCategory shopGoodsCategory);
	
	
	/**
	 * 根据id删除
	 * @param catId
	 * @return
	 */
	int deleteById(Integer catId);
}
