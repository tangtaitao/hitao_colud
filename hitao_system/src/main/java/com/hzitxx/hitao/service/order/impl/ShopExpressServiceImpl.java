package com.hzitxx.hitao.service.order.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopExpress;
import com.hzitxx.hitao.mapper.order.ShopExpressMapper;
import com.hzitxx.hitao.service.order.ShopExpressService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 操作shop_express表
 * 
 * @author Administrator
 *
 */
@Service
public class ShopExpressServiceImpl implements ShopExpressService {
	// 自动注入ShopExpressMapper
	@Autowired
	private ShopExpressMapper shopExpressMapper;

	/**
	 * 添加一条数据
	 * 
	 * @param shopExpress
	 * @return
	 */
	@Override
	public ServerResponse<Integer> addShopExpress(ShopExpress shopExpress) {
		// 添加数据
		int i = shopExpressMapper.addShopExpress(shopExpress);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("添加成功");
		}
		// 失败
		return ServerResponse.createByErrorMessage("添加失败");
	}

	/**
	 * 根据id删除一条信息
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public ServerResponse<Integer> deleteById(Integer id) {
		// 删除数据
		int i = shopExpressMapper.deleteById(id);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("删除成功");
		}
		// 失败
		return ServerResponse.createByErrorMessage("删除失败");
	}

	/**
	 * 根据id修改数据（包括逻辑删除）
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public ServerResponse<Integer> updateById(ShopExpress shopExpress) {
		// 修改数据
		int i = shopExpressMapper.updateById(shopExpress);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("修改成功");
		}
		// 失败
		return ServerResponse.createByErrorMessage("修改失败");
	}

	/**
	 * 根据id查询一条数据
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public ServerResponse<ShopExpress> findOne(Integer id) {
		// 查询一条数据
		ShopExpress shopExpress = shopExpressMapper.findOne(id);
		// 判断是否成功
		if (shopExpress != null) {
			// 成功
			return ServerResponse.createBySuccess("一条快递公司信息", shopExpress);
		}
		// 失败
		return ServerResponse.createByErrorMessage("查询失败");
	}

	/**
	 * 根据用户搜索的信息查询数据并分页
	 * 
	 * @param map 用户搜索的数据信息，为空则为查询所有数据
	 * @return
	 */
	@Override
	public ServerResponse<LayuiEntity<ShopExpress>> searchShopExpress(Map<String, Object> map, int page, int limit) {
		// 实现分页
		PageHelper.startPage(page, limit);
		// 查询数据
		List<ShopExpress> list = shopExpressMapper.searchShopExpress(map);
		// 创建一个PageInfo对象,以便获取数据
		PageInfo<ShopExpress> pageInfo = new PageInfo<>(list);
		// 创建LayuiEntity对象返回数据
		LayuiEntity<ShopExpress> layuiEntity = new LayuiEntity<>();
		// 添加数据
		layuiEntity.setCode(0);// 0表示成功
		layuiEntity.setMsg("订单信息");
		layuiEntity.setCount(pageInfo.getTotal());// 获取数据总数
		layuiEntity.setData(pageInfo.getList());
		return ServerResponse.createBySuccess("订单数据", layuiEntity);
	}

}
