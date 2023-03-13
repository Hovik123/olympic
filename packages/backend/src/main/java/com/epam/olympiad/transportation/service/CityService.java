package com.epam.olympiad.transportation.service;

import com.epam.olympiad.transportation.model.CityRequest;
import com.epam.olympiad.transportation.model.CityResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Map;

@Service
public class CityService implements BaseService<CityRequest, CityResponse> {
    @Override
    public ResponseEntity<List<CityResponse>> getList(Map<String, String> requestParameters) {
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<CityResponse> listRecordByID(Long id) {
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<Long> createNewRecord(CityRequest request) {
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<Long> updateExistingRecord(CityRequest request, Long id) {
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<String> deleteExistingRecord(Long id) {
        throw new NotImplementedException();
    }

}
