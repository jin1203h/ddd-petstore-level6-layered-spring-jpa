package com.demo.ecoorder.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Basket {
    @Id
    @GeneratedValue
    Integer basketId;
    @OneToMany
    List<BasketItem> basketItem;
    Integer totalPrice;
    public List<BasketItem> getBasketItem() {
        return basketItem;
    }
    public void setBasketItem(List<BasketItem> basketItem) {
        this.basketItem = basketItem;
    }
    public Integer getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
    
}
