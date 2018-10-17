package com.hzitxx.hitao.mapper.others;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopSalenum;

/**
 * 销售统计接口
 * 
 * @author wujun
 *
 */
public interface ShopSalenumMapper {

	/**
	 * 增加销售统计信息
	 * @param shopSalenum
	 * @return
	 */
	int addShopSalenum(ShopSalenum shopSalenum);
	/**
	 * 查询销售统计信息
	 * 
	 * @param shopSalenum
	 * @return
	 */
	List<ShopSalenum> selectShopSalenum(Map<String, Object> map);
	
	
	/**
	 * 根据id修改销售统计信息
	 * @param shopSalenum
	 * @return
	 */
	int updateById(ShopSalenum shopSalenum);
	
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	int deleteById(Integer id);
}
