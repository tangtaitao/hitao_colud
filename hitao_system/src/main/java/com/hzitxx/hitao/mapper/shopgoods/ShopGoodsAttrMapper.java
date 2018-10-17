package com.hzitxx.hitao.mapper.shopgoods;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopGoodsAttr;

/**
 * 商品属性接口
 * @author wujun
 *
 */
public interface ShopGoodsAttrMapper {

	/**
	 * 增加商品属性
	 * 
	 * @param shopGoodsAttr
	 * @return
	 */
	public int addShopGoodsAttr(ShopGoodsAttr shopGoodsAttr);

	/**
	 * 查询商品属性
	 * 
	 * @param shopGoodsAttr
	 * @return
	 */
	public List<ShopGoodsAttr> selectShopGoodsAttr(Map<String, Object> map);

	/**
	 * 根据id修改商品信息
	 * 
	 * @param goodsId
	 * @return
	 */
	public int updateById(ShopGoodsAttr shopGoodsAttr);

	/**
	 * 根据id来物理删除
	 * 
	 * @param goodsId
	 * @return
	 */
	public int deleteById(Integer goodsId);
}
