package com.hzitxx.hitao.service.shopgoods;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopGoodsCategory;
import com.hzitxx.hitao.mapper.shopgoods.ShopGoodsCategoryMapper;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopGoodsCategoryService实现类
 * @author wujun
 *
 */
@Service
public class ShopGoodsCategoryServiceImpl implements ShopGoodsCategoryService {

	@Autowired
	private ShopGoodsCategoryMapper mapper;
	/**
	 * 增加商品分类表
	 * 
	 * @param shopGoodsCategory
	 * @return
	 */
	public ServerResponse<?> addShopGoodsCategory(ShopGoodsCategory shopGoodsCategory){
		int result = mapper.addShopGoodsCategory(shopGoodsCategory);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("添加失败!");
		}
		return ServerResponse.createBySuccessMessage("添加成功!");
		
	}

	/**
	 * 查询商品分类
	 * 
	 * @param map
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopGoodsCategory>> selectShopGoodsCategory(Map<String, Object> map){
		List<ShopGoodsCategory> shopGoodsCategories = mapper.selectShopGoodsCategory(map);
		PageInfo<ShopGoodsCategory> info = new PageInfo<>(shopGoodsCategories);
		LayuiEntity<ShopGoodsCategory> layuiEntity = new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("商品分类信息");
		layuiEntity.setCount(info.getTotal());
		layuiEntity.setData(info.getList());
		return ServerResponse.createBySuccess("商品分类信息数据", layuiEntity);
		
	}

	/**
	 * 根据id修改
	 * 
	 * @param shopGoodsCategory
	 * @return
	 */
	public ServerResponse<?> updateById(ShopGoodsCategory shopGoodsCategory){
		int result = mapper.updateById(shopGoodsCategory);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("编辑失败!");
		}
		return ServerResponse.createBySuccessMessage("编辑成功!");
		
	}

	/**
	 * 根据id删除
	 * 
	 * @param catId
	 * @return
	 */
	public ServerResponse<?> deleteById(Integer catId) {
		int result = mapper.deleteById(catId);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("删除失败!");
		}
		return ServerResponse.createBySuccessMessage("删除成功!");
	}
}
