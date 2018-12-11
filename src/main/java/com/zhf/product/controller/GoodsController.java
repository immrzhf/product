package com.zhf.product.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhf.product.entity.Goods;
import com.zhf.product.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
public class GoodsController {

    private Logger logger = LoggerFactory.getLogger(GoodsController.class);

    @Resource
    private GoodsService goodsService;

    @RequestMapping(value = "/getGoodsList")
    public Object getGoodsList(){
        JSONObject result = new JSONObject();
        result.put("success",true);
        try{
            List<Goods> list = goodsService.getGoodsList();
            result.put("data",list);
        }catch (Exception e){
            e.printStackTrace();
            result.put("success",false);
        }
        return result;
    }

    @RequestMapping(value = "/saveGoods/{name}/{privice}")
    public Object saveGoods(@PathVariable("name") String name,
                            @PathVariable("privice") float privice){
        JSONObject result = new JSONObject();
        result.put("success",true);
        try{
            Goods goods = new Goods();
            goods.setName(name);
            goods.setPrivice(privice);
            goodsService.saveGoods(goods);
        }catch (Exception e){
            e.printStackTrace();
            result.put("success",false);
        }
        return result;
    }

    @RequestMapping(value = "/getGoodsByName/{name}")
    public Object saveGoods(@PathVariable("name") String name){
        JSONObject result = new JSONObject();
        result.put("success",true);
        try{
            Goods goods = goodsService.getGoodsByName(name);
            result.put("data",goods);
        }catch (Exception e){
            e.printStackTrace();
            result.put("success",false);
        }
        return result;
    }


}
