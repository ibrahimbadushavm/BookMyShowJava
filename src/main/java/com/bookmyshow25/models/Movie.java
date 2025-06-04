package com.bookmyshow25.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Movie extends  BaseModel{
    private String name;
    private Date relaseDate;
    private List<SupportedFeature> featureList;
}
