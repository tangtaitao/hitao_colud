package com.hzitxx.hitao.service.privilege.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopRole;
import com.hzitxx.hitao.mapper.privilege.ShopRoleMapper;
import com.hzitxx.hitao.service.privilege.ShopRoleService;
import com.hzitxx.hitao.utils.ServerResponse;
import com.hzitxx.hitao.utils.LayuiEntity;
@Service
public class ShopRoleServiceImpl implements ShopRoleService {
	@Autowired
	private ShopRoleMapper mapper;
	@Override
	public ServerResponse<Integer> addRole(ShopRole shopRole) {
		int result=mapper.addRole(shopRole);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("添加成功");
		}else {
			return null;
		}
	}

	@Override
	public ServerResponse<Integer> updateRole(ShopRole shopRole) {
		int result=mapper.updateRole(shopRole);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("修改成功");
		}else{
			return null;
		}
	}

	@Override
	public ServerResponse<Integer> deleteRole(Integer roleId) {
		int result=mapper.deleteRole(roleId);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}else {
			return null;
		}
	}

	@Override
	public ServerResponse<List<ShopRole>> findOne(Integer roleId) {
		List<ShopRole> list=mapper.findOne(roleId);
		return ServerResponse.createBySuccess(list);
	}

	@Override
	public ServerResponse<LayuiEntity<ShopRole>> LayuiEntity(int page, int limit) {
		PageHelper.startPage(page, limit);
		List<ShopRole> shopRoleList=mapper.findAll();
		PageInfo<ShopRole> pageInfo=new PageInfo<>(shopRoleList);
		pageInfo.getTotal();
		pageInfo.getList();
		LayuiEntity<ShopRole> layuiEntity=new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("角色表数据");
		layuiEntity.setCount(pageInfo.getTotal());
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess("角色表数据", layuiEntity);
	}

}
