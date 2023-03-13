package com.epam.olympiad.transportation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@RestController
@RequestMapping("/api/csv")
public class CsvController {


    @RequestMapping(method = RequestMethod.POST, value = "/upload/{type}")
    public ResponseEntity<String> uploadCSVData(@RequestParam("file") MultipartFile file, @PathVariable String type) {
        //TODO: finish the endpoint implementation
        throw new NotImplementedException();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/upload/{type}")
    public ResponseEntity<String> exportCsvData(@PathVariable String type) {
        //TODO: finish the endpoint implementation
        throw new NotImplementedException();
    }
}
