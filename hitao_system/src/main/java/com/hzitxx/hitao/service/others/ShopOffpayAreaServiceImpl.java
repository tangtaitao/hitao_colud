package com.hzitxx.hitao.service.others;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopOffpayArea;
import com.hzitxx.hitao.mapper.others.ShopOffpayAreaMapper;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopOffpayAreaService实现层
 * @author wujun
 *
 */
@Service
public class ShopOffpayAreaServiceImpl implements ShopOffpayAreaService {

	@Autowired
	private ShopOffpayAreaMapper mapper;
	/**
	 * 增加货到货款支持地区
	 * 
	 * @param shopOffpayArea
	 * @return
	 */
	public ServerResponse<?> addShopOffpayArea(ShopOffpayArea shopOffpayArea) {
		int result = mapper.addShopOffpayArea(shopOffpayArea);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("添加失败!");
		}
		return ServerResponse.createBySuccessMessage("添加成功!");
	}

	/**
	 * 查询货到货款支持地区
	 * @param map
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopOffpayArea>> selectShopOffpayArea(Map<String, Object> map) {
		List<ShopOffpayArea> shopOffpayAreas = mapper.selectShopOffpayArea(map);
		PageInfo<ShopOffpayArea> info = new PageInfo<>(shopOffpayAreas);
		LayuiEntity<ShopOffpayArea> layuiEntity = new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("货到货款支持地区信息");
		layuiEntity.setCount(info.getTotal());
		layuiEntity.setData(info.getList());
		return ServerResponse.createBySuccess("货到货款支持地区信息数据", layuiEntity);
	}
	
	/**
	 * 根据id修改货到货款支持地区
	 * @param shopOffpayArea
	 * @return
	 */
	public ServerResponse<?> updateById(ShopOffpayArea shopOffpayArea) {
		int result = mapper.updateById(shopOffpayArea);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("编辑失败!");
		}
		return ServerResponse.createBySuccessMessage("编辑成功!");
	}
	
	/**
	 * 根据id删除货到货款支持地区
	 * @param areaId
	 * @return
	 */
	public ServerResponse<?> deleteById(String areaId) {
		int result = mapper.deleteById(areaId);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("删除失败!");
		}
		return ServerResponse.createBySuccessMessage("删除成功!");
	}
}
