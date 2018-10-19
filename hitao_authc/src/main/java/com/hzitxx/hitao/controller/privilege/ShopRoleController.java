package com.hzitxx.hitao.controller.privilege;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzitxx.hitao.entity.ShopRole;
import com.hzitxx.hitao.service.privilege.ShopRoleService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

@Controller
@RequestMapping("/Role")
public class ShopRoleController {
	@Autowired
	private ShopRoleService service;

	/**
	 * 分页查询
	 * 
	 * @param page
	 * @param limit
	 * @return
	 */
	@GetMapping("/page")
	@ResponseBody
	public ServerResponse<LayuiEntity<ShopRole>> page(int page, int limit) {
		return service.LayuiEntity(page, limit);
	}

	/**
	 * 单条数据查询
	 * 
	 * @param roleId
	 * @return
	 */
	@GetMapping("/inquire")
	@ResponseBody
	public ServerResponse<List<ShopRole>> inquire(Integer roleId) {
		return service.findOne(roleId);
	}

	/**
	 * 新增数据
	 * 
	 * @param shopRole
	 * @return
	 */
	@PostMapping("/addRole")
	@ResponseBody
	public ServerResponse<Integer> addRole(ShopRole shopRole) {
		return service.addRole(shopRole);
	}

	/**
	 * 删除数据
	 * 
	 * @param roleId
	 * @return
	 */
	@PostMapping("/deleteRole")
	@ResponseBody
	public ServerResponse<Integer> deleteRole(Integer roleId) {
		return service.deleteRole(roleId);
	}

	/**
	 * 修改数据
	 * 
	 * @param shopRole
	 * @return
	 */
	@PostMapping("updateRole")
	@ResponseBody
	public ServerResponse<Integer> updateRole(ShopRole shopRole) {
		return service.updateRole(shopRole);
	}

	/**
	 * 批量删除
	 */
	@GetMapping("/removeBatch")
	@ResponseBody
	public ServerResponse<Integer> removeBatch(String roleIds) {
		String[] split = roleIds.split(",");
		ServerResponse<Integer> serverResponse = null;
		for (int i = 0; i < split.length; i++) {
			serverResponse = service.deleteRole(Integer.parseInt(split[i]));
		}
		return serverResponse;
	}
}
