package com.hzitxx.hitao.service.shopgoods;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopGoodsAttrTemplate;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 商品属性模板服务层接口
 * @author wujun
 *
 */
public interface ShopGoodsAttrTemplateService {

	/**
	 * 增加商品属性模板
	 * 
	 * @param shopGoodsAttrTemplate
	 * @return
	 */
	ServerResponse<?> addShopGoodsAttrTemplate(ShopGoodsAttrTemplate shopGoodsAttrTemplate);

	/**
	 * 根据id物理删除
	 * 
	 * @param attrId
	 * @return
	 */
	ServerResponse<?> deleteById(Integer attrId);

	/**
	 * 根据id修改
	 * 
	 * @param shopGoodsAttrTemplate
	 * @return
	 */
	ServerResponse<?> updateById(ShopGoodsAttrTemplate shopGoodsAttrTemplate);

	/**
	 * 查询商品属性模板
	 * @param map
	 * @return
	 */
	ServerResponse<String> selectShopGoodsAttrTemplate(Map<String, Object> map);
}
