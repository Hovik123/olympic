package com.epam.olympiad.transportation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@RestController
@RequestMapping("/api/csv")
public class CsvController {


  @RequestMapping(method = RequestMethod.POST, value = "/import/")
  public ResponseEntity<String> uploadCSVData() {
    //TODO: finish the endpoint implementation
    throw new NotImplementedException();
  }
}
