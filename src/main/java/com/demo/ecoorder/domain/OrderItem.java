package com.demo.ecoorder.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue
    Integer    OrderItemId;
    Integer    orderId;
    Integer    eProductId;
    String     eProductName;
    Integer    eProductQty;
    Integer    unitPrice;
    
    public Integer getOrderId() {
        return orderId;
    }
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public Integer geteProductId() {
        return eProductId;
    }
    public void seteProductId(Integer eProductId) {
        this.eProductId = eProductId;
    }
    public String geteProductName() {
        return eProductName;
    }
    public void seteProductName(String eProductName) {
        this.eProductName = eProductName;
    }
    public Integer geteProductQty() {
        return eProductQty;
    }
    public void seteProductQty(Integer eProductQty) {
        this.eProductQty = eProductQty;
    }
    public Integer getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }
}
