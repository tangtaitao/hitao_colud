package com.hzitxx.hitao.service.marketing.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopAdv;
import com.hzitxx.hitao.mapper.marketing.ShopAdvMapper;
import com.hzitxx.hitao.service.marketing.ShopAdvService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 广告表的service层
 * 
 * @author Administrator
 *
 */
@Service
public class ShopAdvServiceImpl implements ShopAdvService {
	// 自动注入ShopAdvService对象
	@Autowired
	private ShopAdvMapper shopAdvMapper;

	/**
	 * 添加一条数据
	 */
	@Override
	public ServerResponse<Integer> addShopAdv(ShopAdv shopAdv) {
		// 添加数据
		int i = shopAdvMapper.addShopAdv(shopAdv);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("添加成功");
		} else {
			// 失败
			return ServerResponse.createByErrorMessage("添加失败");
		}
	}

	/**
	 * 删除一条数据
	 */
	@Override
	public ServerResponse<Integer> deleteById(Integer advId) {
		// 删除数据
		int i = shopAdvMapper.deleteById(advId);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("删除成功");
		} else {
			// 失败
			return ServerResponse.createByErrorMessage("删除失败");
		}
	}

	/**
	 * 修改一条数据
	 */
	@Override
	public ServerResponse<Integer> updateById(ShopAdv shopAdv) {
		// 修改数据
		int i = shopAdvMapper.updateById(shopAdv);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("修改成功");
		} else {
			// 失败
			return ServerResponse.createByErrorMessage("修改失败");
		}
	}

	/**
	 * 查询一条信息
	 */
	@Override
	public ServerResponse<ShopAdv> findOne(Integer advId) {
		// 查询信息
		ShopAdv shopAdv = shopAdvMapper.findOne(advId);
		// 判断是否成功
		if (shopAdv != null) {
			// 成功
			return ServerResponse.createBySuccess("一条广告信息", shopAdv);
		} else {
			// 失败
			return ServerResponse.createByErrorMessage("查询失败");
		}
	}

	/**
	 * 搜索数据并分页
	 */
	@Override
	public ServerResponse<LayuiEntity<ShopAdv>> searchShopAdv(Map<String, Object> map, int page, int limit) {
		// 分页
		PageHelper.startPage(page, limit);
		// 查询数据
		List<ShopAdv> list = shopAdvMapper.searchShopAdv(map);
		// 创建pageInfo获取数据
		PageInfo<ShopAdv> pageInfo = new PageInfo<>(list);
		// 创建layui实体类
		LayuiEntity<ShopAdv> layuiEntity = new LayuiEntity<>();
		// 设置属性值
		layuiEntity.setCode(0);
		layuiEntity.setMsg("广告信息");
		layuiEntity.setCount(pageInfo.getTotal());
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess("广告信息", layuiEntity);
	}

}
