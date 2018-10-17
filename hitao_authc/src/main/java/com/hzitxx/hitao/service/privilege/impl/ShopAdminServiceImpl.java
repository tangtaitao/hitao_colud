package com.hzitxx.hitao.service.privilege.impl;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzitxx.hitao.utils.JwtTokenUtil;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopAdmin;
import com.hzitxx.hitao.mapper.privilege.ShopAdminMapper;
import com.hzitxx.hitao.service.privilege.ShopAdminService;
import com.hzitxx.hitao.utils.ServerResponse;
//让IOC容器管理service层

@Service
public class ShopAdminServiceImpl implements ShopAdminService {
	
	@Autowired
	private ShopAdminMapper mapper;

	@Override
	public ServerResponse<Integer> addAdmin(ShopAdmin shopAdmin) {
		int result=mapper.addAdmin(shopAdmin);
		String adminName=shopAdmin.getAdminName();
		int count=mapper.findAdminName(adminName);
		if(count>0) {
			return ServerResponse.createByErrorMessage("用户名已存在");
		}else {
			if(result==1) {
				return ServerResponse.createBySuccessMessage("添加成功");
			}else {
				return ServerResponse.createByErrorMessage("添加失败");
			}
		}

	}

	@Override
	public ServerResponse<Integer> updateAdmin(ShopAdmin shopAdmin) {
		int result=mapper.updateAdmin(shopAdmin);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("修改成功");
		}else {
			return null;
		}
	}

	@Override
	public ServerResponse<Integer> deleteAdmin(Integer adminId) {
		int result=mapper.deleteAdmin(adminId);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}else {
			return null;
		}
	}

	@Override
	public ServerResponse<LayuiEntity<ShopAdmin>> LayuiEntity(int page, int limit) {
		PageHelper.startPage(page,limit);
		List<ShopAdmin> shopAdminList=mapper.findAll();
		PageInfo<ShopAdmin> pageInfo=new PageInfo<>(shopAdminList);
		pageInfo.getTotal();
		pageInfo.getList();
		LayuiEntity<ShopAdmin> layuiEntity=new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("管理员数据");
		layuiEntity.setCount(pageInfo.getTotal());
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess("管理员数据", layuiEntity);
	}

	@Override
	public ServerResponse<List<ShopAdmin>> findOne(Integer adminId) {
		List<ShopAdmin> list=mapper.findOne(adminId);
		return ServerResponse.createBySuccess("查询成功",list);
	}
	
	@Override
	public ServerResponse<Map<String,Object>> login(ShopAdmin shopAdmin) {
		Map<String, Object> map=new HashMap<>();
		map.put("adminName", shopAdmin.getAdminName());
		map.put("adminPassword", shopAdmin.getAdminPassword());
		ShopAdmin login = mapper.login(map);
		if(login != null) {
			Map<String, Object> map2=new HashMap<>();
			try {
				String token=JwtTokenUtil.createToken(shopAdmin.getAdminName(),login.getAdminId().toString());
				map2.put("token", token);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ServerResponse.createBySuccess("登录成功",map2);
		}else{
			return ServerResponse.createByErrorMessage("登录失败，请重新登录！");
		}
		
	}

}
