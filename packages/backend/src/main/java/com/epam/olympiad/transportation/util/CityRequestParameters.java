package com.epam.olympiad.transportation.util;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CityRequestParameters implements BaseRequestParameters {

    private Boolean sortByPopulationAsc;

    private Boolean sortByPopulationDesc;

    private Boolean sortByNameAsc;

    private Boolean sortByNameDesc;

    private String name;

    private String population;
}
