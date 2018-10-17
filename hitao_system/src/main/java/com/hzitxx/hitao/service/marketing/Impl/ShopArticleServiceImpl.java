package com.hzitxx.hitao.service.marketing.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopArticle;
import com.hzitxx.hitao.mapper.marketing.ShopArticleMapper;
import com.hzitxx.hitao.service.marketing.ShopArticleService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 广告表的service层
 * 
 * @author Administrator
 *
 */
@Service
public class ShopArticleServiceImpl implements ShopArticleService {
	// 自动注入ShopArticleService对象
	@Autowired
	private ShopArticleMapper shopArticleMapper;

	/**
	 * 添加一条数据
	 */
	@Override
	public ServerResponse<Integer> addShopArticle(ShopArticle shopArticle) {
		// 添加数据
		int i = shopArticleMapper.addShopArticle(shopArticle);
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
	public ServerResponse<Integer> deleteById(Integer articleId) {
		// 删除数据
		int i = shopArticleMapper.deleteById(articleId);
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
	public ServerResponse<Integer> updateById(ShopArticle shopArticle) {
		// 修改数据
		int i = shopArticleMapper.updateById(shopArticle);
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
	public ServerResponse<ShopArticle> findOne(Integer articleId) {
		// 查询信息
		ShopArticle shopArticle = shopArticleMapper.findOne(articleId);
		// 判断是否成功
		if (shopArticle != null) {
			// 成功
			return ServerResponse.createBySuccess("一条文章信息", shopArticle);
		} else {
			// 失败
			return ServerResponse.createByErrorMessage("查询失败");
		}
	}

	/**
	 * 搜索数据并分页
	 */
	@Override
	public ServerResponse<LayuiEntity<ShopArticle>> searchShopArticle(Map<String, Object> map, int page, int limit) {
		// 分页
		PageHelper.startPage(page, limit);
		// 查询数据
		List<ShopArticle> list = shopArticleMapper.searchShopArticle(map);
		// 创建pageInfo获取数据
		PageInfo<ShopArticle> pageInfo = new PageInfo<>(list);
		// 创建layui实体类
		LayuiEntity<ShopArticle> layuiEntity = new LayuiEntity<>();
		// 设置属性值
		layuiEntity.setCode(0);
		layuiEntity.setMsg("文章信息");
		layuiEntity.setCount(pageInfo.getTotal());
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess("文章信息", layuiEntity);
	}

}
