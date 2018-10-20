package com.hzitxx.hitao.service.others;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.GatewayApiDefine;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 网关管理接口层
 * @author wujun
 *
 */
public interface GatewayApiDefineService {

	/**
	 * 查询网关信息
	 * @param map
	 * @return
	 */
	ServerResponse<LayuiEntity<GatewayApiDefine>> selectGatewayApiDefine(int page,int limit,Map<String, Object> map );
	
	/**
	 * 增加网关信息
	 * @param gatewayApiDefine
	 * @return
	 */
	ServerResponse<?> addGatewayApiDefine(GatewayApiDefine gatewayApiDefine);
	
	/**
	 * 根据id修改网关信息
	 * @param gatewayApiDefin
	 * @return
	 */
	ServerResponse<?> updateById(GatewayApiDefine gatewayApiDefin);
	
	/**
	 * 根据id删除网关信息
	 * @param id
	 * @return
	 */
	ServerResponse<?> deleteById(Integer id);

	/**
	 * 根据id获取网关信息
	 * @param map
	 * @return
	 */
	ServerResponse<List<GatewayApiDefine>> findOne(Map<String, Object> map);
}
