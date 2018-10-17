package com.hzitxx.hitao.service.order.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopTransport;
import com.hzitxx.hitao.mapper.order.ShopTransportMapper;
import com.hzitxx.hitao.service.order.ShopTransportService;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

@Service
public class ShopTransportServiceImpl implements ShopTransportService {
	// 自动注入ShopTransportMapper对象
	@Autowired
	private ShopTransportMapper shopTransportMapper;

	/**
	 * 添加一条运费数据
	 * 
	 * @param shopTransport
	 * @return
	 */
	@Override
	public ServerResponse<Integer> addShopTransport(ShopTransport shopTransport) {
		// 新增数据
		int i = shopTransportMapper.addShopTransport(shopTransport);
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
	 * @param id
	 * @return
	 */
	@Override
	public ServerResponse<Integer> deleteById(Integer id) {
		// 删除数据
		int i = shopTransportMapper.deleteById(id);
		// 判断是否成功
		if (i == 1) {
			// 成功
			return ServerResponse.createBySuccessMessage("删除成功");
		}
		// 失败
		return ServerResponse.createByErrorMessage("删除失败");
	}

	/**
	 * 根据id修改一条数据
	 * 
	 * @param shopTransport
	 * @return
	 */
	@Override
	public ServerResponse<Integer> updateById(ShopTransport shopTransport) {
		// 修改数据
		int i = shopTransportMapper.updateById(shopTransport);
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
	public ServerResponse<ShopTransport> findOne(Integer id) {
		// 查询数据
		ShopTransport shopTransport = shopTransportMapper.findOne(id);
		// 判断是否查询成功
		if (shopTransport != null) {
			// 查询成功
			return ServerResponse.createBySuccess("一条运费信息", shopTransport);
		}
		// 查询失败
		return ServerResponse.createByErrorMessage("查询失败");
	}

	/**
	 * 查询数据并分页，
	 * 
	 * @param map   查询的信息，为空则查询所有信息
	 * @param page
	 * @param limit
	 * @return
	 */
	@Override
	public ServerResponse<LayuiEntity<ShopTransport>> searchShopTransport(Map<String, Object> map, int page,
			int limit) {
		// 分页
		PageHelper.startPage(page, limit);
		// 查询数据
		List<ShopTransport> list = shopTransportMapper.searchShopTransport(map);
		// 创建一个PageInfo对象，获取分页数据
		PageInfo<ShopTransport> pageInfo = new PageInfo<>(list);
		// 创建一个LayuiEntity对象以便返回数据
		LayuiEntity<ShopTransport> layuiEntity = new LayuiEntity<>();
		layuiEntity.setCode(0);// 状态码，0表示成功
		layuiEntity.setCount(pageInfo.getTotal());// 查询到的数据总数
		layuiEntity.setMsg("运费数据");// 描述信息
		layuiEntity.setData(pageInfo.getList());// 查询到的数据
		// 返回数据
		return ServerResponse.createBySuccess("运费数据", layuiEntity);
	}

}
