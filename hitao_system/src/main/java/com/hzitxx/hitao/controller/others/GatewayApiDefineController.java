package com.hzitxx.hitao.controller.others;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hzitxx.hitao.entity.GatewayApiDefine;
import com.hzitxx.hitao.service.others.GatewayApiDefineService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 网关控制层
 * @author wujun
 *
 */
@Controller
@RestController
@RequestMapping("/gatewayApiDefine")
public class GatewayApiDefineController {
	@Autowired
	private GatewayApiDefineService service;

	/**
	 * 获取网关信息
	 * @return
	 */
	@GetMapping("/getPage")
	public ServerResponse<LayuiEntity<GatewayApiDefine>> getPage(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "10") int limit) {
		Map<String, Object> map = new HashMap<>();
		return service.selectGatewayApiDefine(page, limit,map);
	}
	
	/**
	 * 根据id获取网关信息
	 * @return
	 */
	@GetMapping("/findOne")
	public ServerResponse<List<GatewayApiDefine>> getPage(int id) {
		Map<String, Object> map = new HashMap<>();
		map.put("id", id);
		return service.findOne(map);
	}
	/**
	 * 增加网关
	 * @param gatewayApiDefine
	 * @return
	 */
	@PostMapping("/addGatewayApiDefine")
	public ServerResponse<?> addGatewayApiDefine(@RequestBody GatewayApiDefine gatewayApiDefine){
		return service.addGatewayApiDefine(gatewayApiDefine);
	}
	
	/**
	 * 编辑网关
	 * @param gatewayApiDefine
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<?> updateById(@RequestBody GatewayApiDefine gatewayApiDefine){
		return service.updateById(gatewayApiDefine);
	}
	
	/**
	 * 根据id删除网关
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<?> deleteById(Integer id){
		return service.deleteById(id);
	}
}
