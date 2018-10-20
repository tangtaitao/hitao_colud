package com.hzitxx.hitao.service.order;

import java.util.Map;

/**
 * 处理shop_transport的操作
 * @author Administrator
 *
 */

import com.hzitxx.hitao.entity.ShopTransport;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

public interface ShopTransportService {
	/**
	 * 添加一条运费数据
	 * 
	 * @param shopTransport
	 * @return
	 */
	ServerResponse<Integer> addShopTransport(ShopTransport shopTransport);

	/**
	 * 根据id删除一条数据
	 * 
	 * @param id
	 * @return
	 */
	ServerResponse<Integer> deleteById(Integer id);

	/**
	 * 根据id修改一条数据
	 * 
	 * @param shopTransport
	 * @return
	 */
	ServerResponse<Integer> updateById(ShopTransport shopTransport);

	/**
	 * 根据id查询一条数据
	 * 
	 * @param id
	 * @return
	 */
	ServerResponse<ShopTransport> findOne(Integer id);

	/**
	 * 查询数据并分页，
	 * 
	 * @param map   查询的信息，为空则查询所有信息
	 * @param page
	 * @param limit
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopTransport>> searchShopTransport(Map<String, Object> map, int page, int limit);
}
