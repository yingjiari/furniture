package com.yingjiari.zhaihou.dao;


import com.yingjiari.zhaihou.common.phoneVerCode.SendMessage;
import com.yingjiari.zhaihou.entity.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//指定bean注入的配置文件
@ContextConfiguration(locations = { "classpath:applicationContext.xml"})
//使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner
@RunWith(SpringJUnit4ClassRunner.class)
public class GoodsDaoTest {

    @Autowired
    GoodsDao dao;
    Goods goods;
    GoodsType goodsType;
    Shopping shopping;
    Site site;
    Order order;
    Customer customer;
    Ordertedails ordertedails;

    @Test
    public void goodsByTest(){
        System.out.println(dao.goodsBy());
    }
    @Test
    public void goodsonByTest(){
        System.out.println(dao.goodsonBy("欧式真皮沙发",""));
    }
    @Test
    public void goodsByNameTest(){
        System.out.println(dao.goodsByName(null));
    }
    @Test
    public void shoppingByTest(){System.out.println(dao.shoppingBy("小猫咪",-1));}
    @Test
    public void setOrdertedailsByTest(){System.out.println(dao.ordertedailsBy(25413,-1));}
    @Test
    public void ordersBysTest(){System.out.println(dao.ordersBys("小刚"));}
    @Test
    public void entryByTest(){
        System.out.print(dao.entryBy());
    }
    @Test
    public void customerByTest(){
        System.out.print(dao.customerBy());
    }
    @Test
    public void shoppingDeleteTest(){
        dao.shoppingDelete(5);
    }
    @Test
    public void shoppingsDeleteTest(){
        shopping=new Shopping(1,"小猫咪");
        dao.shoppingsDelete(shopping);
    }
    @Test
    public void goodsDeleteTest(){
        dao.goodsDelete("布艺沙发2");
    }
    @Test
    public void goodsInsertTest(){
        goods=new Goods("布艺沙发3",null,12,"shafa1.JPG");
        System.out.println(dao.goodsInsert(goods));
    }
    @Test
    public void orderInsertTest(){
        order=new Order(43146,"小猫咪",0,"欧式沙发",1231.01);
        System.out.println(dao.orderInsert(order));
    }
    @Test
    public void shoppingInsertTest(){
        shopping=new Shopping(1,6,"小猫咪");
        System.out.println(dao.shoppingInsert(shopping));
    }
    @Test
    public void customerInsertTest(){
        customer=new Customer("小帅哥","123123","殷凡","1301632212","3412132123212243");
        System.out.print(dao.customerInsert(customer));
    }
    @Test
    public void siteInsertTest(){
        site=new Site("小帅哥",130163221,"江西省丰城市张巷镇殷家村29号",12341,"学校",0);
        System.out.print(dao.siteInsert(site));
    }
    @Test
    public void ordertedailsInsertTest(){
        ordertedails=new Ordertedails(12435,7,1);
        System.out.print(dao.ordertedailsInsert(ordertedails));
    }
    @Test
    public void goodsTypeByTest(){
        System.out.println(dao.goodsTypeBy());
    }

    @Test
    public void shoppingUpdate(){
        shopping=new Shopping(9,1,1);
        System.out.println(dao.shoppingUpdate(shopping));
    }
    @Test
    public void siteUpdate(){
        site=new Site(1,1);
        System.out.println(dao.siteUpdate(site));
    }
    @Test
    public void siteByTest(){
        System.out.println(dao.siteBy("小猫咪",1));
    }
    @Test
    public void sitesByTest(){
        System.out.println(dao.sitesBy("小明",-1));
    }
    @Test
    public void orderByTest(){
        System.out.println(dao.orderBy());
    }
    @Test
    public void ordersByTest(){
        System.out.println(dao.ordersBy("小猫咪",1,0));
    }

    @Test
    public void SendVerificationCode() {
        int a=(int)((Math.random()*9+1)*100000);
        String b=a+"";
        SendMessage sendMessage=new SendMessage();
        sendMessage.EX("13016322212",b);
    }

}
