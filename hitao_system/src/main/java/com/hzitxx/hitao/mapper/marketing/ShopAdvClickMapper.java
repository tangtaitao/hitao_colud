package com.hzitxx.hitao.mapper.marketing;

import java.util.List;
import java.util.Map;
import com.hzitxx.hitao.entity.ShopAdvClick;

/**
 * 操作shop_advc_click表
 * 
 * @author Administrator
 *
 */
public interface ShopAdvClickMapper {
	/**
	 * 添加一条数据
	 * 
	 * @param shopAdvClick
	 * @return
	 */
	int addShopAdvClick(ShopAdvClick shopAdvClick);

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
	 * @param shopAdvClick
	 * @return
	 */
	int updateById(ShopAdvClick shopAdvClick);

	/**
	 * 根据id查询一条数据
	 * 
	 * @param advid
	 * @return
	 */
	ShopAdvClick findOne(Integer advId);

	/**
	 * 根据用户搜索的信息查询数据
	 * 
	 * @param map 用户搜索的数据信息，为空则为查询所有数据
	 * @return
	 */
	List<ShopAdvClick> searchShopAdvClick(Map<String, Object> map);
}
