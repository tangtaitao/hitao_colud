package com.hzitxx.hitao.mapper.shopgoods;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopGoodsImages;

/**
 * 商品图片接口
 * @author wujun
 *
 */
public interface ShopGoodsImagesMapper {

	/**
	 * 添加商品图片
	 * @param shopGoodsImages
	 * @return
	 */
	int addShopGoodsImages(ShopGoodsImages shopGoodsImages);
	
	/**
	 * 查询商品图片
	 * @param map
	 * @return
	 */
	List<ShopGoodsImages> selectShopGoodsImages(Map<String, Object> map);
	
	/**
	 * 根据id修改
	 * @param shopGoodsImages
	 * @return
	 */
	int updateById(ShopGoodsImages shopGoodsImages);
	
	/**
	 * 根据id删除
	 * @param goodsImageId
	 * @return
	 */
	int deleteById(Integer goodsImageId);
}
