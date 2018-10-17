package com.hzitxx.hitao.mapper.order;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopExpress;

/**
 * 操作shop_express表
 * 
 * @author Administrator
 *
 */
public interface ShopExpressMapper {
	/**
	 * 添加一条数据
	 * 
	 * @param shopExpress
	 * @return
	 */
	int addShopExpress(ShopExpress shopExpress);

	/**
	 * 根据id删除一条信息
	 * 
	 * @param id
	 * @return
	 */
	int deleteById(Integer id);

	/**
	 * 根据id修改数据（包括逻辑删除）
	 * 
	 * @param id
	 * @return
	 */
	int updateById(ShopExpress shopExpress);

	/**
	 * 根据id查询一条数据
	 * 
	 * @param id
	 * @return
	 */
	ShopExpress findOne(Integer id);

	/**
	 * 根据用户搜索的信息查询数据
	 * 
	 * @param map 用户搜索的数据信息，为空则为查询所有数据
	 * @return
	 */
	List<ShopExpress> searchShopExpress(Map<String, Object> map);
}
