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
public class AddressResponse implements Serializable, BaseResponseModel {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("street")
    private String street;

    @JsonProperty("building_no")
    private String buildingNo;

    @JsonProperty("city_name")
    private String cityName;
}
