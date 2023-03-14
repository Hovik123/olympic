package com.epam.olympiad.transportation.controller;


import com.epam.olympiad.transportation.model.AddressRequest;
import com.epam.olympiad.transportation.model.AddressResponse;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;


import java.util.Map;

@RestController
@RequestMapping("/api")
public class AddressController {

  @RequestMapping(method = RequestMethod.GET, value = "/addresses")
  @ApiImplicitParams({
    @ApiImplicitParam(name = "street", value = "Filter by street name, operations 'equals' and 'like' are applicable", required = false, dataType = "string", paramType = "query"),
    @ApiImplicitParam(name = "building_no", value = "Filter by building number: only 'equals' operation is applicable", required = false, dataType = "string", paramType = "query"),
    @ApiImplicitParam(name = "city_name", value = "Filter by city name: operations 'equals' and 'like' are applicable", required = false, dataType = "string", paramType = "query"),
    @ApiImplicitParam(name = "city_name_order", value = "?city_name_order=[asc|desc] - will order the list by city name in ascending or descending order respectively", required = false, dataType = "string", paramType = "query"),
    @ApiImplicitParam(name = "street_order", value = "street_order=[asc|desc] - will order the list by street in ascending or descending order respectively", required = false, dataType = "string", paramType = "query")
  })
  @ApiOperation(value = "Retrieves a list of all addresses from the database.")
  public ResponseEntity<Page<AddressResponse>> getAddressList(@ApiIgnore @RequestParam(required = false) Map<String, String> requestParams) {
    //TODO: finish the endpoint implementation
    throw new UnsupportedOperationException();
  }

  @RequestMapping(method = RequestMethod.GET, value = "/addresses/{id}")
  @ApiOperation(value = "Retrieve a specific address from the database by its ID.")
  public ResponseEntity<AddressResponse> getAddressById(@PathVariable Long id) {
    //TODO: finish the endpoint implementation
    throw new UnsupportedOperationException();
  }

  @RequestMapping(method = RequestMethod.POST, value = "/addresses")
  @ApiOperation(value = "Create new address record.")
  public ResponseEntity<Long> createNewAddress(@RequestBody AddressRequest requestPayload) {
    //TODO: finish the endpoint implementation
    throw new UnsupportedOperationException();
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/addresses/{id}")
  @ApiOperation(value = "Update an existing address record by its ID. ")
  public ResponseEntity<Long> updateAddress(@RequestBody AddressRequest requestPayload,
                                            @PathVariable Long id) {
    //TODO: finish the endpoint implementation
    throw new UnsupportedOperationException();
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/addresses/{id}")
  @ApiOperation(value = "Delete existing address record by its ID. Note that in related route records should be deleted, too. ")
  public ResponseEntity<String> updateAddress(@PathVariable Long id) {
    //TODO: finish the endpoint implementation
    throw new UnsupportedOperationException();
  }

}
