package com.yingjiari.zhaihou.dao;

import com.yingjiari.zhaihou.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDao {
    public List<Goods> goodsByName(@Param("goodsName")String goodsName);
    public List<Goods> goodsBy();
    public List<Goodson> goodsonBy(@Param("goodsName")String goodsName,@Param("goodsonName")String goodsonName);
    public List<GoodsType> goodsTypeBy();
    public List<Customer> customerBy();
    public List<Shopping> shoppingBy(@Param("customerName")String customerName,@Param("shoppingBoolean")int shoppingBoolean);
    public List<Ordertedails> ordertedailsBy(@Param("orderId")int orderId,@Param("orderBoolean")int orderBoolean);
    public List<Order> ordersBys(@Param("customerName")String customerName);
    public List<Entry> entryBy();
    public int goodsDelete(String goodsName);
    public int shoppingDelete(int shoppingId);
    public int shoppingsDelete(Shopping shopping);
    public int goodsInsert(Goods goods);
    public int shoppingInsert(Shopping shopping);
    public int orderInsert(Order order);
    public int customerInsert(Customer customer);
    public int siteInsert(Site site);
    public int ordertedailsInsert(Ordertedails ordertedails);
    public int shoppingUpdate(Shopping shopping);
    public int siteUpdate(Site site);
    public int orderBooleanUpdate(Order order);
    public List<Customers> siteBy(@Param("customerName")String customerName,@Param("shoppingBoolean")int shoppingBoolean);
    public List<Site> sitesBy(@Param("customerName")String customerName,@Param("siteBoolean")int siteBoolean);
    public List<Order> orderBy();
    public List<Order> ordersBy(@Param("customerName")String customerName,@Param("siteBoolean")int siteBoolean,@Param("orderId")int orderId);
}
