package com.hzitxx.hitao.service.privilege.impl;

import java.util.ArrayList;
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
import com.hzitxx.hitao.utils.TreeDataUtil;

@Service
public class ShopMenuServiceImpl implements ShopMenuService {
	@Autowired
	private ShopMenuMapper mapper;

	@Override
	public ServerResponse<Integer> addMenu(ShopMenu shopMenu) {
		int result = mapper.addMenu(shopMenu);
		if (result == 1) {
			return ServerResponse.createBySuccessMessage("添加成功");
		} else {
			return null;
		}
	}

	@Override
	public ServerResponse<Integer> updateMenu(ShopMenu shopMenu) {
		int result = mapper.updateMenu(shopMenu);
		if (result == 1) {
			return ServerResponse.createBySuccessMessage("修改成功");
		} else {
			return null;
		}
	}

	@Override
	public ServerResponse<Integer> deleteMenu(Integer id) {
		int result = mapper.deleteMenu(id);
		if (result == 1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		} else {
			return null;
		}
	}

	@Override
	public ServerResponse<LayuiEntity<ShopMenu>> LayuiEntity(int page, int limit) {
		PageHelper.startPage(page, limit);
		List<ShopMenu> shopMenuList = mapper.findAll();
		PageInfo<ShopMenu> pageInfo = new PageInfo<>(shopMenuList);
		pageInfo.getTotal();
		pageInfo.getList();
		LayuiEntity<ShopMenu> layuiEntity = new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("管理员数据");
		layuiEntity.setCount(pageInfo.getTotal());
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess("管理员数据", layuiEntity);
	}

	@Override
	public ServerResponse<ShopMenu> findOne(Integer id) {
		ShopMenu findOne = mapper.findOne(id);
		return ServerResponse.createBySuccess(findOne);
	}

	@Override
	public ServerResponse<List<TreeDataUtil>> menuTreeData() {
		TreeDataUtil treeDataUtil = setList(1);
		List<TreeDataUtil> list = new ArrayList<>();
		list.add(treeDataUtil);
		return ServerResponse.createBySuccess("树状权限数据", list);
	}

	public TreeDataUtil setList(Integer id) {
		// 获取父级对象
		TreeDataUtil treeDataUtil = mapper.findById(id);
		// 获取子级列表
		List<TreeDataUtil> list = mapper.findByParentId(id);
		// 判断list是否为空
		if (list != null && list.size() > 0) {
			// 遍历子级列表
			for (TreeDataUtil child : list) {
				// 递归查询
				TreeDataUtil dataUtil = setList(child.getId());
				treeDataUtil.getChildren().add(dataUtil);
			}
		}
		return treeDataUtil;
	}

}
