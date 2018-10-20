package com.hzitxx.hitao.service.others;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.GatewayApiDefine;
import com.hzitxx.hitao.mapper.others.GatewayApiDefineMapper;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 网关管理实现类
 * @author wujun
 *
 */
@Service
public class GatewayApiDefineServiceImpl implements GatewayApiDefineService{

	@Autowired
	private GatewayApiDefineMapper mapper;
	/**
	 * 查询网关信息
	 * @param map
	 * @return
	 */
	public ServerResponse<LayuiEntity<GatewayApiDefine>> selectGatewayApiDefine(int page,int limit,Map<String, Object> map ) {
		PageHelper.startPage(page, limit);
		List<GatewayApiDefine> gatewayApiDefines = mapper.selectGatewayApiDefine(map);
		PageInfo<GatewayApiDefine> info = new PageInfo<>(gatewayApiDefines);
		LayuiEntity<GatewayApiDefine> layuiEntity = new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("网关信息");
		layuiEntity.setCount(info.getTotal());
		layuiEntity.setData(info.getList());
		return ServerResponse.createBySuccess("网关信息数据", layuiEntity);
	}
	
	/**
	 * 根据id获取网关信息
	 * @param map
	 * @return
	 */
	public ServerResponse<List<GatewayApiDefine>> findOne(Map<String, Object> map) {
		List<GatewayApiDefine> gatewayApiDefines = mapper.selectGatewayApiDefine(map);
		return ServerResponse.createBySuccess(gatewayApiDefines);
	}
	/**
	 * 增加网关信息
	 * @param gatewayApiDefine
	 * @return
	 */
	public ServerResponse<?> addGatewayApiDefine(GatewayApiDefine gatewayApiDefine) {
		int result = mapper.addGatewayApiDefine(gatewayApiDefine);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("添加失败!");
		}
		return ServerResponse.createBySuccessMessage("添加成功!");
	}
	
	/**
	 * 根据id修改网关信息
	 * @param gatewayApiDefin
	 * @return
	 */
	public ServerResponse<?> updateById(GatewayApiDefine gatewayApiDefin) {
		int result = mapper.updateById(gatewayApiDefin);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("编辑失败!");
		}
		return ServerResponse.createBySuccessMessage("编辑成功!");
	}
	
	/**
	 * 根据id删除网关信息
	 * @param id
	 * @return
	 */
	public ServerResponse<?> deleteById(Integer id) {
		int result = mapper.deleteById(id);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("删除失败!");
		}
		return ServerResponse.createBySuccessMessage("删除成功!");
	}
}
