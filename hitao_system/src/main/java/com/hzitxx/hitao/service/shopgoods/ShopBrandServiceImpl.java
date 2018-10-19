package com.hzitxx.hitao.service.shopgoods;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopBrand;
import com.hzitxx.hitao.mapper.shopgoods.ShopBrandMapper;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopBrandService实现层
 * @author wujun
 *
 */
@Service
public class ShopBrandServiceImpl implements ShopBrandService {

	@Autowired 
	private ShopBrandMapper mapper;
	/**
	 * 增加品牌
	 * @param shopBrand
	 * @return
	 */
	public ServerResponse<?> addShopBrand(ShopBrand shopBrand) {
		int result = mapper.addShopBrand(shopBrand);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("添加失败!");
		}
		return ServerResponse.createBySuccessMessage("添加成功!");
	}
	
	/**
	 * 查询品牌信息
	 * @param map
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopBrand>> selectShopBrand(Map<String, Object> map ) {
		List<ShopBrand> shopBrands = mapper.selectShopBrand(map);
		PageInfo<ShopBrand> info = new PageInfo<>(shopBrands);
		LayuiEntity<ShopBrand> layuiEntity = new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("商品品牌信息");
		layuiEntity.setCount(info.getTotal());
		layuiEntity.setData(info.getList());
		return ServerResponse.createBySuccess("商品品牌信息数据", layuiEntity);
	}
	
	/**
	 * 根据id修改
	 * @param shopBrand
	 * @return
	 */
	public ServerResponse<?> updateById(ShopBrand shopBrand) {
		int result = mapper.updateById(shopBrand);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("编辑失败!");
		}
		return ServerResponse.createBySuccessMessage("编辑成功!");
	}
	
	/**
	 * 根据id删除品牌信息
	 * @param brandId
	 * @return
	 */
	public ServerResponse<?> deleteById(Integer brandId) {
		int result = mapper.deleteById(brandId);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("删除失败!");
		}
		return ServerResponse.createBySuccessMessage("删除成功!");
	}
	
	/**
	 * 根据id批量删除品牌信息
	 * @param ids
	 * @return
	 */
	@Override
    public ServerResponse<?> deleteByIds(String[]ids){
        int result = mapper.deleteByIds(ids);
        if(result == 0){
            return ServerResponse.createByErrorMessage("批量删除失败!");
        }
        return ServerResponse.createBySuccessMessage("批量删除成功!");
    }

	/**
	 * 根据id查询
	 */
	@Override
	public ServerResponse<List<ShopBrand>> getByClassId(Map<String, Object> map) {
		List<ShopBrand> shopBrands = mapper.selectShopBrand(map);
		return ServerResponse.createBySuccess(shopBrands);
	}
}
