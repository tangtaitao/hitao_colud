package com.hzitxx.hitao.mapper.marketing;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopArticleClass;

/**
 * 处理shop_article_class表的操作
 * 
 * @author Administrator
 *
 */
public interface ShopArticleClassMapper {
	/**
	 * 添加一条数据
	 * 
	 * @param shopArticleClass
	 * @return
	 */
	int addShopArticleClass(ShopArticleClass shopArticleClass);

	/**
	 * 根据id删除一条数据
	 * 
	 * @param acId
	 * @return
	 */
	int deleteById(Integer acId);

	/**
	 * 根据id修改数据
	 * 
	 * @param shopArticleClass
	 * @return
	 */
	int updateById(ShopArticleClass shopArticleClass);

	/**
	 * 根据id查询数据
	 * 
	 * @param acId
	 * @return
	 */
	ShopArticleClass findOne(Integer acId);

	/**
	 * 搜索数据
	 * 
	 * @param map 为空则查询所有数据
	 */
	List<ShopArticleClass> searchShopArticleClass(Map<String, Object> map);
}
