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

import com.hzitxx.hitao.entity.ShopSalenum;
import com.hzitxx.hitao.service.others.ShopSalenumService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 销售统计控制层
 * @author wujun
 *
 */
@Controller
@RestController
@RequestMapping("/shopSalenum")
public class ShopSalenumController {
	@Autowired
	private ShopSalenumService service;

	/**
	 * 获取销售统计信息
	 * @return
	 */
	@GetMapping("/getPage")
	public ServerResponse<LayuiEntity<ShopSalenum>> getPage() {
		Map<String, Object> map = new HashMap<>();
		return service.selectShopSalenum(map);
	}
	
	/**
	 * 增加销售统计信息
	 * @param shopSalenum
	 * @return
	 */
	@PostMapping("/addShopSalenum")
	public ServerResponse<?> addShopSalenum(@RequestBody ShopSalenum shopSalenum){
		return service.addShopSalenum(shopSalenum);
	}
	
	/**
	 * 编辑销售统计信息
	 * @param shopSalenum
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<?> updateById(@RequestBody ShopSalenum shopSalenum){
		return service.updateById(shopSalenum);
	}
	
	/**
	 * 根据id删除销售统计信息
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<?> deleteById(Integer id){
		return service.deleteById(id);
	}

}
