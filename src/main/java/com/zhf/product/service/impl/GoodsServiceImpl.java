package com.zhf.product.service.impl;

import com.zhf.product.entity.Goods;
import com.zhf.product.repository.ProductRepository;
import com.zhf.product.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaohongfei
 * 2018/10/16 11:07
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private ProductRepository productRepository;

    @Override
    public List<Goods> getGoodsList() {
        return productRepository.find();
    }

    @Override
    public void saveGoods(Goods goods) {
        productRepository.save(goods);
    }

    @Override
    public Goods getGoodsByName(String name) {
        return productRepository.getGoodsByName(name);
    }


}
