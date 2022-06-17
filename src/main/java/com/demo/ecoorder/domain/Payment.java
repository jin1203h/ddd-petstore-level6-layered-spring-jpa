package com.demo.ecoorder.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Payment {
    @Id
    @GeneratedValue
    Integer paymentId;
    Integer orderId;
    String  paymentKind;
    String  paymentMethod;
    String  paymentStatus;
    Integer amount;
    Date    date;
}
