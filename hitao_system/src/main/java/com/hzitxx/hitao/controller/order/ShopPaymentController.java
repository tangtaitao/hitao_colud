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

import com.hzitxx.hitao.entity.ShopPayment;
import com.hzitxx.hitao.service.order.ShopPaymentService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 支付方式表的controller层
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/shopPayment")
public class ShopPaymentController {
	// 自动注入ShopPaymentService对象
	@Autowired
	private ShopPaymentService shopPaymentService;

	/**
	 * 添加一条数据
	 * 
	 * @param shopPayment
	 * @return
	 */
	@PostMapping("/addShopPayment")
	ServerResponse<Integer> addShopPayment(@RequestBody ShopPayment shopPayment) {
		//设置创建时间
		shopPayment.setCreatedTime(new Date());
		// 添加数据
		return shopPaymentService.addShopPayment(shopPayment);
	}

	/**
	 * 根据id删除一条数据
	 * 
	 * @param paymentId
	 * @return
	 */
	@GetMapping("/deleteById")
	ServerResponse<Integer> deleteById(Integer paymentId) {
		return shopPaymentService.deleteById(paymentId);

	}

	/**
	 * 根据Id更新数据
	 * 
	 * @param shopPayment
	 * @return
	 */
	@PostMapping("/updateById")
	ServerResponse<Integer> updateById(@RequestBody ShopPayment shopPayment) {
		//设置修改时间
		shopPayment.setUpdatedTime(new Date());
		return shopPaymentService.updateById(shopPayment);

	}

	/**
	 * 根据Id查询一条信息
	 * 
	 * @param paymentId
	 * @return
	 */
	@GetMapping("/findOne")
	ServerResponse<ShopPayment> findOne(Integer paymentId) {
		return shopPaymentService.findOne(paymentId);

	}

	/**
	 * 搜索数据
	 * 
	 * @param map 用户搜索的数据信息，为空则为查询所有数据
	 * @return
	 */
	@GetMapping("/page")
	ServerResponse<LayuiEntity<ShopPayment>> searchShopPayment(String value,
			@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "20") int limit) {
		Map<String, Object> map = new HashMap<>();
		return shopPaymentService.searchShopPayment(map, page, limit);
	}
}
