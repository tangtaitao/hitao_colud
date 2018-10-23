
package com.hzitxx.hitao.utils;

import java.util.List;

public class ShopGoodsUtils {

	private int goodsId;
	private String goodsName;
	private String goodsJingle;
	private String goodsVat;
	private int brandId;
	private String goodsPrice;
	private String goodsMarketprice;
	private String goodsStorage;
	private int gcId;
	private String goodsCommand;
	private String mainImage;
	private String content;
	private List<String> goodsImages;
	private List<AttrValue> attrValue;
	//接受attrValue的中间桥梁
	private String replace;

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

	public void setGoodsVat(String goodsVat) {
		this.goodsVat = goodsVat;
	}

	public String getGoodsVat() {
		return goodsVat;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsMarketprice(String goodsMarketprice) {
		this.goodsMarketprice = goodsMarketprice;
	}

	public String getGoodsMarketprice() {
		return goodsMarketprice;
	}

	public void setGoodsStorage(String goodsStorage) {
		this.goodsStorage = goodsStorage;
	}

	public String getGoodsStorage() {
		return goodsStorage;
	}

	public void setGcId(int gcId) {
		this.gcId = gcId;
	}

	public int getGcId() {
		return gcId;
	}

	public void setGoodsCommand(String goodsCommand) {
		this.goodsCommand = goodsCommand;
	}

	public String getGoodsCommand() {
		return goodsCommand;
	}

	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

	public String getMainImage() {
		return mainImage;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setGoodsImages(List<String> goodsImages) {
		this.goodsImages = goodsImages;
	}

	public List<String> getGoodsImages() {
		return goodsImages;
	}

	public void setAttrValue(List<AttrValue> attrValue) {
		this.attrValue = attrValue;
	}

	public List<AttrValue> getAttrValue() {
		return attrValue;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public String getReplace() {
		return replace;
	}

	public void setReplace(String replace) {
		this.replace = replace;
	}

	@Override
	public String toString() {
		return "ShopGoodsUtils [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsJingle=" + goodsJingle
				+ ", goodsVat=" + goodsVat + ", brandId=" + brandId + ", goodsPrice=" + goodsPrice
				+ ", goodsMarketprice=" + goodsMarketprice + ", goodsStorage=" + goodsStorage + ", gcId=" + gcId
				+ ", goodsCommand=" + goodsCommand + ", mainImage=" + mainImage + ", content=" + content
				+ ", goodsImages=" + goodsImages + ", attrValue=" + attrValue + ", replace=" + replace + "]";
	}

}