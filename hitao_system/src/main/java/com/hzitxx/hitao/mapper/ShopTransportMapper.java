package com.hzitxx.hitao.mapper;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopTransport;

/**
 * 操作shop_transport表
 * 
 * @author Administrator
 *
 */
public interface ShopTransportMapper {
	/**
	 * 添加一条数据
	 * 
	 * @param shopTransport
	 * @return
	 */
	int addShopTransport(ShopTransport shopTransport);

	/**
	 * 根据id修改数据（包括逻辑删除)
	 * 
	 * @param shopTransport
	 * @return
	 */
	int updateById(ShopTransport shopTransport);

	/**
	 * 根据id删除信息
	 * 
	 * @param id
	 * @return
	 */
	int deleteById(Integer id);

	/**
	 * 查询一条数据
	 * 
	 * @param id
	 * @return
	 */
	ShopTransport findOne(Integer id);

	/**
	 * 根据所给数据 查询信息
	 * 
	 * @param map 用户搜索的数据信息，为空则为查询所有数据
	 * @return
	 */
	List<ShopTransport> searchShopTransport(Map<String, Object> map);
}
