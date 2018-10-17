package com.hzitxx.hitao.service.marketing.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopAdv;
import com.hzitxx.hitao.entity.ShopArticle;
import com.hzitxx.hitao.entity.ShopArticleClass;
import com.hzitxx.hitao.mapper.marketing.ShopAdvMapper;
import com.hzitxx.hitao.mapper.marketing.ShopArticleClassMapper;
import com.hzitxx.hitao.mapper.marketing.ShopArticleMapper;
import com.hzitxx.hitao.service.marketing.ShopAdvService;
import com.hzitxx.hitao.service.marketing.ShopArticleClassService;
import com.hzitxx.hitao.service.marketing.ShopArticleService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 广告分类表的service层
 * 
 * @author Administrator
 *
 */
@Service
public class ShopArticleClassServiceImpl implements ShopArticleClassService {
	// 自动注入ShopArticleClassService对象
	@Autowired
	private ShopArticleClassMapper shopArticleClassMapper;

	/**
	 * 添加一条数据
	 */
	@Override
	public ServerResponse<Integer> addShopArticleClass(ShopArticleClass shopArticleClass) {
		// 添加数据
		int i = shopArticleClassMapper.addShopArticleClass(shopArticleClass);
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
	public ServerResponse<Integer> deleteById(Integer acId) {
		// 删除数据
		int i = shopArticleClassMapper.deleteById(acId);
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
	public ServerResponse<Integer> updateById(ShopArticleClass shopArticleClass) {
		// 修改数据
		int i = shopArticleClassMapper.updateById(shopArticleClass);
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
	public ServerResponse<ShopArticleClass> findOne(Integer acId) {
		// 查询信息
		ShopArticleClass shopArticleClass = shopArticleClassMapper.findOne(acId);
		// 判断是否成功
		if (shopArticleClass != null) {
			// 成功
			return ServerResponse.createBySuccess("一条文章信息", shopArticleClass);
		} else {
			// 失败
			return ServerResponse.createByErrorMessage("查询失败");
		}
	}

	/**
	 * 搜索数据并分页
	 */
	@Override
	public ServerResponse<LayuiEntity<ShopArticleClass>> searchShopArticleClass(Map<String, Object> map, int page,
			int limit) {
		// 分页
		PageHelper.startPage(page, limit);
		// 查询数据
		List<ShopArticleClass> list = shopArticleClassMapper.searchShopArticleClass(map);
		// 创建pageInfo获取数据
		PageInfo<ShopArticleClass> pageInfo = new PageInfo<>(list);
		// 创建layui实体类
		LayuiEntity<ShopArticleClass> layuiEntity = new LayuiEntity<>();
		// 设置属性值
		layuiEntity.setCode(0);
		layuiEntity.setMsg("文章信息");
		layuiEntity.setCount(pageInfo.getTotal());
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess("文章信息", layuiEntity);
	}

}
