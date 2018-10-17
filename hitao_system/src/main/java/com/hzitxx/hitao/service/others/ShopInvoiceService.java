package com.hzitxx.hitao.service.others;

import java.util.Map;

import com.hzitxx.hitao.entity.ShopInvoice;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopInvoiceService接口层
 * @author wujun
 *
 */
public interface ShopInvoiceService {

	/**
	 * 增加商品发票信息
	 * @param shopInvoice
	 * @return
	 */
	ServerResponse<?> addShopInvoice(ShopInvoice shopInvoice);
	
	/**
	 * 查询商品发票信息
	 * @param shopInvoice
	 * @return
	 */
	ServerResponse<LayuiEntity<ShopInvoice>> selectShopInvoice(Map<String, Object> map );
	
	/**
	 * 根据id修改商品发票信息
	 * @param shopInvoice
	 * @return
	 */
	ServerResponse<?> updateById(ShopInvoice shopInvoice);
	
	/**
	 * 根据id删除商品发票信息
	 * @param invId
	 * @return
	 */
	ServerResponse<?> deleteById(Integer invId);
}
