package com.hzitxx.hitao.utils;

import java.util.Date;

public class ShopGoods {

	private int goodsId;
	private String goodsName;
	private String goodsJingle;
	private int gcId;
	private int brandId;
	private double goodsPrice;
	private int goodsMarketprice;
	private int goodsStorage;
	private String mainImage;
	private int goodsState;
	private int goodsVerify;
	private int evaluationGoodStar;
	private int isDel;
	private Date updatedTime;

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsJingle(String goodsJingle) {
		this.goodsJingle = goodsJingle;
	}

	public String getGoodsJingle() {
		return goodsJingle;
	}

	public void setGcId(int gcId) {
		this.gcId = gcId;
	}

	public int getGcId() {
		return gcId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public double getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsMarketprice(int goodsMarketprice) {
		this.goodsMarketprice = goodsMarketprice;
	}

	public int getGoodsMarketprice() {
		return goodsMarketprice;
	}

	public void setGoodsStorage(int goodsStorage) {
		this.goodsStorage = goodsStorage;
	}

	public int getGoodsStorage() {
		return goodsStorage;
	}

	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

	public String getMainImage() {
		return mainImage;
	}

	public void setGoodsState(int goodsState) {
		this.goodsState = goodsState;
	}

	public int getGoodsState() {
		return goodsState;
	}

	public void setGoodsVerify(int goodsVerify) {
		this.goodsVerify = goodsVerify;
	}

	public int getGoodsVerify() {
		return goodsVerify;
	}

	public void setEvaluationGoodStar(int evaluationGoodStar) {
		this.evaluationGoodStar = evaluationGoodStar;
	}

	public int getEvaluationGoodStar() {
		return evaluationGoodStar;
	}

	public void setIsDel(int isDel) {
		this.isDel = isDel;
	}

	public int getIsDel() {
		return isDel;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	@Override
	public String toString() {
		return "ShopGoods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsJingle=" + goodsJingle + ", gcId="
				+ gcId + ", brandId=" + brandId + ", goodsPrice=" + goodsPrice + ", goodsMarketprice="
				+ goodsMarketprice + ", goodsStorage=" + goodsStorage + ", mainImage=" + mainImage + ", goodsState="
				+ goodsState + ", goodsVerify=" + goodsVerify + ", evaluationGoodStar=" + evaluationGoodStar
				+ ", isDel=" + isDel + ", updatedTime=" + updatedTime + "]";
	}

}