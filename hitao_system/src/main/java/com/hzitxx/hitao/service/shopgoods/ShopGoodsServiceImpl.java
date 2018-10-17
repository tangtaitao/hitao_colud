package com.hzitxx.hitao.service.shopgoods;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopGoods;
import com.hzitxx.hitao.mapper.shopgoods.ShopGoodsMapper;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 商品信息服务层实现类
 * @author wujun
 *
 */
@Service
public class ShopGoodsServiceImpl implements ShopGoodsService {

	@Autowired
	private ShopGoodsMapper mapper;

	/**
	 * 查询goods
	 * 
	 * @param map
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopGoods>> selectShopGoods(int page, int limit, Map<String, Object> map) {
		PageHelper.startPage(page, limit);
		List<ShopGoods> shopGoods = mapper.selectShopGoods(map);
		PageInfo<ShopGoods> info = new PageInfo<>(shopGoods);
		LayuiEntity<ShopGoods> layuiEntity = new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("商品信息");
		layuiEntity.setCount(info.getTotal());
		layuiEntity.setData(info.getList());
		return ServerResponse.createBySuccess("商品信息数据", layuiEntity);
	}

	/**
	 * 增加goods
	 */
	@Override
	public ServerResponse<?> addShopGoods(ShopGoods goods) {
		int result = mapper.addShopGoods(goods);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("添加失败!");
		}
		return ServerResponse.createBySuccessMessage("添加成功!");
	}

	/**
	 * 更新goods
	 * 
	 * @param goods
	 * @return
	 */
	@Override
	public ServerResponse<?> updateShopGoods(ShopGoods goods) {
		int result = mapper.updateShopGoods(goods);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("编辑失败!");
		}
		return ServerResponse.createBySuccessMessage("编辑成功!");
	}

	/**
	 * 根据ID物理删除
	 * 
	 * @param goodsId
	 * @return
	 */
	@Override
	public ServerResponse<?> deleteById(Integer goodsId) {
		int result = mapper.deleteById(goodsId);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("删除失败!");
		}
		return ServerResponse.createBySuccessMessage("删除成功!");
	}
}
