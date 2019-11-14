package com.sergei.rest.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class OrdersDto implements Serializable {
    private Long id;
    private Integer count;
    private Timestamp orderTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }
}
