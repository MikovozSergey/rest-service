package com.sergei.rest.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Orders {
    private Long id;
    private Integer count;
    private Timestamp orderTime;
    private Consumers consumersByConsumerId;
    private Items itemsByItemId;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Basic
    @Column(name = "order_time")
    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return Objects.equals(id, orders.id) &&
                Objects.equals(count, orders.count) &&
                Objects.equals(orderTime, orders.orderTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, count, orderTime);
    }

    @ManyToOne
    @JoinColumn(name = "consumer_id", referencedColumnName = "id", nullable = false)
    public Consumers getConsumersByConsumerId() {
        return consumersByConsumerId;
    }

    public void setConsumersByConsumerId(Consumers consumersByConsumerId) {
        this.consumersByConsumerId = consumersByConsumerId;
    }

    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "id", nullable = false)
    public Items getItemsByItemId() {
        return itemsByItemId;
    }

    public void setItemsByItemId(Items itemsByItemId) {
        this.itemsByItemId = itemsByItemId;
    }
}
