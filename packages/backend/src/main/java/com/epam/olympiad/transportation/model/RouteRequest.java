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
public class RouteRequest implements Serializable, BaseRequestModel {

  @JsonProperty("stops")
  private LinkedList<AddressRequest> stops;
}
