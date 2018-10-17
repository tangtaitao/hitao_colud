package com.hzitxx.hitao.service.shopgoods;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopFrontCategory;
import com.hzitxx.hitao.mapper.shopgoods.ShopFrontCategoryMapper;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopFrontCategoryService实现类
 * @author wujun
 *
 */
@Service
public class ShopFrontCategoryServiceImpl implements ShopFrontCategoryService {
	@Autowired
	private ShopFrontCategoryMapper mapper;
	
	/**
	 * 增加类目
	 * 
	 * @param shopFrontCategory
	 * @return
	 */
	public ServerResponse<?> addShopFrontCategory(ShopFrontCategory shopFrontCategory) {
		int result = mapper.addShopFrontCategory(shopFrontCategory);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("添加失败!");
		}
		return ServerResponse.createBySuccessMessage("添加成功!");
	}

	/**
	 * 查询类目信息
	 * 
	 * @param map
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopFrontCategory>> selectShopFrontCategory(int page,int limit,Map<String, Object> map) {
		PageHelper.startPage(page,limit);
		List<ShopFrontCategory> shopFrontCategories = mapper.selectShopFrontCategory(map);
		PageInfo<ShopFrontCategory> info = new PageInfo<>(shopFrontCategories);
		LayuiEntity<ShopFrontCategory> layuiEntity = new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("商品类目信息");
		layuiEntity.setCount(info.getTotal());
		layuiEntity.setData(info.getList());
		return ServerResponse.createBySuccess("商品类目信息数据", layuiEntity);
	}

	
	/**
	 * 根据id修改类目信息
	 * @param shopFrontCategory
	 * @return
	 */
	public ServerResponse<?> updateById(ShopFrontCategory shopFrontCategory) {
		int result = mapper.updateById(shopFrontCategory);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("编辑失败!");
		}
		return ServerResponse.createBySuccessMessage("编辑成功!");
	}
	
	/**
	 * 根据id删除类目信息
	 * @param frontCatId
	 * @return
	 */
	public ServerResponse<?> deleteById(Integer frontCatId) {
		int result = mapper.deleteById(frontCatId);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("删除失败!");
		}
		return ServerResponse.createBySuccessMessage("删除成功!");
	}
}
