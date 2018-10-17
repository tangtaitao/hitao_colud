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

import com.hzitxx.hitao.entity.ShopMessage;
import com.hzitxx.hitao.service.others.ShopMessageService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 消息控制层
 * @author wujun
 *
 */
@Controller
@RestController
@RequestMapping("/shopMessage")
public class ShopMessageController {
	@Autowired
	private ShopMessageService service;

	/**
	 * 获取消息信息
	 * @return
	 */
	@GetMapping("/getPage")
	public ServerResponse<LayuiEntity<ShopMessage>> getPage() {
		Map<String, Object> map = new HashMap<>();
		return service.selectShopMessage(map);
	}
	
	/**
	 * 增加消息
	 * @param shopMessage
	 * @return
	 */
	@PostMapping("/addShopMessage")
	public ServerResponse<?> addShopMessage(@RequestBody ShopMessage shopMessage){
		return service.addShopMessage(shopMessage);
	}
	
	/**
	 * 编辑消息
	 * @param shopMessage
	 * @return
	 */
	@PostMapping("/updateById")
	public ServerResponse<?> updateById(@RequestBody ShopMessage shopMessage){
		return service.updateById(shopMessage);
	}
	
	/**
	 * 根据id删除消息
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteById")
	public ServerResponse<?> deleteById(Integer messageId){
		return service.deleteById(messageId);
	}
}
