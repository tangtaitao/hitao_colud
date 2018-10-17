package com.hzitxx.hitao.controller.order;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.hzitxx.hitao.entity.ShopOrderLog;
import com.hzitxx.hitao.service.order.ShopOrderLogService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 订单的controller层
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/shopOrderLog")
public class ShopOrderLogController {
	// 自动注入ShopOrderLogservice对象
	@Autowired
	private ShopOrderLogService shopOrderLogService;

	/**
	 * 添加数据
	 * 
	 * @param shopOrderLog
	 * @return
	 */
	@PostMapping("/addShopOrderLog")
	public ServerResponse<Integer> addShopOrderLog(@RequestBody ShopOrderLog shopOrderLog) {
		// 设置处理时间
		shopOrderLog.setLogTime(new Date());
		// 添加数据
		ServerResponse<Integer> serverResponse = shopOrderLogService.addShopOrderLog(shopOrderLog);
		return serverResponse;

	}

	/**
	 * 根据id删除信息
	 * 
	 * @param logId
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<Integer> deleteById(Integer logId) {
		// 删除数据
		ServerResponse<Integer> serverResponse = shopOrderLogService.deleteById(logId);
		return serverResponse;
	}

	/**
	 * 根据Id修改信息
	 * 
	 * @param shopOrderLog
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<Integer> updateById(@RequestBody ShopOrderLog shopOrderLog) {
		// 修改信息
		ServerResponse<Integer> serverResponse = shopOrderLogService.updateById(shopOrderLog);
		return serverResponse;
	}

	/**
	 * 根据Id查询数据
	 * 
	 * @param orderId
	 * @return
	 */
	@GetMapping("/findOne")
	public ServerResponse<ShopOrderLog> findOne(Integer logId) {
		// 查询一条数据
		ServerResponse<ShopOrderLog> serverResponse = shopOrderLogService.findOne(logId);
		return serverResponse;
	}

	/**
	 * 获取所有数据及分页
	 * 
	 * @param page
	 * @param limit
	 * @return
	 */
	@GetMapping("/page")
	public ServerResponse<LayuiEntity<ShopOrderLog>> searchShopOrder(String value,
			@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "limit", defaultValue = "20") Integer limit) {
		Map<String, Object> map = new HashMap<>();
		ServerResponse<LayuiEntity<ShopOrderLog>> serverResponse = shopOrderLogService.searchShopOrderLog(map, page,
				limit);
		return serverResponse;
	}
}
