package com.hzitxx.hitao.controller.order;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.hzitxx.hitao.entity.ShopExpress;
import com.hzitxx.hitao.service.order.ShopExpressService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 快递公司表的controller层
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/shopExpress")
public class ShopExpressController {
	// 自动注入ShopExpress对象
	@Autowired
	private ShopExpressService shopExpressService;

	/**
	 * 添加一条数据
	 * 
	 * @param shopExpress
	 * @return
	 */
	@PostMapping("/addShopExpress")
	ServerResponse<Integer> addShopExpress(@RequestBody ShopExpress shopExpress) {
		return shopExpressService.addShopExpress(shopExpress);
	}

	/**
	 * 根据id删除一条信息
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteById")
	ServerResponse<Integer> deleteById(Integer id) {
		return shopExpressService.deleteById(id);
	}

	/**
	 * 根据id修改数据（包括逻辑删除）
	 * 
	 * @param id
	 * @return
	 */
	@PostMapping("/updateById")
	ServerResponse<Integer> updateById(@RequestBody ShopExpress shopExpress) {
		return shopExpressService.updateById(shopExpress);
	}

	/**
	 * 根据id查询一条数据
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/findOne")
	ServerResponse<ShopExpress> findOne(Integer id) {
		return shopExpressService.findOne(id);
	}

	/**
	 * 根据用户搜索的信息查询数据并分页
	 * 
	 * @param map 用户搜索的数据信息，为空则为查询所有数据
	 * @return
	 */
	@GetMapping("/page")
	public ServerResponse<LayuiEntity<ShopExpress>> page(String value,
			@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "20") int limit) {
		Map<String, Object> map = new HashMap<>();
		return shopExpressService.searchShopExpress(map, page, limit);

	}
}
