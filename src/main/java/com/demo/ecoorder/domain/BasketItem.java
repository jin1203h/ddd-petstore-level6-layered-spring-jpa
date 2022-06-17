package com.demo.ecoorder.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BasketItem {
    @Id
    @GeneratedValue
    Integer basketItemId;
    Integer basketId;
    Integer eProductId;
    String  eProductName;
    Integer eProductQty;
    Integer unitPrice;
}
