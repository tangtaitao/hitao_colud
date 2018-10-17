package com.hzitxx.hitao.service.others;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopSetting;
import com.hzitxx.hitao.mapper.others.ShopSettingMapper;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopSettingService实现类
 * @author wujun
 *
 */
@Service
public class ShopSettingServiceImpl implements ShopSettingService{

	@Autowired
	private ShopSettingMapper mapper;

	/**
	 * 查询系统设置
	 * @param map
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopSetting>> selectShopSetting(Map<String, Object> map ) {
		List<ShopSetting> shopSettings = mapper.selectShopSetting(map);
		PageInfo<ShopSetting> info = new PageInfo<>(shopSettings);
		LayuiEntity<ShopSetting> layuiEntity = new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("系统设置信息");
		layuiEntity.setCount(info.getTotal());
		layuiEntity.setData(info.getList());
		return ServerResponse.createBySuccess("系统设置信息数据", layuiEntity);
	}
	
	/**
	 * 增加系统设置
	 * @param shopSetting
	 * @return
	 */
	public ServerResponse<?> addShopSetting(ShopSetting shopSetting) {
		int result = mapper.addShopSetting(shopSetting);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("添加失败!");
		}
		return ServerResponse.createBySuccessMessage("添加成功!");
	}
	
	/**
	 * 根据id修改系统设置
	 * @param shopSetting
	 * @return
	 */
	public ServerResponse<?> updateById(ShopSetting shopSetting) {
		int result = mapper.updateById(shopSetting);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("编辑失败!");
		}
		return ServerResponse.createBySuccessMessage("编辑成功!");
	}
	
	/**
	 * 根据id删除系统设置
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
