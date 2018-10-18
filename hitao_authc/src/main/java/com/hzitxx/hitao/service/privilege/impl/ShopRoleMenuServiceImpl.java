package com.hzitxx.hitao.service.privilege.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopRole;
import com.hzitxx.hitao.entity.ShopRoleMenu;
import com.hzitxx.hitao.mapper.privilege.ShopRoleMenuMapper;
import com.hzitxx.hitao.service.privilege.ShopRoleMenuService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;
@Service
public class ShopRoleMenuServiceImpl implements ShopRoleMenuService {
	@Autowired
	private ShopRoleMenuMapper mapper;
	@Override
	public ServerResponse<Integer> addSRM(ShopRoleMenu SRM) {
		int addSRM = mapper.addSRM(SRM);
		if(addSRM==1){
			return ServerResponse.createBySuccessMessage("新增成功");
		}else {
			return ServerResponse.createByErrorMessage("添加失败");
		}
	}

	@Override
	public ServerResponse<Integer> updateSRM(ShopRoleMenu SRM) {
		int updateSRM = mapper.updateSRM(SRM);
		if(updateSRM==1) {
			return ServerResponse.createBySuccessMessage("修改成功");
		}else {
			return ServerResponse.createByErrorMessage("修改失败");
		}
	}

	@Override
	public ServerResponse<Integer> deleteSRM(Integer id) {
		int deleteSRM = mapper.deleteSRM(id);
		if(deleteSRM==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}else {
			return ServerResponse.createByErrorMessage("删除失败");
		}
	}

	@Override
	public ServerResponse<LayuiEntity<ShopRoleMenu>> layuiEntity(int page, int limit) {
		PageHelper.startPage(page, limit);
		List<ShopRoleMenu> SRMList=mapper.findAll();
		PageInfo<ShopRoleMenu> pageInfo=new PageInfo<>(SRMList);
		pageInfo.getTotal();
		pageInfo.getList();
		LayuiEntity<ShopRoleMenu> layuiEntity=new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("菜单角色中间表");
		layuiEntity.setCount(pageInfo.getTotal());
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess("菜单角色中间表", layuiEntity);
	}

	@Override
	public ServerResponse<List<ShopRoleMenu>> findOne(Integer id) {
		List<ShopRoleMenu> findOne = mapper.findOne(id);
		return ServerResponse.createBySuccess("查询", findOne);
	}

}
