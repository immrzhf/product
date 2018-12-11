package com.zhf.product.service;


import com.zhf.product.entity.Goods;

import java.util.List;

/**
 * Created by zhaohongfei
 * 2018/10/16 11:06
 */
public interface GoodsService {

    List<Goods> getGoodsList();

    void saveGoods(Goods goods);

    Goods getGoodsByName(String name);
}
