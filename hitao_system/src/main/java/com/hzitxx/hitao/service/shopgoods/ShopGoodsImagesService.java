package com.hzitxx.hitao.service.shopgoods;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopGoodsImages;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopGoodsImagesService接口层
 * @author wujun
 *
 */
public interface ShopGoodsImagesService {


	/**
	 * 添加商品图片
	 * @param shopGoodsImages
	 * @return
	 */
	ServerResponse<?> addShopGoodsImages(ShopGoodsImages shopGoodsImages);
	
	/**
	 * 查询商品图片
	 * @param map
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopGoodsImages>> selectShopGoodsImages(Map<String, Object> map);
	
	/**
	 * 根据id修改
	 * @param shopGoodsImages
	 * @return
	 */
	ServerResponse<?> updateById(ShopGoodsImages shopGoodsImages);
	
	/**
	 * 根据id删除
	 * @param goodsImageId
	 * @return
	 */
	ServerResponse<?> deleteById(Integer goodsImageId);
}
