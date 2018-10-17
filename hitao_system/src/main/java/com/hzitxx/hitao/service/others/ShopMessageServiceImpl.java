package com.hzitxx.hitao.service.others;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.hzitxx.hitao.entity.ShopMessage;
import com.hzitxx.hitao.mapper.others.ShopMessageMapper;
import com.hzitxx.hitao.utils.LayuiEntity;
import com.hzitxx.hitao.utils.ServerResponse;

/**
 * ShopMessageService实现层
 * @author wujun
 *
 */
@Service
public class ShopMessageServiceImpl implements ShopMessageService {

	@Autowired
	private ShopMessageMapper mapper;
	/**
	 * 增加消息
	 * @param shopMessage
	 * @return
	 */
	public ServerResponse<?> addShopMessage(ShopMessage shopMessage) {
		int result = mapper.addShopMessage(shopMessage);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("添加失败!");
		}
		return ServerResponse.createBySuccessMessage("添加成功!");
	}
	
	/**
	 * 查询消息
	 * @param map
	 * @return
	 */
	public ServerResponse<LayuiEntity<ShopMessage>> selectShopMessage(Map<String, Object> map ) {
		List<ShopMessage> shopMessages = mapper.selectShopMessage(map);
		PageInfo<ShopMessage> info = new PageInfo<>(shopMessages);
		LayuiEntity<ShopMessage> layuiEntity = new LayuiEntity<>();
		layuiEntity.setCode(0);
		layuiEntity.setMsg("消息信息");
		layuiEntity.setCount(info.getTotal());
		layuiEntity.setData(info.getList());
		return ServerResponse.createBySuccess("消息信息数据", layuiEntity);
	}
	
	/**
	 * 根据id修改消息
	 * @param shopMessage
	 * @return
	 */
	public ServerResponse<?> updateById(ShopMessage shopMessage) {
		int result = mapper.updateById(shopMessage);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("编辑失败!");
		}
		return ServerResponse.createBySuccessMessage("编辑成功!");
	}
	
	/**
	 * 根据id删除消息
	 * @param messageId
	 * @return
	 */
	public ServerResponse<?> deleteById(Integer messageId) {
		int result = mapper.deleteById(messageId);
		if (result != 1) {
			return ServerResponse.createByErrorMessage("删除失败!");
		}
		return ServerResponse.createBySuccessMessage("删除成功!");
	}
}
