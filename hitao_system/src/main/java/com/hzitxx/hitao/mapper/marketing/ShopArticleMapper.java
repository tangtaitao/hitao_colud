package com.hzitxx.hitao.mapper.marketing;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopArticle;

/**
 * 处理shop_article表的操作
 * 
 * @author Administrator
 *
 */
public interface ShopArticleMapper {
	/**
	 * 添加一条数据
	 * 
	 * @param shopArticle
	 * @return
	 */
	int addShopArticle(ShopArticle shopArticle);

	/**
	 * 根据id删除一条数据
	 * 
	 * @param articleId
	 * @return
	 */
	int deleteById(Integer articleId);

	/**
	 * 根据id修改数据
	 * 
	 * @param shopArticle
	 * @return
	 */
	int updateById(ShopArticle shopArticle);

	/**
	 * 根据id查询数据
	 * 
	 * @param articleId
	 * @return
	 */
	ShopArticle findOne(Integer articleId);

	/**
	 * 搜索数据
	 * 
	 * @param map 为空则查询所有数据
	 */
	List<ShopArticle> searchShopArticle(Map<String, Object> map);
}
