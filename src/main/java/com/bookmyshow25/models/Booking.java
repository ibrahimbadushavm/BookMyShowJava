package com.bookmyshow25.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Booking extends BaseModel {
    private User user;
    private String bookingNumber;
    private List<ShowSeat> showSeats;
    List<Payment> payments;
    private BookingStatus bookingStatus;
    private double amount;
}
