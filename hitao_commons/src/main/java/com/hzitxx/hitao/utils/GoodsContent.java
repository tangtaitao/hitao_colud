package com.hzitxx.hitao.utils;

import java.util.Date;

public class GoodsContent {

	private int goodsId;
	private String content;
	private Date updatedTime;

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	@Override
	public String toString() {
		return "GoodsContent [goodsId=" + goodsId + ", content=" + content + ", updatedTime=" + updatedTime + "]";
	}

}