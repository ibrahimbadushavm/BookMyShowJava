package com.bookmyshow25.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User extends BaseModel{
    private String userName;
    private String email;
    private String passWord;
    private List<Booking> bookings;
}
