package com.hzitxx.hitao.service.marketing;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopArticleClass;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 文章分类表的service层
 * 
 * @author Administrator
 *
 */

public interface ShopArticleClassService {
	/**
	 * 添加一条数据
	 * 
	 * @param ShopArticle
	 * @return
	 */
	ServerResponse<Integer> addShopArticleClass(ShopArticleClass shopArticleClass);

	/**
	 * 根据id删除一条信息
	 * 
	 * @param acId
	 * @return
	 */
	ServerResponse<Integer> deleteById(Integer acId);

	/**
	 * 根据id修改数据
	 * 
	 * @param ShopArticleClass
	 * @return
	 */
	ServerResponse<Integer> updateById(ShopArticleClass shopArticleClass);

	/**
	 * 根据id查询一条数据
	 * 
	 * @param acId
	 * @return
	 */
	ServerResponse<ShopArticleClass> findOne(Integer acId);

	/**
	 * 根据用户搜索的信息查询数据并分页
	 * 
	 * @param map 用户搜索的数据信息，为空则为查询所有数据
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopArticleClass>> searchShopArticleClass(Map<String, Object> map, int page, int limit);
}
