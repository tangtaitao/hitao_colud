package com.hzitxx.hitao.service.shopgoods;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopGoodsContent;
import com.hzitxx.hitao.mapper.shopgoods.ShopGoodsContentMapper;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopGoodsContentService实现类
 * 
 * @author wujun
 *
 */
@Service
public class ShopGoodsContentServiceImpl implements ShopGoodsContentService {

	@Autowired
	private ShopGoodsContentMapper mapper;

	/**
	 * 增加商品内容
	 * 
	 * @param shopGoodsContent
	 * @return
	 */
	public ServerResponse<?> addShopGoodsContent(ShopGoodsContent shopGoodsContent) {
		int result = mapper.addShopGoodsContent(shopGoodsContent);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("添加失败!");
		}
		return ServerResponse.createBySuccessMessage("添加成功!");
	}

	/**
	 * 查询商品内容
	 * 
	 * @param map
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopGoodsContent>> selectShopGoodsContent(Map<String, Object> map) {
		List<ShopGoodsContent> shopGoodsContents = mapper.selectShopGoodsContent(map);
		PageInfo<ShopGoodsContent> info = new PageInfo<>(shopGoodsContents);
		LayuiEntity<ShopGoodsContent> layuiEntity = new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("商品内容信息");
		layuiEntity.setCount(info.getTotal());
		layuiEntity.setData(info.getList());
		return ServerResponse.createBySuccess("商品内容信息数据", layuiEntity);
	}

	/**
	 * 根据id修改数据
	 * 
	 * @param shopGoodsContent
	 * @return
	 */
	public ServerResponse<?> updateById(ShopGoodsContent shopGoodsContent) {
		int result = mapper.updateById(shopGoodsContent);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("编辑失败!");
		}
		return ServerResponse.createBySuccessMessage("编辑成功!");
	}

	/**
	 * 根据id删除
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
