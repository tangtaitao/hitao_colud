package com.hzitxx.hitao.service.privilege.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopMenu;
import com.hzitxx.hitao.mapper.privilege.ShopMenuMapper;
import com.hzitxx.hitao.service.privilege.ShopMenuService;
import com.hzitxx.hitao.utils.ServerResponse;

@Service
public class ShopMenuServiceImpl implements ShopMenuService {
	@Autowired
	private ShopMenuMapper mapper;
	@Override
	public ServerResponse<Integer> addMenu(ShopMenu shopMenu) {
		int result=mapper.addMenu(shopMenu);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("添加成功");
		}else {
			return null;
		}
	}

	@Override
	public ServerResponse<Integer> updateMenu(ShopMenu shopMenu) {
		int result=mapper.updateMenu(shopMenu);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("修改成功");
		}else {
			return null;
		}
	}

	@Override
	public ServerResponse<Integer> deleteMenu(Integer id) {
		int result=mapper.deleteMenu(id);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}else {
			return null;
		}
	}

	@Override
	public ServerResponse<LayuiEntity<ShopMenu>> LayuiEntity(int page,int limit) {
		PageHelper.startPage(page, limit);
		List<ShopMenu> shopMenuList=mapper.findAll();
		PageInfo<ShopMenu> pageInfo=new PageInfo<>(shopMenuList);
		pageInfo.getTotal();
		pageInfo.getList();
		LayuiEntity<ShopMenu> layuiEntity=new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("管理员数据");
		layuiEntity.setCount(pageInfo.getTotal());
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess("管理员数据",layuiEntity);
	}

	@Override
	public ServerResponse<List<ShopMenu>> findOne(Integer id) {
		List<ShopMenu> list=mapper.findOne(id);
		return ServerResponse.createBySuccess(list);
	}

}