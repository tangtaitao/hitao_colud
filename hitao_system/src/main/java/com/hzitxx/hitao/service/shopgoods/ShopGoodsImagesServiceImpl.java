package com.hzitxx.hitao.service.shopgoods;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopGoodsImages;
import com.hzitxx.hitao.mapper.shopgoods.ShopGoodsImagesMapper;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopGoodsImagesService实现类
 * @author wujun
 *
 */
@Service
public class ShopGoodsImagesServiceImpl implements ShopGoodsImagesService {

	@Autowired
	private ShopGoodsImagesMapper mapper;
	/**
	 * 添加商品图片
	 * @param shopGoodsImages
	 * @return
	 */
	public ServerResponse<?> addShopGoodsImages(ShopGoodsImages shopGoodsImages) {
		int result = mapper.addShopGoodsImages(shopGoodsImages);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("添加失败!");
		}
		return ServerResponse.createBySuccessMessage("添加成功!");
	}
	
	/**
	 * 查询商品图片
	 * @param map
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopGoodsImages>> selectShopGoodsImages(Map<String, Object> map) {
		List<ShopGoodsImages> shopGoodsImages = mapper.selectShopGoodsImages(map);
		PageInfo<ShopGoodsImages> info = new PageInfo<>(shopGoodsImages);
		LayuiEntity<ShopGoodsImages> layuiEntity = new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("商品图片信息");
		layuiEntity.setCount(info.getTotal());
		layuiEntity.setData(info.getList());
		return ServerResponse.createBySuccess("商品图片信息数据", layuiEntity);
	}
	
	/**
	 * 根据id修改
	 * @param shopGoodsImages
	 * @return
	 */
	public ServerResponse<?> updateById(ShopGoodsImages shopGoodsImages) {
		int result = mapper.updateById(shopGoodsImages);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("编辑失败!");
		}
		return ServerResponse.createBySuccessMessage("编辑成功!");

	}
	
	/**
	 * 根据id删除
	 * @param goodsImageId
	 * @return
	 */
	public ServerResponse<?> deleteById(Integer goodsImageId) {
		int result = mapper.deleteById(goodsImageId);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("删除失败!");
		}
		return ServerResponse.createBySuccessMessage("删除成功!");
	}
}
