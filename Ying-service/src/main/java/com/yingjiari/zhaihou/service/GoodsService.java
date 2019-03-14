package com.yingjiari.zhaihou.service;

import com.yingjiari.zhaihou.entity.*;

import java.util.List;

public interface GoodsService {
    List<Goods> queryGoodsBy();
    List<Goodson> queryGoodsonBy(String goodsname,String goodsonName);
    List<Goods> queryGoodsByName(String goodsname);
    List<GoodsType> queryGoodsTypeBy();
    List<Shopping> queryShoppingBy(String customerName,int shoppingBoolean);
    List<Ordertedails> queryOrdertedailsBy(int orderId,int orderBoolean);
    List<Order> queryOrdersBys(String customerName);
    List<Entry> queryEntryBy();
    List<Customer> queryCustomerBy();
    int queryGoodsDelete(String goodsName);
    int queryShoppingDelete(int shopping);
    int queryShoppingsDelete(Shopping shopping);
    int queryGoodsInsert(Goods goods);
    int queryShoppingInsert(Shopping shopping);
    int queryOrderInsert(Order order);
    int queryCustomerInsert(Customer customer);
    int querySiteInsert(Site site);
    int queryordertedailsInsert(Ordertedails ordertedails);
    int queryShoppingUpdate(Shopping shopping);
    int querySiteUpdate(Site site);
    int queryorderBooleanUpdate(Order order);
    List<Customers> querySiteBy(String customerName,int shoppingBoolean);
    List<Site> querySitesBy(String customerName,int siteBoolean);
    List<Order> queryOrderBy();
    List<Order> queryOrdersBy(String customerName,int siteBoolean,int orderId);
}
