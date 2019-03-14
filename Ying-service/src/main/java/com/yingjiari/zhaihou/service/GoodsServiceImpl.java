package com.yingjiari.zhaihou.service;

import com.yingjiari.zhaihou.dao.GoodsDao;
import com.yingjiari.zhaihou.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService{
    @Autowired
    GoodsDao goodsDao;

    @Override
    public List<Goods> queryGoodsByName(String goodsname) {

        return goodsDao.goodsByName(goodsname);
    }
    @Override
    public List<Goods> queryGoodsBy() {
        return goodsDao.goodsBy();
    }
    @Override
    public List<Goodson> queryGoodsonBy(String goodsname,String goodsonName) {
        return goodsDao.goodsonBy(goodsname,goodsonName);
    }
    @Override
    public List<GoodsType> queryGoodsTypeBy(){
        return  goodsDao.goodsTypeBy();
    }

    @Override
    public List<Entry> queryEntryBy(){
        return goodsDao.entryBy();
    }
    @Override
    public List<Shopping> queryShoppingBy(String customerName,int shoppingBoolean){
        return goodsDao.shoppingBy(customerName,shoppingBoolean);
    }
    @Override
    public List<Customer> queryCustomerBy(){
        return goodsDao.customerBy();
    }

    @Override
    public int queryGoodsDelete(String goodsName){
        return goodsDao.goodsDelete(goodsName);
    }
    @Override
    public int queryShoppingDelete(int shoppingId){
        return goodsDao.shoppingDelete(shoppingId);
    }
    @Override
    public int queryShoppingsDelete(Shopping shopping){
        return goodsDao.shoppingsDelete(shopping);
    }
    @Override
    public int queryGoodsInsert(Goods goods){
        return  goodsDao.goodsInsert(goods);
    }
    @Override
    public int queryShoppingInsert(Shopping shopping){
        return  goodsDao.shoppingInsert(shopping);
    }
    @Override
    public List<Ordertedails> queryOrdertedailsBy(int orderId,int orderBoolean){return goodsDao.ordertedailsBy(orderId,orderBoolean);}
    @Override
    public List<Order> queryOrdersBys(String customerName){return goodsDao.ordersBys(customerName);}
    @Override
    public int queryOrderInsert(Order order){
        return  goodsDao.orderInsert(order);
    }
    @Override
    public int queryCustomerInsert(Customer customer){return goodsDao.customerInsert(customer);}
    @Override
    public int querySiteInsert(Site site){return goodsDao.siteInsert(site);}
    @Override
    public int queryordertedailsInsert(Ordertedails ordertedails){return goodsDao.ordertedailsInsert(ordertedails);}
    @Override
    public int queryShoppingUpdate(Shopping shopping){
        return  goodsDao.shoppingUpdate(shopping);
    }
    @Override
    public int queryorderBooleanUpdate(Order order){
        return  goodsDao.orderBooleanUpdate(order);
    }
    @Override
    public int querySiteUpdate(Site site){
        return  goodsDao.siteUpdate(site);
    }
    @Override
    public List<Customers> querySiteBy(String customerName,int shoppingBoolean){return goodsDao.siteBy(customerName,shoppingBoolean);}
    @Override
    public List<Site> querySitesBy(String customerName,int siteBoolean){return goodsDao.sitesBy(customerName,siteBoolean);}
    @Override
    public List<Order> queryOrderBy(){return goodsDao.orderBy();}
    @Override
    public List<Order> queryOrdersBy(String customerName,int siteBoolean,int orderId){return goodsDao.ordersBy(customerName,siteBoolean,orderId);}
}
