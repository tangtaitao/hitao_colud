package com.hzitxx.hitao.service.order;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopExpress;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 操作shop_express表
 * 
 * @author Administrator
 *
 */
public interface ShopExpressService {
	/**
	 * 添加一条数据
	 * 
	 * @param shopExpress
	 * @return
	 */
	ServerResponse<Integer> addShopExpress(ShopExpress shopExpress);

	/**
	 * 根据id删除一条信息
	 * 
	 * @param id
	 * @return
	 */
	ServerResponse<Integer> deleteById(Integer id);

	/**
	 * 根据id修改数据（包括逻辑删除）
	 * 
	 * @param id
	 * @return
	 */
	ServerResponse<Integer> updateById(ShopExpress shopExpress);

	/**
	 * 根据id查询一条数据
	 * 
	 * @param id
	 * @return
	 */
	ServerResponse<ShopExpress> findOne(Integer id);

	/**
	 * 根据用户搜索的信息查询数据并分页
	 * 
	 * @param map 用户搜索的数据信息，为空则为查询所有数据
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopExpress>> searchShopExpress(Map<String, Object> map, int page, int limit);
}
