package com.hzitxx.hitao.mapper.shopgoods;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopGoodsAttrTemplate;

/**
 * 商品属性模板接口
 * @author wujun
 *
 */
public interface ShopGoodsAttrTemplateMapper {

	/**
	 * 增加商品属性模板
	 * 
	 * @param shopGoodsAttrTemplate
	 * @return
	 */
	int addShopGoodsAttrTemplate(ShopGoodsAttrTemplate shopGoodsAttrTemplate);

	/**
	 * 根据id物理删除
	 * 
	 * @param attrId
	 * @return
	 */
	int deleteById(Integer attrId);

	/**
	 * 根据id修改
	 * 
	 * @param shopGoodsAttrTemplate
	 * @return
	 */
	int updateById(ShopGoodsAttrTemplate shopGoodsAttrTemplate);

	/**
	 * 查询商品属性模板
	 * @param map
	 * @return
	 */
	List<ShopGoodsAttrTemplate> selectShopGoodsAttrTemplate(Map<String, Object> map);
}
