package com.epam.olympiad.transportation.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Service
public class CsvService {

    public ResponseEntity<String> uploadCSVData(MultipartFile file, String type) {
        //TODO: finish the endpoint implementation
        throw new NotImplementedException();
    }

    public ResponseEntity<byte[]> exportCsvData(@PathVariable String type) {
        //TODO: finish the endpoint implementation
        throw new NotImplementedException();
    }
}
