package com.epam.olympiad.transportation.service;

import com.epam.olympiad.transportation.model.RouteRequest;
import com.epam.olympiad.transportation.model.RouteResponse;
import com.epam.olympiad.transportation.util.RouteRequestParameters;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

@Service
public class RouteService implements BaseService<RouteRequest, RouteResponse, RouteRequestParameters> {
    @Override
    public ResponseEntity<List<RouteResponse>> getList(RouteRequestParameters requestParameters) {
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<RouteResponse> listRecordByID(Long id) {
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<Long> createNewRecord(RouteRequest request) {
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<Long> updateExistingRecord(RouteRequest request, Long id) {
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<String> deleteExistingRecord(Long id) {
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<String> uploadCsvData(MultipartFile file) {
        throw new NotImplementedException();
    }
}
