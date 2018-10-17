package com.hzitxx.hitao.service.marketing;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopArticle;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 文章表的service层
 * 
 * @author Administrator
 *
 */

public interface ShopArticleService {
	/**
	 * 添加一条数据
	 * 
	 * @param ShopArticle
	 * @return
	 */
	ServerResponse<Integer> addShopArticle(ShopArticle shopArticle);

	/**
	 * 根据id删除一条信息
	 * 
	 * @param articleId
	 * @return
	 */
	ServerResponse<Integer> deleteById(Integer articleId);

	/**
	 * 根据id修改数据
	 * 
	 * @param ShopArticle
	 * @return
	 */
	ServerResponse<Integer> updateById(ShopArticle shopArticle);

	/**
	 * 根据id查询一条数据
	 * 
	 * @param articleId
	 * @return
	 */
	ServerResponse<ShopArticle> findOne(Integer articleId);

	/**
	 * 根据用户搜索的信息查询数据并分页
	 * 
	 * @param map 用户搜索的数据信息，为空则为查询所有数据
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopArticle>> searchShopArticle(Map<String, Object> map, int page, int limit);
}
