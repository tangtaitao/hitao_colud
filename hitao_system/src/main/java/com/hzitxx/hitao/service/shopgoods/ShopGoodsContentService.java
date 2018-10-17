package com.hzitxx.hitao.service.shopgoods;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopGoodsContent;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopGoodsContentService接口层
 * @author wujun
 *
 */
public interface ShopGoodsContentService {

	/**
	 * 增加商品内容
	 * @param shopGoodsContent
	 * @return
	 */
	 ServerResponse<?> addShopGoodsContent(ShopGoodsContent shopGoodsContent);
	
	/**
	 * 查询商品内容
	 * @param map
	 * @return
	 */
	 ServerResponse<LayuiEntity<ShopGoodsContent>> selectShopGoodsContent(Map<String, Object> map);
	
	
	/**
	 * 根据id修改数据
	 * @param shopGoodsContent
	 * @return
	 */
	ServerResponse<?> updateById(ShopGoodsContent shopGoodsContent);
	
	/**
	 * 根据id删除
	 * @param goodsId
	 * @return
	 */
	ServerResponse<?> deleteById(Integer goodsId);
}
