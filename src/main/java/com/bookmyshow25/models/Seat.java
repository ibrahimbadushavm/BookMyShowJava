package com.bookmyshow25.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat extends  BaseModel{
    private int row;
    private int col;
    private String seatNo;
    private SeatType seatType;
}
