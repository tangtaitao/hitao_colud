package com.hzitxx.hitao.service.shopgoods;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopGoodsAttr;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopGoodsAttrService接口
 * @author wujun
 *
 */
public interface ShopGoodsAttrService {

	/**
	 * 增加商品属性
	 * 
	 * @param shopGoodsAttr
	 * @return
	 */
	ServerResponse<?> addShopGoodsAttr(ShopGoodsAttr shopGoodsAttr);

	/**
	 * 查询商品属性
	 * 
	 * @param shopGoodsAttr
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopGoodsAttr>> selectShopGoodsAttr(Map<String, Object> map);

	/**
	 * 根据id删除商品信息
	 * 
	 * @param goodsId
	 * @return
	 */
	ServerResponse<?> updateById(ShopGoodsAttr shopGoodsAttr);

	/**
	 * 根据id来物理删除
	 * 
	 * @param goodsId
	 * @return
	 */
	ServerResponse<?> deleteById(Integer goodsId);
}
