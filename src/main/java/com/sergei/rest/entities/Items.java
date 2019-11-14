package com.sergei.rest.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Items {
    private Long id;
    private String name;
    private Integer cost;
    private Collection<Orders> ordersById;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "cost")
    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items items = (Items) o;
        return Objects.equals(id, items.id) &&
                Objects.equals(name, items.name) &&
                Objects.equals(cost, items.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cost);
    }

    @OneToMany(mappedBy = "itemsByItemId")
    public Collection<Orders> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<Orders> ordersById) {
        this.ordersById = ordersById;
    }
}
