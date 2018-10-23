package com.hzitxx.hitao.service.member;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopAddress;
import com.hzitxx.hitao.mapper.member.ShopAddressMapper;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;
@Service
public class ShopAddressServiceImpl implements ShopAddressService {
	@Autowired
	private ShopAddressMapper mapper;
	/**
	 * 查询所有数据
	 */
	@Override
	public ServerResponse selectAll(Map<String,Object> map) {
		return ServerResponse.createBySuccess(mapper.selectAll(null));
	}
	/**
	 * 增加数据
	 */
	@Override
	public ServerResponse<ShopAddress> insert(ShopAddress shopAddress) {
		int result = mapper.insert(shopAddress);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("增加成功");
		}
		return ServerResponse.createBySuccessMessage("增加失败");
		
	}
	/**
	 * 修改数据
	 */
	@Override
	public ServerResponse<ShopAddress> updateById(ShopAddress shopAddress) {
		
		int result = mapper.updateById(shopAddress);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("修改成功");
		}
		return ServerResponse.createBySuccessMessage("修改失败");
		
	}
	/**
	 * 删除数据
	 */
	@Override
	public ServerResponse<ShopAddress> deleteById(Integer id) {
		int result = mapper.deleteById(id);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}
		return ServerResponse.createBySuccessMessage("删除失败");
	}
	/**
	 * 分页查询
	 */
	@Override
	public ServerResponse page(int page, int limit, Map<String, Object> map) {
		PageHelper.startPage(page, limit);
		
		List<ShopAddress> list = mapper.selectAll(map);
		LayuiEntity<ShopAddress> layuiEntity = new LayuiEntity<ShopAddress>();
		PageInfo<ShopAddress> pageInfo = new PageInfo<ShopAddress>(list);
		layuiEntity.setCode(0);
		layuiEntity.setMsg("数据");
		layuiEntity.setCount(pageInfo.getTotal());
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess(layuiEntity);
	}
	@Override
	public ServerResponse select(Map<String,Object> map) {
		
		return ServerResponse.createBySuccess(mapper.select(map));
	}

}
