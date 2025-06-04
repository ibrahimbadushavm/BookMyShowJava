package com.bookmyshow25.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Show extends BaseModel{
    private String name;
    private Date startTime;
    private Date endTime;
    private Screen screen;
    private Movie movie;
    List<SupportedFeature> features;
}
