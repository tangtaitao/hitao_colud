package com.hzitxx.hitao.mapper.shopgoods;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopBrand;

/**
 * 品牌信息接口
 * @author wujun
 *
 */
public interface ShopBrandMapper {

	/**
	 * 增加品牌
	 * @param shopBrand
	 * @return
	 */
	int addShopBrand(ShopBrand shopBrand);
	
	/**
	 * 查询品牌信息
	 * @param map
	 * @return
	 */
	List<ShopBrand> selectShopBrand(Map<String, Object> map );
	
	/**
	 * 根据id修改
	 * @param shopBrand
	 * @return
	 */
	int updateById(ShopBrand shopBrand);
	
	/**
	 * 根据id删除品牌信息
	 * @param brandId
	 * @return
	 */
	int deleteById(Integer brandId);
	
	/**
	 * 根据id批量删除
	 * @param ids
	 * @return
	 */
	int deleteByIds(String[] ids);
}
