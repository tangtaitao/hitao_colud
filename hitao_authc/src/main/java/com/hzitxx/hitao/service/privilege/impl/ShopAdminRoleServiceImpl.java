package com.hzitxx.hitao.service.privilege.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopAdminRole;
import com.hzitxx.hitao.mapper.privilege.ShopAdminRoleMapper;
import com.hzitxx.hitao.service.privilege.ShopAdminRoleService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;
@Service
public class ShopAdminRoleServiceImpl implements ShopAdminRoleService {
	@Autowired
	private ShopAdminRoleMapper mapper;
	@Override
	public ServerResponse<Integer> addSAR(ShopAdminRole SAR) {
		int addSAR = mapper.addSAR(SAR);
		if(addSAR==1) {
			return ServerResponse.createBySuccessMessage("添加成功");
		}else {
			return ServerResponse.createByErrorMessage("添加失败");
		}
	}

	@Override
	public ServerResponse<Integer> updateSAR(ShopAdminRole SAR) {
		int updateSAR = mapper.updateSAR(SAR);
		if(updateSAR==1) {
			return ServerResponse.createBySuccessMessage("修改成功");
		}else {
			return ServerResponse.createByErrorMessage("修改失败");
		}
	}

	@Override
	public ServerResponse<Integer> deleteSAR(Integer id) {
		int deleteSAR = mapper.deleteSAR(id);
		if(deleteSAR==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}else {
			return ServerResponse.createByErrorMessage("删除失败");
		}
	}

	@Override
	public ServerResponse<LayuiEntity<ShopAdminRole>> findAll(int page,int limit) {
		PageHelper.startPage(page, limit);
		List<ShopAdminRole> SARList=mapper.findAll();
		PageInfo<ShopAdminRole> pageInfo=new PageInfo<>(SARList);
		pageInfo.getTotal();
		pageInfo.getList();
		LayuiEntity<ShopAdminRole> layuiEntity=new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("管理员角色中间表");
		layuiEntity.setCount(pageInfo.getTotal());
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess("管理员角色中间表", layuiEntity);
	}

	@Override
	public ServerResponse<List<ShopAdminRole>> findOne(Integer id) {
		List<ShopAdminRole> findOne = mapper.findOne(id);
		return ServerResponse.createBySuccess("删除成功",findOne);
	}

}
