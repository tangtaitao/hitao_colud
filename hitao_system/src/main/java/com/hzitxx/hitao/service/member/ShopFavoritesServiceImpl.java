package com.hzitxx.hitao.service.member;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopFavorites;
import com.hzitxx.hitao.mapper.member.ShopFavoritesMapper;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;
@Service
public class ShopFavoritesServiceImpl implements ShopFavoritesService {
	@Autowired
	private ShopFavoritesMapper mapper;
	/**
	 * 查询所有数据
	 */
	@Override
	public ServerResponse selectAll() {
		
		return ServerResponse.createBySuccess(mapper.selectAll());
	}
	/**
	 * 根据id查询所有数据
	 */
	@Override
	public ServerResponse selectById(int favId) {
		
		return ServerResponse.createBySuccess(mapper.selectById(favId));
		
	}
	/**
	 * 增加数据
	 */
	@Override
	public ServerResponse add(ShopFavorites shopFavorite) {
		int result = mapper.add(shopFavorite);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("增加成功");
		}
		return ServerResponse.createBySuccessMessage("增加失败");
	}
	/**
	 * 根据id修改数据
	 */
	@Override
	public ServerResponse updateById(ShopFavorites shopFavorite) {
		int result = mapper.updateById(shopFavorite);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("修改成功");
		}
		return ServerResponse.createBySuccessMessage("修改失败");
	}
	/**
	 * 根据id 删除数据
	 */
	@Override
	public ServerResponse deleteById(int favId) {
		int result = mapper.deleteById(favId);
		if(result==1) {
			return ServerResponse.createBySuccessMessage("删除成功");
		}
		return ServerResponse.createBySuccessMessage("删除失败");
	}
	/**
	 * 分页查询
	 */
	public ServerResponse page(int page,int limit,Map<String,Object> map) {
		PageHelper.startPage(page, limit);
		List<ShopFavorites> list = mapper.selectAll();
		LayuiEntity<ShopFavorites> layuiEntity =new LayuiEntity<ShopFavorites>();
		PageInfo<ShopFavorites> pageInfo = new PageInfo<ShopFavorites>(list);
		layuiEntity.setCode(0);
		layuiEntity.setMsg("数据");
		layuiEntity.setCount(pageInfo.getTotal());
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess(layuiEntity);
	}
}
