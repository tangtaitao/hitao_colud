package com.hzitxx.hitao.mapper.shopgoods;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopGoodsContent;

/**
 * 商品内容接口
 * @author wujun
 *
 */
public interface ShopGoodsContentMapper {

	/**
	 * 增加商品内容
	 * @param shopGoodsContent
	 * @return
	 */
	int addShopGoodsContent(ShopGoodsContent shopGoodsContent);
	
	/**
	 * 查询商品内容
	 * @param map
	 * @return
	 */
	List<ShopGoodsContent> selectShopGoodsContent(Map<String, Object> map);
	
	
	/**
	 * 根据id修改数据
	 * @param shopGoodsContent
	 * @return
	 */
	int updateById(ShopGoodsContent shopGoodsContent);
	
	/**
	 * 根据id删除
	 * @param goodsId
	 * @return
	 */
	int deleteById(Integer goodsId);
}
