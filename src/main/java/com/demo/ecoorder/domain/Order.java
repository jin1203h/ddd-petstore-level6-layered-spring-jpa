package com.demo.ecoorder.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="order_table")
public class Order{
    @Id
    @GeneratedValue
    Integer orderId;
    @OneToMany
    List<OrderItem> orderItem;
    String totalPrice;
    String orderStatus;

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }
    public void setOrderItem(List<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }
    public String getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
