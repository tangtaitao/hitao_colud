package com.hzitxx.hitao.service.others;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopSetting;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopSettingService接口层
 * @author wujun
 *
 */
public interface ShopSettingService {

	/**
	 * 查询系统设置
	 * @param map
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopSetting>> selectShopSetting(Map<String, Object> map );
	
	/**
	 * 增加系统设置
	 * @param shopSetting
	 * @return
	 */
	ServerResponse<?> addShopSetting(ShopSetting shopSetting);
	
	/**
	 * 根据id修改系统设置
	 * @param shopSetting
	 * @return
	 */
	ServerResponse<?> updateById(ShopSetting shopSetting);
	
	/**
	 * 根据id删除系统设置
	 * @param id
	 * @return
	 */
	ServerResponse<?> deleteById(Integer id);
}
