package com.hzitxx.hitao.service.shopgoods;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopGoods;
import com.hzitxx.hitao.entity.ShopGoodsAttr;
import com.hzitxx.hitao.entity.ShopGoodsAttrTemplate;
import com.hzitxx.hitao.entity.ShopGoodsContent;
import com.hzitxx.hitao.entity.ShopGoodsImages;
import com.hzitxx.hitao.mapper.shopgoods.ShopGoodsAttrMapper;
import com.hzitxx.hitao.mapper.shopgoods.ShopGoodsAttrTemplateMapper;
import com.hzitxx.hitao.mapper.shopgoods.ShopGoodsContentMapper;
import com.hzitxx.hitao.mapper.shopgoods.ShopGoodsImagesMapper;
import com.hzitxx.hitao.mapper.shopgoods.ShopGoodsMapper;
import com.hzitxx.hitao.utils.AttrValue;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;
import com.hzitxx.hitao.utils.ShopGoodsUtils;

/**
 * 商品信息服务层实现类
 * 
 * @author wujun
 *
 */
@Service
public class ShopGoodsServiceImpl implements ShopGoodsService {

	@Autowired
	private ShopGoodsMapper mapper;
	@Autowired
	private ShopGoodsContentMapper contentMapper;
	@Autowired
	private ShopGoodsImagesMapper imagesMapper;
	@Autowired
	private ShopGoodsAttrMapper shopGoodsAttrMapper;
	@Autowired
	private ShopGoodsAttrTemplateMapper shopGoodsAttrTemplateMapper;

	/**
	 * 查询goods
	 * 
	 * @param map
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopGoods>> selectShopGoods(int page, int limit, Map<String, Object> map) {
		PageHelper.startPage(page, limit);
		List<ShopGoods> shopGoods = mapper.selectShopGoods(map);
		PageInfo<ShopGoods> info = new PageInfo<>(shopGoods);
		LayuiEntity<ShopGoods> layuiEntity = new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("商品信息");
		layuiEntity.setCount(info.getTotal());
		layuiEntity.setData(info.getList());
		return ServerResponse.createBySuccess("商品信息数据", layuiEntity);
	}

	/**
	 * 增加goods
	 */
	@Override
	@Transactional
	public ServerResponse<?> addShopGoods(ShopGoodsUtils shopGoodsUtils) {
		// 商品表的增加
		ShopGoods goods = new ShopGoods();
		try {
			BeanUtils.copyProperties(goods, shopGoodsUtils);
			goods.setCreatedTime(new Date());
			int result1 = mapper.addShopGoods(goods);
			if (result1 != 1) {
				return ServerResponse.createByErrorMessage("添加失败!");
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		// 商品内容表的增加
		ShopGoodsContent shopGoodsContent = new ShopGoodsContent();
		try {
			BeanUtils.copyProperties(shopGoodsContent, shopGoodsUtils);
			shopGoodsContent.setCreatedTime(new Date());
			shopGoodsContent.setGoodsId(goods.getGoodsId());
			int result2 = contentMapper.addShopGoodsContent(shopGoodsContent);
			if (result2 != 1) {
				return ServerResponse.createByErrorMessage("添加失败!");
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		// 商品图片的增加
		ShopGoodsImages shopGoodsImages = new ShopGoodsImages();
		try {
			BeanUtils.copyProperties(shopGoodsImages, shopGoodsUtils);
			shopGoodsImages.setGoodsId(goods.getGoodsId());
			shopGoodsImages.setGoodsImage(goods.getMainImage());
			int result3 = imagesMapper.addShopGoodsImages(shopGoodsImages);
			if (result3 != 1) {
				return ServerResponse.createByErrorMessage("添加失败!");
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		// 属性模板的添加
		ShopGoodsAttrTemplate shopGoodsAttrTemplate = new ShopGoodsAttrTemplate();
		try {
			BeanUtils.copyProperties(shopGoodsAttrTemplate, shopGoodsUtils);
			shopGoodsAttrTemplate.setCatId(shopGoodsUtils.getGcId());
			shopGoodsAttrTemplate.setAttrValue(JSON.toJSONString(shopGoodsUtils.getAttrValue()));
			int result4 = shopGoodsAttrTemplateMapper.addShopGoodsAttrTemplate(shopGoodsAttrTemplate);
			if (result4 != 1) {
				return ServerResponse.createByErrorMessage("添加失败!");
			}
		} catch (IllegalAccessException e2) {
			e2.printStackTrace();
		} catch (InvocationTargetException e2) {
			e2.printStackTrace();
		}
		try {
			BeanUtils.copyProperties(shopGoodsAttrTemplate, shopGoodsUtils);
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			e1.printStackTrace();
		}
		// 商品属性的增加
		ShopGoodsAttr shopGoodsAttr = new ShopGoodsAttr();
		shopGoodsAttr.setCreatedTime(new Date());
		try {
			BeanUtils.copyProperties(shopGoodsAttr, shopGoodsUtils);
			shopGoodsAttr.setCatId(shopGoodsUtils.getGcId());
			shopGoodsAttr.setGoodsId(goods.getGoodsId());
			shopGoodsAttr.setAttrId(shopGoodsAttrTemplate.getAttrId());
			shopGoodsAttr.setAttrValue(JSON.toJSONString(shopGoodsUtils.getAttrValue()));
			int result5 = shopGoodsAttrMapper.addShopGoodsAttr(shopGoodsAttr);
			if (result5 != 1) {
				return ServerResponse.createByErrorMessage("添加失败!");
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return ServerResponse.createBySuccessMessage("添加成功!");
	}

	/**
	 * 更新goods
	 * 
	 * @param goods
	 * @return
	 */
	@Override
	@Transactional
	public ServerResponse<?> updateShopGoods(ShopGoodsUtils shopGoodsUtils) {
		// 商品表的编辑
		ShopGoods goods = new ShopGoods();
		try {
			BeanUtils.copyProperties(goods, shopGoodsUtils);
			goods.setUpdatedTime(new Date());
			int result1 = mapper.updateShopGoods(goods);
			if (result1 != 1) {
				return ServerResponse.createByErrorMessage("编辑失败!");
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		// 商品内容表的编辑
		ShopGoodsContent shopGoodsContent = new ShopGoodsContent();
		try {
			BeanUtils.copyProperties(shopGoodsContent, shopGoodsUtils);
			shopGoodsContent.setUpdatedTime(new Date());
			int result2 = contentMapper.updateById(shopGoodsContent);
			if (result2 != 1) {
				return ServerResponse.createByErrorMessage("编辑失败!");
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		// 商品图片的编辑
		ShopGoodsImages shopGoodsImages = new ShopGoodsImages();
		try {
			BeanUtils.copyProperties(shopGoodsImages, shopGoodsUtils);
			shopGoodsImages.setGoodsImage(goods.getMainImage());
			int result3 = imagesMapper.updateById(shopGoodsImages);
			if (result3 != 1) {
				return ServerResponse.createByErrorMessage("编辑失败!");
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		// 商品属性的编辑
		ShopGoodsAttr shopGoodsAttr = new ShopGoodsAttr();
		shopGoodsAttr.setCreatedTime(new Date());
		try {
			BeanUtils.copyProperties(shopGoodsAttr, shopGoodsUtils);
			shopGoodsAttr.setCatId(shopGoodsUtils.getGcId());
			shopGoodsAttr.setAttrValue(JSON.toJSONString(shopGoodsUtils.getAttrValue()));
			int result5 = shopGoodsAttrMapper.updateById(shopGoodsAttr);
			if (result5 != 1) {
				return ServerResponse.createByErrorMessage("编辑失败!");
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return ServerResponse.createBySuccessMessage("编辑成功!");
	}

	/**
	 * 根据ID物理删除
	 * 
	 * @param goodsId
	 * @return
	 */
	@Override
	public ServerResponse<?> deleteById(Integer goodsId) {
		int result = mapper.deleteById(goodsId);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("删除失败!");
		}
		return ServerResponse.createBySuccessMessage("删除成功!");
	}
	
	/**
	 * 根据id查询
	 * 
	 * @param goodsId
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ServerResponse<ShopGoodsUtils> findOne(Integer goodsId) {
		List<ShopGoodsUtils> shopGoodsUtils = mapper.findOne(goodsId);
		shopGoodsUtils.get(0).setAttrValue((List<AttrValue>)JSONArray.parse(shopGoodsUtils.get(0).getReplace()));
		shopGoodsUtils.get(0).setReplace(null);
		return ServerResponse.createBySuccess(shopGoodsUtils.get(0));
	}
}
