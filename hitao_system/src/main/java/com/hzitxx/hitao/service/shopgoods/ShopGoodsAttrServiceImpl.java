package com.hzitxx.hitao.service.shopgoods;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopGoodsAttr;
import com.hzitxx.hitao.mapper.shopgoods.ShopGoodsAttrMapper;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopGoodsAttrService实现类
 * 
 * @author wujun
 *
 */
@Service
public class ShopGoodsAttrServiceImpl implements ShopGoodsAttrService {

	@Autowired
	private ShopGoodsAttrMapper mapper;

	/**
	 * 增加商品属性
	 * 
	 * @param shopGoodsAttr
	 * @return
	 */
	public ServerResponse<?> addShopGoodsAttr(ShopGoodsAttr shopGoodsAttr) {
		int result = mapper.addShopGoodsAttr(shopGoodsAttr);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("添加失败!");
		}
		return ServerResponse.createBySuccessMessage("添加成功!");

	}

	/**
	 * 查询商品属性
	 * 
	 * @param shopGoodsAttr
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopGoodsAttr>> selectShopGoodsAttr(Map<String, Object> map) {
		List<ShopGoodsAttr> shopGoodsAttrs = mapper.selectShopGoodsAttr(map);
		PageInfo<ShopGoodsAttr> info = new PageInfo<>(shopGoodsAttrs);
		LayuiEntity<ShopGoodsAttr> layuiEntity = new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("商品属性信息");
		layuiEntity.setCount(info.getTotal());
		layuiEntity.setData(info.getList());
		return ServerResponse.createBySuccess("商品属性信息数据", layuiEntity);

	}

	/**
	 * 根据id修改商品信息
	 * 
	 * @param goodsId
	 * @return
	 */
	public ServerResponse<?> updateById(ShopGoodsAttr shopGoodsAttr) {
		int result = mapper.updateById(shopGoodsAttr);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("编辑失败!");
		}
		return ServerResponse.createBySuccessMessage("编辑成功!");

	}

	/**
	 * 根据id来物理删除
	 * 
	 * @param goodsId
	 * @return
	 */
	public ServerResponse<?> deleteById(Integer goodsId) {
		int result = mapper.deleteById(goodsId);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("删除失败!");
		}
		return ServerResponse.createBySuccessMessage("删除成功!");

	}
}
