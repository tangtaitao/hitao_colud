package com.hzitxx.hitao.mapper.others;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopSetting;

/**
 * 系统设置接口
 * @author wujun
 *
 */
public interface ShopSettingMapper {

	/**
	 * 查询系统设置
	 * @param map
	 * @return
	 */
	List<ShopSetting> selectShopSetting(Map<String, Object> map );
	
	/**
	 * 增加系统设置
	 * @param shopSetting
	 * @return
	 */
	int addShopSetting(ShopSetting shopSetting);
	
	/**
	 * 根据id修改系统设置
	 * @param shopSetting
	 * @return
	 */
	int updateById(ShopSetting shopSetting);
	
	/**
	 * 根据id删除系统设置
	 * @param id
	 * @return
	 */
	int deleteById(Integer id);
}
