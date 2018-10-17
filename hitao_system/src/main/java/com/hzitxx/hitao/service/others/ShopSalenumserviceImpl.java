package com.hzitxx.hitao.service.others;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopSalenum;
import com.hzitxx.hitao.mapper.others.ShopSalenumMapper;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopSalenumService实现类
 * @author wujun
 *
 */
@Service
public class ShopSalenumserviceImpl implements ShopSalenumService{

	@Autowired
	private ShopSalenumMapper mapper;
	
	/**
	 * 增加销售统计信息
	 * @param shopSalenum
	 * @return
	 */
	public ServerResponse<?> addShopSalenum(ShopSalenum shopSalenum) {
		int result = mapper.addShopSalenum(shopSalenum);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("添加失败!");
		}
		return ServerResponse.createBySuccessMessage("添加成功!");
	}
	/**
	 * 查询销售统计信息
	 * 
	 * @param shopSalenum
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopSalenum>> selectShopSalenum(Map<String, Object> map) {
		List<ShopSalenum> shopSalenums = mapper.selectShopSalenum(map);
		PageInfo<ShopSalenum> info = new PageInfo<>(shopSalenums);
		LayuiEntity<ShopSalenum> layuiEntity = new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("销售统计信息");
		layuiEntity.setCount(info.getTotal());
		layuiEntity.setData(info.getList());
		return ServerResponse.createBySuccess("销售统计信息数据", layuiEntity);
	}
	
	
	/**
	 * 根据id修改销售统计信息
	 * @param shopSalenum
	 * @return
	 */
	public ServerResponse<?> updateById(ShopSalenum shopSalenum) {
		int result = mapper.updateById(shopSalenum);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("编辑失败!");
		}
		return ServerResponse.createBySuccessMessage("编辑成功!");
	}
	
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	public ServerResponse<?> deleteById(Integer id) {
		int result = mapper.deleteById(id);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("删除失败!");
		}
		return ServerResponse.createBySuccessMessage("删除成功!");
	}
}
