package com.hzitxx.hitao.service.member;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopMember;
import com.hzitxx.hitao.mapper.member.ShopMemberMapper;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;
@Service
public class ShopMemberServiceImpl implements ShopMemberService {
	@Autowired
	private ShopMemberMapper mapper;
	/**
	 * 查询所有数据
	 */
	public ServerResponse selectAll() {
		return ServerResponse.createBySuccess(mapper.selectAll());
	}
	/**
	 * 增加数据
	 */
	@Override
	public ServerResponse insertShopMember(ShopMember shopMember) {
		int result = mapper.insertShopMember(shopMember);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("添加成功");
		}
		else {
			return ServerResponse.createBySuccessMessage("添加失败");
		}
	}
	/**
	 * 修改数据
	 */
	@Override
	public ServerResponse updateShopMember(ShopMember shopMember) {
		int result = mapper.updateShopMember(shopMember);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("修改成功");
		}
		return ServerResponse.createBySuccessMessage("修改失败");
	}
	/**
	 * 根据id逻辑删除数据
	 */
	@Override
	public ServerResponse deleteById(Map<String,Object> map) {

		int result = mapper.deleteById(map);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}
		return ServerResponse.createBySuccessMessage("删除失败");
	}
	/**
	 * 数据分页查询
	 */
	@Override
	public ServerResponse<LayuiEntity<ShopMember>> page(int page, int limit, Map<String, Object> map) {
		PageHelper.startPage(page, limit);
		List<ShopMember> list = mapper.selectAll();
		PageInfo<ShopMember> pageInfo = new PageInfo<ShopMember>(list);
		LayuiEntity<ShopMember> layuiEntity = new LayuiEntity<ShopMember>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("数据");
		layuiEntity.setCount(pageInfo.getTotal());
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess(layuiEntity);
	}

	@Override
	public ServerResponse<ShopMember> selectById(int memberId) {
		ShopMember shopMember = mapper.selectById(memberId);
		if(shopMember==null) {
			ServerResponse.createBySuccessMessage("查询失败");
		}
		return ServerResponse.createBySuccessMessage("查询成功");
	}
	

}
