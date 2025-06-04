package com.bookmyshow25.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment extends BaseModel {

    private double amount;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private PaymentProvider paymentProvider;

    private String referenceNumber;

}
