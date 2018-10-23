package com.hzitxx.hitao.service.member;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopArea;
import com.hzitxx.hitao.mapper.member.ShopAreaMapper;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;
@Service
public class ShopAreaServiceImpl implements ShopAreaService {
	@Autowired
	private ShopAreaMapper mapper;
	/**
	 * 查询所有数据
	 */
	@Override
	public ServerResponse selectAll(Map<String,Object> map) {
		
		return ServerResponse.createBySuccess(mapper.selectAll(map));
	}
	/**
	 * 根据id查询数据
	 */
	@Override
	public ServerResponse selectOne(int areaId) {
		
		return ServerResponse.createBySuccess(mapper.selectOne(areaId));
	}
	/**
	 * 增加数据
	 */
	@Override
	public ServerResponse add(ShopArea shopArea) {
		int result = mapper.add(shopArea);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("增加成功"); 
		}
		return ServerResponse.createBySuccessMessage("增加失败");
	}
	/**
	 * 根据id修改数据
	 */
	@Override
	public ServerResponse updateById(ShopArea shopArea) {
		int result = mapper.updateById(shopArea);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("修改成功"); 
		}
		return ServerResponse.createBySuccessMessage("修改失败");
	}
	/**
	 * 根据id删除数据
	 */
	@Override
	public ServerResponse deleteById(ShopArea shopArea) {
		int result = mapper.deleteById(shopArea);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功"); 
		}
		return ServerResponse.createBySuccessMessage("删除失败");
	}
	/**
	 * 根据id 逻辑删除数据
	 */
	@Override
	public ServerResponse delete(ShopArea shopArea) {
		int result = mapper.delete(shopArea);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功"); 
		}
		return ServerResponse.createBySuccessMessage("删除失败");
	}
	/**
	 * 分页查询
	 */
	@Override
	public ServerResponse<LayuiEntity<ShopArea>> page(int page, int limit, Map<String, Object> map) {
		PageHelper.startPage(page, limit);
		List<ShopArea> list = mapper.selectAll(map);
		LayuiEntity<ShopArea> layuiEntity = new LayuiEntity<ShopArea>();
		PageInfo<ShopArea> pageInfo = new PageInfo<ShopArea>(list);
		layuiEntity.setCode(0);
		layuiEntity.setMsg("数据");
		layuiEntity.setCount(pageInfo.getTotal());
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess(layuiEntity);
		
	}
	/**
	 * 根据区域名称查询父级区域
	 */
	@Override
	public ServerResponse findShopArea(String areaName) {
		
		return ServerResponse.createBySuccess(mapper.findShopArea(areaName));
	}

}
