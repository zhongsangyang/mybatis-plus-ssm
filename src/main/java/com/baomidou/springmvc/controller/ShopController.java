package com.baomidou.springmvc.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.springmvc.model.system.Shop;
import com.baomidou.springmvc.service.system.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 系统商品表 前端控制器
 * </p>
 *
 * @author zsy带你飞123
 * @since 2018-03-10
 */
@Controller
@RequestMapping("/test/shop")
public class ShopController {
    @Autowired
    private ShopService shopService;
    @RequestMapping("/findById")
    @ResponseBody
    public String byId(){
        Shop shop=shopService.selectById(1l);
        System.out.println(shop);
        return "ok";
    }
    @RequestMapping("/shopList")
    @ResponseBody
    public Page testFenye(Page page){
        Page<Shop> pageList=null;
        if(page!=null){
            pageList=shopService.selectShopList(new Page<Shop>(page.getCurrent(),10),"水果");

        }else{
            pageList=shopService.selectShopList(new Page<Shop>(1,10),"水果");

        }
        System.out.println(pageList);
        return pageList;
    }
    @RequestMapping("/bootstrapPage")
    public String toBootstrapPage(){

        return  "bootStrapPage";
    }
}

