package com.hzitxx.hitao.service.order.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopPayment;
import com.hzitxx.hitao.mapper.order.ShopPaymentMapper;
import com.hzitxx.hitao.service.order.ShopPaymentService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 操作shop_payment表
 * 
 * @author Administrator
 *
 */
@Service
public class ShopPaymentServiceImpl implements ShopPaymentService {
	// 自动注入ShopPaymentMapper对象
	@Autowired
	private ShopPaymentMapper shopPaymentMapper;

	/**
	 * 添加一条信息
	 * 
	 * @param shopPayment
	 * @return
	 */
	@Override
	public ServerResponse<Integer> addShopPayment(ShopPayment shopPayment) {
		// 添加数据
		int i = shopPaymentMapper.addShopPayment(shopPayment);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("添加成功");
		}
		// 失败
		return ServerResponse.createByErrorMessage("添加失败");
	}

	/**
	 * 根据id删除一条数据
	 * 
	 * @param paymentId
	 * @return
	 */
	@Override
	public ServerResponse<Integer> deleteById(Integer paymentId) {
		// 删除数据
		int i = shopPaymentMapper.deleteById(paymentId);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("删除成功");
		}
		// 失败
		return ServerResponse.createByErrorMessage("删除失败");
	}

	/**
	 * 根据Id更新数据
	 * 
	 * @param shopPayment
	 * @return
	 */
	@Override
	public ServerResponse<Integer> updateById(ShopPayment shopPayment) {
		// 修改数据
		int i = shopPaymentMapper.updateById(shopPayment);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("修改成功");
		}
		// 失败
		return ServerResponse.createByErrorMessage("修改失败");
	}

	/**
	 * 根据Id查询一条信息
	 * 
	 * @param paymentId
	 * @return
	 */
	@Override
	public ServerResponse<ShopPayment> findOne(Integer paymentId) {
		// 查询数据
		ShopPayment shopPayment = shopPaymentMapper.findOne(paymentId);
		// 判断是否查询成功
		// 判断是否成功
		if (shopPayment != null) {
			// 成功
			return ServerResponse.createBySuccess("一条支付方式数据", shopPayment);
		}
		// 失败
		return ServerResponse.createByErrorMessage("添加失败");
	}

	/**
	 * 搜索数据并分页
	 * 
	 * @param map 用户搜索的数据信息，为空则为查询所有数据
	 * @return
	 */
	@Override
	public ServerResponse<LayuiEntity<ShopPayment>> searchShopPayment(Map<String, Object> map, int page, int limit) {
		// 分页
		PageHelper.startPage(page, limit);
		// 查询数据
		List<ShopPayment> list = shopPaymentMapper.searchShopPayment(map);
		// 创建PageInfo对象以便获取数据
		PageInfo<ShopPayment> pageInfo = new PageInfo<>(list);
		// 创建LayuiEntity对象
		LayuiEntity<ShopPayment> layuiEntity = new LayuiEntity<>();
		// 存入数据
		layuiEntity.setCode(0);// 状态码，0表示成功
		layuiEntity.setMsg("支付方式数据");// 描述信息
		layuiEntity.setCount(pageInfo.getTotal());// 数据总数
		layuiEntity.setData(pageInfo.getList());// 数据
		return ServerResponse.createBySuccess("支付方法", layuiEntity);
	}

}
