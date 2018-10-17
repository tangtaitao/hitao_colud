package com.hzitxx.hitao.mapper.marketing;

import java.util.List;
import java.util.Map;
import com.hzitxx.hitao.entity.ShopAdvPosition;

/**
 * 操作shop_adv_position表
 * 
 * @author Administrator
 *
 */
public interface ShopAdvPositionMapper {
	/**
	 * 添加一条数据
	 * 
	 * @param shopAdvPosition
	 * @return
	 */
	int addShopAdvPosition(ShopAdvPosition shopAdvPosition);

	/**
	 * 根据id删除一条信息
	 * 
	 * @param apId
	 * @return
	 */
	int deleteById(Integer apId);

	/**
	 * 根据id修改数据
	 * 
	 * @param shopAdvPosition
	 * @return
	 */
	int updateById(ShopAdvPosition shopAdvPosition);

	/**
	 * 根据id查询一条数据
	 * 
	 * @param apid
	 * @return
	 */
	ShopAdvPosition findOne(Integer apId);

	/**
	 * 根据用户搜索的信息查询数据
	 * 
	 * @param map 用户搜索的数据信息，为空则为查询所有数据
	 * @return
	 */
	List<ShopAdvPosition> searchShopAdvPosition(Map<String, Object> map);
}
