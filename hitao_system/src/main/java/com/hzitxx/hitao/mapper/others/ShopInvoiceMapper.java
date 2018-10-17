package com.hzitxx.hitao.mapper.others;

import java.util.List;
import java.util.Map;

import com.hzitxx.hitao.entity.ShopInvoice;

/**
 * 商品发票信息接口
 * @author wujun
 *
 */
public interface ShopInvoiceMapper {

	/**
	 * 增加商品发票信息
	 * @param shopInvoice
	 * @return
	 */
	int addShopInvoice(ShopInvoice shopInvoice);
	
	/**
	 * 查询商品发票信息
	 * @param shopInvoice
	 * @return
	 */
	List<ShopInvoice> selectShopInvoice(Map<String, Object> map );
	
	/**
	 * 根据id修改商品发票信息
	 * @param shopInvoice
	 * @return
	 */
	int updateById(ShopInvoice shopInvoice);
	
	/**
	 * 根据id删除商品发票信息
	 * @param invId
	 * @return
	 */
	int deleteById(Integer invId);
}
