package com.hzitxx.hitao.mapper.others;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.GatewayApiDefine;

/**
 * 网关管理接口
 * @author wujun
 *
 */
public interface GatewayApiDefineMapper {

	/**
	 * 查询网关信息
	 * @param map
	 * @return
	 */
	List<GatewayApiDefine> selectGatewayApiDefine(Map<String, Object> map );
	
	/**
	 * 增加网关信息
	 * @param gatewayApiDefine
	 * @return
	 */
	int addGatewayApiDefine(GatewayApiDefine gatewayApiDefine);
	
	/**
	 * 根据id修改网关信息
	 * @param gatewayApiDefin
	 * @return
	 */
	int updateById(GatewayApiDefine gatewayApiDefin);
	
	/**
	 * 根据id删除网关信息
	 * @param id
	 * @return
	 */
	int deleteById(Integer id);
}
