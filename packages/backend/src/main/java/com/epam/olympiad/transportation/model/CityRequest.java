package com.epam.olympiad.transportation.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CityRequest implements Serializable, BaseRequestModel {

    @JsonProperty("name")
    private String name;

    @JsonProperty("blazor")
    private String blazor;

    @JsonProperty("population")
    private Long population;


}
