package com.epam.olympiad.transportation.controller;

import com.epam.olympiad.transportation.model.RouteRequest;
import com.epam.olympiad.transportation.model.RouteResponse;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Map;

@RestController
public class RouteController {

  @RequestMapping(method = RequestMethod.GET, value = "/api/routes")
  @ApiImplicitParams({
    @ApiImplicitParam(name = "start_at", value = "Filter by first stops,  only 'equals' operation is applicable", required = false, dataType = "string", paramType = "query"),
    @ApiImplicitParam(name = "end_at", value = "Filter by final stops,  only 'equals' operation is applicable", required = false, dataType = "string", paramType = "query"),
    @ApiImplicitParam(name = "workload_ind", value = "Filter by workload index,  operations 'equals', 'greater than or equals' and 'less than or equals' are applicable.", required = false, dataType = "string", paramType = "query"),
    @ApiImplicitParam(name = "usage_ind", value = "Filter by workload index,  operations 'equals', 'greater than or equals' and 'less than or equals' are applicable.", required = false, dataType = "string", paramType = "query"),
    @ApiImplicitParam(name = "workload_ind_order", value = "?workload_ind_order=[asc|desc] - will order the list by workload index in ascending or desceding order respectively", required = false, dataType = "string", paramType = "query"),
    @ApiImplicitParam(name = "usage_ind_order", value = "?usage_ind_order=[asc|desc] - will order the list by usage index in ascending or desceding order respectively", required = false, dataType = "string", paramType = "query")
  })
  @ApiOperation(value = "Retrieves a list of all routes from the database.")
  public ResponseEntity<Page<RouteResponse>> listRoute(@RequestBody Map<String, String> requestParameters) {
    throw new NotImplementedException();
  }

  @RequestMapping(method = RequestMethod.GET, value = "/api/routes/{id}")
  @ApiOperation("Retrieves a specific route by its unique identifier.")
  public ResponseEntity<RouteResponse> getRouteById(@PathVariable Long id) {
    throw new NotImplementedException();
  }

  @RequestMapping(method = RequestMethod.POST, value = "/api/routes")
  @ApiOperation("Creates a new route in the database.")
  public ResponseEntity<Long> createRoute(@RequestBody RouteRequest requestPayload) {
    throw new NotImplementedException();
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/api/routes/{id}")
  @ApiOperation("Updates an existing route in the database.Updates an existing route in the database.")
  public ResponseEntity<Long> updateRoute(@RequestBody RouteRequest requestPayload, @PathVariable Long id) {
    throw new NotImplementedException();
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/api/routes/{id}")
  @ApiOperation("Deletes an existing route from the database, When deleting a Route, make sure to NOT DELETE related addresses.")
  public ResponseEntity<String> deleteRoute(@PathVariable Long id) {
    throw new NotImplementedException();
  }

}
