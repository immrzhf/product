package com.zhf.product.repository;

import com.zhf.product.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Goods,Integer> {

    @Query(value = "select t from Goods  t ")
    List<Goods> find();

    @Query(value = "select t from Goods t where name = :name")
    Goods getGoodsByName(@Param("name") String name);
}
