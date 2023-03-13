package com.epam.olympiad.transportation.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class AddressRequestParameters implements Serializable, BaseRequestParameters {

    @JsonProperty("street_asc")
    private Boolean sortByStreetAsc;

    @JsonProperty("street_desc")
    private Boolean sortByStreetDesc;

    @JsonProperty("city_name_asc")
    private Boolean sortByCityNameAsc;

    @JsonProperty("city_name_desc")
    private Boolean sortByCityNameDesc;

    @JsonProperty("street")
    private String street;

    @JsonProperty("building_no")
    private String buildingNo;

    @JsonProperty("city_name")
    private String cityName;

}
