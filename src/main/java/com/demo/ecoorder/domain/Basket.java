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
}
