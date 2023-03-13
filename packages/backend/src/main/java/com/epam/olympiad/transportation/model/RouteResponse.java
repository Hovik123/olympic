package com.epam.olympiad.transportation.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.LinkedList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RouteResponse implements Serializable, BaseResponseModel {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("stops")
    private LinkedList<AddressResponse> stops;

    @JsonProperty("workload_index")
    private Integer workloadIndex;

    @JsonProperty("usage_index")
    private Integer usageIndex;
}
