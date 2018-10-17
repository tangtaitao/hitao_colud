package com.hzitxx.hitao.service.marketing;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopAdv;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 广告表的service层
 * 
 * @author Administrator
 *
 */

public interface ShopAdvService {
	/**
	 * 添加一条数据
	 * 
	 * @param shopAdv
	 * @return
	 */
	ServerResponse<Integer> addShopAdv(ShopAdv shopAdv);

	/**
	 * 根据id删除一条信息
	 * 
	 * @param advId
	 * @return
	 */
	ServerResponse<Integer> deleteById(Integer advId);

	/**
	 * 根据id修改数据
	 * 
	 * @param shopAdv
	 * @return
	 */
	ServerResponse<Integer> updateById(ShopAdv shopAdv);

	/**
	 * 根据id查询一条数据
	 * 
	 * @param advid
	 * @return
	 */
	ServerResponse<ShopAdv> findOne(Integer advId);

	/**
	 * 根据用户搜索的信息查询数据并分页
	 * 
	 * @param map 用户搜索的数据信息，为空则为查询所有数据
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopAdv>> searchShopAdv(Map<String, Object> map, int page, int limit);
}
