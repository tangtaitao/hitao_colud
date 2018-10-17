package com.hzitxx.hitao.mapper.others;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopMessage;

/**
 * 消息接口
 * @author wujun
 *
 */
public interface ShopMessageMapper {

	/**
	 * 增加消息
	 * @param shopMessage
	 * @return
	 */
	int addShopMessage(ShopMessage shopMessage);
	
	/**
	 * 查询消息
	 * @param map
	 * @return
	 */
	List<ShopMessage> selectShopMessage(Map<String, Object> map );
	
	/**
	 * 根据id修改消息
	 * @param shopMessage
	 * @return
	 */
	int updateById(ShopMessage shopMessage);
	
	/**
	 * 根据id删除消息
	 * @param messageId
	 * @return
	 */
	int deleteById(Integer messageId);
}
