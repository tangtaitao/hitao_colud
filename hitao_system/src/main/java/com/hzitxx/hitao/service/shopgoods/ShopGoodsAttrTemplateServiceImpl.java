package com.hzitxx.hitao.service.shopgoods;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopGoodsAttrTemplate;
import com.hzitxx.hitao.mapper.shopgoods.ShopGoodsAttrTemplateMapper;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * 商品属性模板服务层实现类
 * @author wujun
 *
 */
@Service
public class ShopGoodsAttrTemplateServiceImpl implements ShopGoodsAttrTemplateService {

	@Autowired
	private ShopGoodsAttrTemplateMapper mapper;

	/**
	 * 增加商品属性模板
	 * 
	 * @param shopGoodsAttrTemplate
	 * @return
	 */
	public ServerResponse<?> addShopGoodsAttrTemplate(ShopGoodsAttrTemplate shopGoodsAttrTemplate){
		int result = mapper.addShopGoodsAttrTemplate(shopGoodsAttrTemplate);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("添加失败!");
		}
		return ServerResponse.createBySuccessMessage("添加成功!");
		
	}

	/**
	 * 根据id物理删除
	 * 
	 * @param attrId
	 * @return
	 */
	public ServerResponse<?> deleteById(Integer attrId){
		int result = mapper.deleteById(attrId);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("删除失败!");
		}
		return ServerResponse.createBySuccessMessage("删除成功!");

		
	}

	/**
	 * 根据id修改
	 * 
	 * @param shopGoodsAttrTemplate
	 * @return
	 */
	public ServerResponse<?> updateById(ShopGoodsAttrTemplate shopGoodsAttrTemplate){
		int result = mapper.updateById(shopGoodsAttrTemplate);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("编辑失败!");
		}
		return ServerResponse.createBySuccessMessage("编辑成功!");

		
	}

	/**
	 * 查询商品属性模板
	 * @param map
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopGoodsAttrTemplate>> selectShopGoodsAttrTemplate(Map<String, Object> map){
		List<ShopGoodsAttrTemplate> shopGoodsAttrTemplates = mapper.selectShopGoodsAttrTemplate(map);
		PageInfo<ShopGoodsAttrTemplate> info = new PageInfo<>(shopGoodsAttrTemplates);
		LayuiEntity<ShopGoodsAttrTemplate> layuiEntity = new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("商品属性模板信息");
		layuiEntity.setCount(info.getTotal());
		layuiEntity.setData(info.getList());
		return ServerResponse.createBySuccess("商品属性模板信息数据", layuiEntity);
		
	}
}
