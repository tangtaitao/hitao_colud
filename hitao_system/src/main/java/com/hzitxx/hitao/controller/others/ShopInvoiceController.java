package com.hzitxx.hitao.controller.others;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.ShopInvoice;
import com.hzitxx.hitao.service.others.ShopInvoiceService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 商品发票控制层
 * @author wujun
 *
 */
@Controller
@RestController
@RequestMapping("/shopInvoice")
public class ShopInvoiceController {

	@Autowired 
	private ShopInvoiceService service;
	
	/**
	 * 获取商品发票信息
	 * @return
	 */
	@GetMapping("/getPage")
	public ServerResponse<LayuiEntity<ShopInvoice>> getPage() {
		Map<String, Object> map = new HashMap<>();
		return service.selectShopInvoice(map);
	}
	
	/**
	 * 增加商品发票信息
	 * @param shopInvoice
	 * @return
	 */
	@PostMapping("/addShopInvoice")
	public ServerResponse<?> addShopInvoice(@RequestBody ShopInvoice shopInvoice){
		return service.addShopInvoice(shopInvoice);
	}
	
	/**
	 * 编辑商品发票信息
	 * @param shopInvoice
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<?> updateById(@RequestBody ShopInvoice shopInvoice){
		return service.updateById(shopInvoice);
	}
	
	/**
	 * 根据id删除商品发票信息
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<?> deleteById(Integer invId){
		return service.deleteById(invId);
	}
}
