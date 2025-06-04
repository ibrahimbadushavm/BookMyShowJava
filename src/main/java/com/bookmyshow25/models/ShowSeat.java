package com.bookmyshow25.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ShowSeat extends  BaseModel{
    private Show show;
    private Seat seat;
    private ShowSeatStatus showSeatStatus;
}
