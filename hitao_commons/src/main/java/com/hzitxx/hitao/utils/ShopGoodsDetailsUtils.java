package com.hzitxx.hitao.utils;

public class ShopGoodsDetailsUtils {

	private ShopGoods shopGoods;
	private String goodsAttr;
	private GoodsContent goodsContent;
	private int isFavorites;

	public void setShopGoods(ShopGoods shopGoods) {
		this.shopGoods = shopGoods;
	}

	public ShopGoods getShopGoods() {
		return shopGoods;
	}

	public void setGoodsAttr(String goodsAttr) {
		this.goodsAttr = goodsAttr;
	}

	public String getGoodsAttr() {
		return goodsAttr;
	}

	public void setGoodsContent(GoodsContent goodsContent) {
		this.goodsContent = goodsContent;
	}

	public GoodsContent getGoodsContent() {
		return goodsContent;
	}

	public void setIsFavorites(int isFavorites) {
		this.isFavorites = isFavorites;
	}

	public int getIsFavorites() {
		return isFavorites;
	}

	@Override
	public String toString() {
		return "ShopGoodsDetailsUtils [shopGoods=" + shopGoods + ", goodsAttr=" + goodsAttr + ", goodsContent="
				+ goodsContent + ", isFavorites=" + isFavorites + "]";
	}

}