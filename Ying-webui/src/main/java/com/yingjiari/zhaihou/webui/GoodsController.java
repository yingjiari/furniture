package com.yingjiari.zhaihou.webui;

import com.yingjiari.zhaihou.common.R;
import com.yingjiari.zhaihou.common.phoneVerCode.SendMessage;
import com.yingjiari.zhaihou.entity.*;
import com.yingjiari.zhaihou.service.GoodsService;

import org.apache.catalina.User;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;
    static List<Goods> goods = new ArrayList<>();
    Goods goodss;
    Shopping shopping;
    Site site;
    Order order;
    Customer customer;
    Ordertedails ordertedails;

    //商品查询跨域
    @RequestMapping(value = "/queryGoods", method = RequestMethod.GET)
    @ResponseBody
    public R queryGoods(HttpServletRequest request, HttpServletResponse response) {
        String goodsName = request.getParameter("goodsName");
        return R.ok(goodsService.queryGoodsByName(goodsName));
    }
    //购物车查询跨域
    @RequestMapping(value = "/queryShopping", method = RequestMethod.GET)
    @ResponseBody
    public R queryShopping(HttpServletRequest request, HttpServletResponse response) {
        String customerName = request.getParameter("customerName");
        int shoppingBoolean=Integer.parseInt(request.getParameter("shoppingBoolean"));
        return R.ok(goodsService.queryShoppingBy(customerName,shoppingBoolean));
    }
    //商品查询跨域
    @RequestMapping(value = "/queryGoodson", method = RequestMethod.GET)
    @ResponseBody
    public R queryGoodson(HttpServletRequest request, HttpServletResponse response) {
        String goodsName = request.getParameter("goodsName");
        String goodsonName = request.getParameter("goodsonName");
        return R.ok(goodsService.queryGoodsonBy(goodsName,goodsonName));
    }
    //商品类型查询跨域
    @RequestMapping(value = "/queryGoodsType", method = RequestMethod.GET)
    @ResponseBody
    public R queryGoodsType(HttpServletRequest request, HttpServletResponse response) {
        return R.ok(goodsService.queryGoodsTypeBy());
    }

    //订单查询跨域
    @RequestMapping(value = "/querySite", method = RequestMethod.GET)
    @ResponseBody
    public R querySite(HttpServletRequest request, HttpServletResponse response) {
        String customerName = request.getParameter("customerNamecustomerName");
        int shoppingBoolean=Integer.parseInt(request.getParameter("shoppingBoolean"));
        return R.ok(goodsService.querySiteBy(customerName,shoppingBoolean));
    }
    //订单信息查询跨域
    @RequestMapping(value = "/queryOrder", method = RequestMethod.GET)
    @ResponseBody
    public R queryOrder(HttpServletRequest request, HttpServletResponse response) {
        return R.ok(goodsService.queryOrderBy());
    }
    //订单查询跨域
    @RequestMapping(value = "/queryOrders", method = RequestMethod.GET)
    @ResponseBody
    public R queryOrders(HttpServletRequest request, HttpServletResponse response) {
        String customerName = request.getParameter("customerName");
        int siteBoolean=Integer.parseInt(request.getParameter("siteBoolean"));
        int orderId=Integer.parseInt(request.getParameter("orderId"));
        return R.ok(goodsService.queryOrdersBy(customerName,siteBoolean,orderId));
    }
    //地址查询跨域
    @RequestMapping(value = "/querySites", method = RequestMethod.GET)
    @ResponseBody
    public R querySites(HttpServletRequest request, HttpServletResponse response) {
        String customerName = request.getParameter("customerName");
        int siteBoolean=Integer.parseInt(request.getParameter("siteBoolean"));
        return R.ok(goodsService.querySitesBy(customerName,siteBoolean));
    }
    //订单编号查询跨域
    @RequestMapping(value = "/queryOrdersBys", method = RequestMethod.GET)
    @ResponseBody
    public R queryOrdersBys(HttpServletRequest request, HttpServletResponse response) {
        String customerName = request.getParameter("customerName");
        return R.ok(goodsService.queryOrdersBys(customerName));
    }
    //子订单查询跨域
    @RequestMapping(value = "/queryOrdertedailsBy", method = RequestMethod.GET)
    @ResponseBody
    public R queryOrdertedailsBy(HttpServletRequest request, HttpServletResponse response) {
        int orderId=Integer.parseInt(request.getParameter("orderId"));
        int orderBoolean=Integer.parseInt(request.getParameter("orderBoolean"));
        return R.ok(goodsService.queryOrdertedailsBy(orderId,orderBoolean));
    }

    //商品添加跨域
    @RequestMapping(value = "/queryGoodsInsert", method = RequestMethod.GET)
    @ResponseBody
    public R queryGoodsInsert(HttpServletRequest request, HttpServletResponse response) {
        String goodsName = request.getParameter("goodsName");
        String goodsUnitPrice=request.getParameter("goodsUnitPrice");
        int sellCount=Integer.parseInt(request.getParameter("sellCount"));
        String goodsImg=request.getParameter("goodsImg");
        goodss=new Goods(goodsName,goodsUnitPrice,sellCount,goodsImg);
        goodsService.queryGoodsInsert(goodss);
        return R.ok("添加成功");
    }
    //购物车添加跨域
    @RequestMapping(value = "/queryShoppingInsert", method = RequestMethod.GET)
    @ResponseBody
    public R queryShoppingInsert(HttpServletRequest request, HttpServletResponse response) {
        String customerName = request.getParameter("customerName");
        int goodsId=Integer.parseInt(request.getParameter("goodsId"));
        int shoppingNumber=Integer.parseInt(request.getParameter("shoppingNumber"));
        shopping=new Shopping(shoppingNumber,goodsId,customerName);
        goodsService.queryShoppingInsert(shopping);
        return R.ok("添加成功");
    }
    //订单添加跨域
    @RequestMapping(value = "/queryOrderInsert", method = RequestMethod.GET)
    @ResponseBody
    public R queryOrderInsert(HttpServletRequest request, HttpServletResponse response) {
        String customerName = request.getParameter("customerName");
        String orderGoods = request.getParameter("orderGoods");
        int orderId=Integer.parseInt(request.getParameter("orderId"));
        int orderBoolean=Integer.parseInt(request.getParameter("orderBoolean"));
        double orderPrice=Double.parseDouble(request.getParameter("orderPrice"));
        order=new Order(orderId,customerName,orderBoolean,orderGoods,orderPrice);
        goodsService.queryOrderInsert(order);
        return R.ok("添加成功");
    }
    //客户注册添加跨域
    @RequestMapping(value = "/queryCustomerInsert", method = RequestMethod.GET)
    @ResponseBody
    public R queryCustomerInsert(HttpServletRequest request, HttpServletResponse response) {
        String customerName = request.getParameter("customerName");
        String customerPass = request.getParameter("customerPass");
        String customerTrueName = request.getParameter("customerTrueName");
        String customerPhone = request.getParameter("customerPhone");
        String customerIdcard = request.getParameter("customerIdcard");
        customer=new Customer(customerName,customerPass,customerTrueName,customerPhone,customerIdcard);
        goodsService.queryCustomerInsert(customer);
        return R.ok("添加成功");
    }
    //地址添加跨域
    @RequestMapping(value = "/querySiteInsert", method = RequestMethod.GET)
    @ResponseBody
    public R querySiteInsert(HttpServletRequest request, HttpServletResponse response) {
        String customerName = request.getParameter("customerName");
        int siteCellphone=Integer.parseInt(request.getParameter("siteCellphone"));
        String siteDetails=request.getParameter("siteDetails");
        int siteMail=Integer.parseInt(request.getParameter("siteMail"));
        String siteTag=request.getParameter("siteTag");
        int siteBoolean=Integer.parseInt(request.getParameter("siteBoolean"));
        site=new Site(customerName,siteCellphone,siteDetails,siteMail,siteTag,siteBoolean);
        goodsService.querySiteInsert(site);
        return R.ok("添加成功");
    }
    //子订单添加跨域
    @RequestMapping(value = "/queryordertedailsInsert", method = RequestMethod.GET)
    @ResponseBody
    public R queryordertedailsInsert(HttpServletRequest request, HttpServletResponse response) {
        int orderId=Integer.parseInt(request.getParameter("orderId"));
        int goodsonId=Integer.parseInt(request.getParameter("goodsonId"));
        int goodsonNumber=Integer.parseInt(request.getParameter("goodsonNumber"));
        ordertedails=new Ordertedails(orderId,goodsonId,goodsonNumber);
        goodsService.queryordertedailsInsert(ordertedails);
        return R.ok("添加成功");
    }
    //购物车修改跨域
    @RequestMapping(value = "/queryShoppingUpdate", method = RequestMethod.GET)
    @ResponseBody
    public R queryShoppingUpdate(HttpServletRequest request, HttpServletResponse response) {
        int shoppingId=Integer.parseInt(request.getParameter("shoppingId"));
        int shoppingNumber=Integer.parseInt(request.getParameter("shoppingNumber"));
        int shoppingBoolean=Integer.parseInt(request.getParameter("shoppingBoolean"));
        shopping=new Shopping(shoppingId,shoppingBoolean,shoppingNumber);
        goodsService.queryShoppingUpdate(shopping);
        return R.ok("修改成功");
    }
    //订单修改跨域
    @RequestMapping(value = "/querySiteUpdate", method = RequestMethod.GET)
    @ResponseBody
    public R querySiteUpdate(HttpServletRequest request, HttpServletResponse response) {
        int siteId=Integer.parseInt(request.getParameter("siteId"));
        int siteBoolean=Integer.parseInt(request.getParameter("siteBoolean"));
        site=new Site(siteId,siteBoolean);
        goodsService.querySiteUpdate(site);
        return R.ok("修改成功");
    }
    //订单修改跨域
    @RequestMapping(value = "/queryorderBooleanUpdate", method = RequestMethod.GET)
    @ResponseBody
    public R queryorderBooleanUpdate(HttpServletRequest request, HttpServletResponse response) {
        int orderId=Integer.parseInt(request.getParameter("orderId"));
        int orderBoolean=Integer.parseInt(request.getParameter("orderBoolean"));
        order=new Order(orderId,orderBoolean);
        goodsService.queryorderBooleanUpdate(order);
        return R.ok("修改成功");
    }
    //商品删除跨域
    @RequestMapping(value = "/queryGoodsDelete", method = RequestMethod.GET)
    @ResponseBody
    public R queryGoodsDelete(HttpServletRequest request, HttpServletResponse response) {
        String goodsName = request.getParameter("goodsName");
        goodsService.queryGoodsDelete(goodsName);
        return R.ok("删除成功");
    }
    //购物车删除跨域
    @RequestMapping(value = "/queryShoppingDelete", method = RequestMethod.GET)
    @ResponseBody
    public R queryShoppingDelete(HttpServletRequest request, HttpServletResponse response) {
        int shoppingId=Integer.parseInt(request.getParameter("shoppingId"));
        goodsService.queryShoppingDelete(shoppingId);
        return R.ok("删除成功");
    }
    @RequestMapping(value = "/queryShoppingsDelete", method = RequestMethod.GET)
    @ResponseBody
    public R queryShoppingsDelete(HttpServletRequest request, HttpServletResponse response) {
        int shoppingBoolean=Integer.parseInt(request.getParameter("shoppingBoolean"));
        String customerName = request.getParameter("customerName");
        shopping=new Shopping(shoppingBoolean,customerName);
        goodsService.queryShoppingsDelete(shopping);
        return R.ok("删除成功");
    }


    //后台登录跨域
    @RequestMapping(value = "/queryEntry", method = RequestMethod.GET)
    @ResponseBody
    public R queryEntry(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        String zname = request.getParameter("zname");
        String zpwd = request.getParameter("zpwd");

        for (Entry emp : goodsService.queryEntryBy()) {
            if (emp.getZname().equals(zname)) {
                if (emp.getZpwd().equals(zpwd)) {
                    session.setAttribute("login", "OK");
                    return R.ok("用户密码正确");
                } else {
                    session.setAttribute("login", null);
                    return R.ok("密码错误");
                }
            }
        }
        return R.ok("用户不存在或为空");
    }
    //后台登录跨域
    @RequestMapping(value = "/queryCustomer", method = RequestMethod.GET)
    @ResponseBody
    public R queryCustomer(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        String customerName = request.getParameter("customerName");
        String customerPass = request.getParameter("customerPass");

        for (Customer emp : goodsService.queryCustomerBy()) {
            if (emp.getCustomerName().equals(customerName)) {
                if (emp.getCustomerPass().equals(customerPass)) {
                    session.setAttribute("login", "OK");
                    return R.ok("用户密码正确");
                } else {
                    session.setAttribute("login", null);
                    return R.ok("密码错误");
                }
            }
        }
        return R.ok("用户不存在或为空");
    }
    //管理员查询
    @RequestMapping(value = "/queryEntrys", method = RequestMethod.GET)
    @ResponseBody
    public R queryEntrys(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        return R.ok(goodsService.queryEntryBy());
    }
    //导出
    @RequestMapping(value = "/queryGoodsdaochu", method = RequestMethod.GET)
    @ResponseBody
    public void queryGoodsdaochu(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setHeader("Content-Type","application/octet-stream;charset=utf-8");
        response.setHeader("Content-Disposition","attachment;filename=goods.xlsx");
        PrintWriter out = response.getWriter();
        //加上bom头,解决excel打开乱码问题
        byte[] bomStrByteArr = new byte[] { (byte) 0xef, (byte) 0xbb, (byte) 0xbf };
        String bomStr = new String(bomStrByteArr, "UTF-8");
        out.write(bomStr);

        StringBuffer str=new StringBuffer("");
        str.append("<table border=1 width=100%>");
        str.append("<tr><th>商品编号</th><th>商品名称</th><th>商品价格</th><th>库存</th><th>图片</th></tr>");

        for (Goods goods1: goodsService.queryGoodsBy()) {

            str.append("<tr><td>"+goods1.getGoodsID()+"</td><td>"+goods1.getGoodsName()+"</td><td>"+goods1.getGoodsUnitPrice()+"</td><td>"+goods1.getSellCount()+"</td><td>"+goods1.getGoodsImg()+"</td></tr>");
        }
        str.append("</table>");
        out.write(str.toString());
    }
    //上传图片
    @RequestMapping(value="/put",method= RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest req)
            throws IllegalStateException, IOException {
        //文件存放的位置
        String path="C:\\Users\\windows10\\Documents\\HBuilderProject\\Hui-house后台\\img";
        //文件名
        String fileName = file.getOriginalFilename();
        File tarFile = new File(path, fileName);
        if (!tarFile.getParentFile().exists()) {//判断路径是否存在，不存在就创建
            tarFile.getParentFile().mkdirs();
        }
        file.transferTo(tarFile);//将文件添加到路径中
        return "{\"data\":\"封面上传成功！\"}";//返回json
    }

//    短信验证
    @RequestMapping("/SendVerificationCode")
    @ResponseBody
    public void SendVerificationCode(String phone,String code){
        System.out.println(phone);
        System.out.println(code);
        SendMessage sendMessage=new SendMessage();
        sendMessage.EX(phone,code);
    }



}
