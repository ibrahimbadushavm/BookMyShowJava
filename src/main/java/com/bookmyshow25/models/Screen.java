package com.bookmyshow25.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Screen extends BaseModel {
    private String name;
    private List<SupportedFeature> features;
    private List<Seat> seats;
    private ScreenStatus screenStatus;
}
