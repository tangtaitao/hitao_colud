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
import com.hzitxx.hitao.entity.ShopTransport;
import com.hzitxx.hitao.service.order.ShopTransportService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 运输表的controller层
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/shopTransport")
public class ShopTransportController {
	// 自动注入ShopTransportService对象
	@Autowired
	private ShopTransportService shopTransportService;

	/**
	 * 添加一条运费数据
	 * 
	 * @param shopTransport
	 * @return
	 */
	@PostMapping("/addShopTransport")
	public ServerResponse<Integer> addShopTransport(@RequestBody ShopTransport shopTransport) {
		// 设置创建时间
		shopTransport.setCreatedTime(new Date());
		return shopTransportService.addShopTransport(shopTransport);
	}

	/**
	 * 根据id删除一条数据
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<Integer> deleteById(Integer id) {
		return shopTransportService.deleteById(id);
	}

	/**
	 * 根据id修改一条数据
	 * 
	 * @param shopTransport
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<Integer> updateById(@RequestBody ShopTransport shopTransport) {
		// 设置修改时间
		shopTransport.setUpdatedTime(new Date());
		return shopTransportService.updateById(shopTransport);
	}

	/**
	 * 根据id查询一条数据
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/findOne")
	public ServerResponse<ShopTransport> findOne(Integer id) {
		return shopTransportService.findOne(id);
	}

	/**
	 * 查询数据并分页，
	 * 
	 * @param map   查询的信息，为空则查询所有信息
	 * @param page
	 * @param limit
	 * @return
	 */
	@GetMapping("/page")
	public ServerResponse<LayuiEntity<ShopTransport>> searchShopTransport(String value,
			@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "20") int limit) {
		Map<String, Object> map = new HashMap<>();
		return shopTransportService.searchShopTransport(map, page, limit);
	}

}
