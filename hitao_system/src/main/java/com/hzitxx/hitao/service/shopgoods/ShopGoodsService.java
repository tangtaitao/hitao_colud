package com.hzitxx.hitao.service.shopgoods;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopGoods;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;
import com.hzitxx.hitao.utils.ShopGoodsUtils;

/**
 * 商品信息服务层接口
 * 
 * @author wujun
 *
 */
public interface ShopGoodsService {
	/**
	 * 查询goods
	 * 
	 * @param map
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopGoods>> selectShopGoods(int page, int limit, Map<String, Object> map);

	/**
	 * 增加goods
	 * 
	 * @param goods
	 * @return
	 */
	ServerResponse<?> addShopGoods(ShopGoodsUtils shopGoodsUtils);

	/**
	 * 更新goods
	 * 
	 * @param shopGoodsUtils
	 * @return
	 */
	ServerResponse<?> updateShopGoods(ShopGoodsUtils shopGoodsUtils);

	/**
	 * 根据ID物理删除
	 * 
	 * @param goodsId
	 * @return
	 */
	ServerResponse<?> deleteById(Integer goodsId);

	/**
	 * 根据id查询
	 * 
	 * @param goodsId
	 * @return
	 */
	ServerResponse<ShopGoodsUtils> findOne(Integer goodsId);
}
