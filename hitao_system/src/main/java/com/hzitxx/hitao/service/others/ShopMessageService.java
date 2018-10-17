package com.hzitxx.hitao.service.others;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopMessage;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopMessageService接口层
 * @author wujun
 *
 */
public interface ShopMessageService {

	/**
	 * 增加消息
	 * @param shopMessage
	 * @return
	 */
	ServerResponse<?> addShopMessage(ShopMessage shopMessage);
	
	/**
	 * 查询消息
	 * @param map
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopMessage>> selectShopMessage(Map<String, Object> map );
	
	/**
	 * 根据id修改消息
	 * @param shopMessage
	 * @return
	 */
	ServerResponse<?> updateById(ShopMessage shopMessage);
	
	/**
	 * 根据id删除消息
	 * @param messageId
	 * @return
	 */
	ServerResponse<?> deleteById(Integer messageId);
}
