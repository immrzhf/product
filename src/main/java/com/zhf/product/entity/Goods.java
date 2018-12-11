package com.zhf.product.entity;

import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@DynamicInsert(true)
@Table(name = "goods")
public class Goods {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "privice")
    private float privice;
    @Column(name = "add_time")
    private String addTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrivice() {
        return privice;
    }

    public void setPrivice(float privice) {
        this.privice = privice;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }
}
