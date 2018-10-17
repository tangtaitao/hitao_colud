package com.hzitxx.hitao.service.others;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopInvoice;
import com.hzitxx.hitao.mapper.others.ShopInvoiceMapper;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopInvoiceService实现层
 * @author wujun
 *
 */
@Service
public class ShopInvoiceServiceImpl implements ShopInvoiceService {
	
	@Autowired
	private ShopInvoiceMapper mapper;
	
	/**
	 * 增加商品发票信息
	 * @param shopInvoice
	 * @return
	 */
	public ServerResponse<?> addShopInvoice(ShopInvoice shopInvoice) {
		int result = mapper.addShopInvoice(shopInvoice);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("添加失败!");
		}
		return ServerResponse.createBySuccessMessage("添加成功!");
	}
	
	/**
	 * 查询商品发票信息
	 * @param shopInvoice
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopInvoice>> selectShopInvoice(Map<String, Object> map ) {
		List<ShopInvoice> shopInvoices = mapper.selectShopInvoice(map);
		PageInfo<ShopInvoice> info = new PageInfo<>(shopInvoices);
		LayuiEntity<ShopInvoice> layuiEntity = new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("商品发票信息");
		layuiEntity.setCount(info.getTotal());
		layuiEntity.setData(info.getList());
		return ServerResponse.createBySuccess("商品发票信息数据", layuiEntity);
	}
	
	/**
	 * 根据id修改商品发票信息
	 * @param shopInvoice
	 * @return
	 */
	public ServerResponse<?> updateById(ShopInvoice shopInvoice) {
		int result = mapper.updateById(shopInvoice);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("编辑失败!");
		}
		return ServerResponse.createBySuccessMessage("编辑成功!");
	}
	
	/**
	 * 根据id删除商品发票信息
	 * @param invId
	 * @return
	 */
	public ServerResponse<?> deleteById(Integer invId) {
		int result = mapper.deleteById(invId);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("删除失败!");
		}
		return ServerResponse.createBySuccessMessage("删除成功!");
	}
}
