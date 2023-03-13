package com.epam.olympiad.transportation.controller;


import com.epam.olympiad.transportation.model.CityRequest;
import com.epam.olympiad.transportation.model.CityResponse;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Map;

@RestController
public class CityController {

    @RequestMapping(method = RequestMethod.GET, value = "/api/cities")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "Filter by name, operations 'equals' and 'like' are applicable.", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "population", value = "Filter by population, operations 'equals', 'greater than or equals' and 'less than or equals' are applicable.", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "name_order", value = "?name_order=[asc|desc] - will order the list by name in ascending or desceding order respectively", required = false, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "population_order", value = "?population_order=[asc|desc] - will order the list by population in asceding or desceding order respectively", required = false, dataType = "string", paramType = "query")
    })
    @ApiOperation(value = "Retrieves a list of all cities from the database.")
    public ResponseEntity<List<CityResponse>> listCities(@ApiIgnore @RequestParam Map<String, String> requestParameters) {
        throw new NotImplementedException();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/cities/{id}")
    @ApiOperation("Retrieves a specific city by its unique identifier.")
    public ResponseEntity<CityResponse> getCityById(@PathVariable Long id) {
        throw new NotImplementedException();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/cities")
    @ApiOperation("Creates a new city in the database.")
    public ResponseEntity<Long> createCity(@RequestBody CityRequest requestPayload) {
        throw new NotImplementedException();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/api/cities/{id}")
    @ApiOperation("Updates an existing city in the database.")
    public ResponseEntity<Long> updateCity(@RequestBody CityRequest requestPayload, @PathVariable Long id) {
        throw new NotImplementedException();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/api/cities/{id}")
    @ApiOperation("Deletes an existing city from the database. When deleting a city all the related Addresses and Routes should be deleted too")
    public ResponseEntity<String> deleteCity(@PathVariable Long id) {
        throw new NotImplementedException();
    }

}
