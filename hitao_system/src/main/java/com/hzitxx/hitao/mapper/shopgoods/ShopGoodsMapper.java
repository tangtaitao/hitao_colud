package com.hzitxx.hitao.mapper.shopgoods;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopGoods;
import com.hzitxx.hitao.utils.ShopGoodsUtils;

/**
 * 商品信息接口
 * 
 * @author wujun
 *
 */
public interface ShopGoodsMapper {
	/**
	 * 查询goods
	 * 
	 * @param map
	 * @return
	 */
	public List<ShopGoods> selectShopGoods(Map<String, Object> map);

	/**
	 * 增加goods
	 */
	public int addShopGoods(ShopGoods goods);

	/**
	 * 更新goods
	 */
	public int updateShopGoods(ShopGoods goods);

	/**
	 * 根据ID物理删除
	 * 
	 * @param goodsId
	 * @return
	 */
	public int deleteById(Integer goodsId);

	/**
	 * 根据id查询数据
	 * 
	 * @param goodsId
	 * @return
	 */
	public List<ShopGoodsUtils> findOne(Integer goodsId);
}
