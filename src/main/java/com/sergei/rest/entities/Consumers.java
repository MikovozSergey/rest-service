package com.sergei.rest.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Consumers {
    private Long id;
    private String name;
    private String phone;
    private String address;
    private Collection<Orders> ordersById;

    @Id
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
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consumers consumers = (Consumers) o;
        return Objects.equals(id, consumers.id) &&
                Objects.equals(name, consumers.name) &&
                Objects.equals(phone, consumers.phone) &&
                Objects.equals(address, consumers.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone, address);
    }

    @OneToMany(mappedBy = "consumersByConsumerId")
    public Collection<Orders> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<Orders> ordersById) {
        this.ordersById = ordersById;
    }
}
