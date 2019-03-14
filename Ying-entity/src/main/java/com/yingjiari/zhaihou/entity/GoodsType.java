package com.yingjiari.zhaihou.entity;

public class GoodsType {
    private int goodsTypeID;
    private String goodsTypeName;

    public GoodsType(){}
    public GoodsType( String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }
    public GoodsType(int goodsTypeID, String goodsTypeName) {
        this.goodsTypeID = goodsTypeID;
        this.goodsTypeName = goodsTypeName;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "goodsTypeID=" + goodsTypeID +
                ", goodsTypeName='" + goodsTypeName + '\'' +
                '}';
    }

    public int getGoodsTypeID() {
        return goodsTypeID;
    }

    public void setGoodsTypeID(int goodsTypeID) {
        this.goodsTypeID = goodsTypeID;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }
}
