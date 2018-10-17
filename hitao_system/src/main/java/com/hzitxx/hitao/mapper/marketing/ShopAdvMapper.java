package com.hzitxx.hitao.mapper.marketing;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopAdv;

/**
 * 操作shop_adv表
 * 
 * @author Administrator
 *
 */
public interface ShopAdvMapper {
	/**
	 * 添加一条数据
	 * 
	 * @param shopAdv
	 * @return
	 */
	int addShopAdv(ShopAdv shopAdv);

	/**
	 * 根据id删除一条信息
	 * 
	 * @param advId
	 * @return
	 */
	int deleteById(Integer advId);

	/**
	 * 根据id修改数据
	 * 
	 * @param shopAdv
	 * @return
	 */
	int updateById(ShopAdv shopAdv);

	/**
	 * 根据id查询一条数据
	 * 
	 * @param advid
	 * @return
	 */
	ShopAdv findOne(Integer advId);

	/**
	 * 根据用户搜索的信息查询数据
	 * 
	 * @param map 用户搜索的数据信息，为空则为查询所有数据
	 * @return
	 */
	List<ShopAdv> searchShopAdv(Map<String, Object> map);
}
