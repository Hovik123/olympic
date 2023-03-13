package com.epam.olympiad.transportation.service;

import com.epam.olympiad.transportation.model.CityRequest;
import com.epam.olympiad.transportation.model.CityResponse;
import com.epam.olympiad.transportation.util.CityRequestParameters;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

@Service
public class CityService implements BaseService<CityRequest, CityResponse, CityRequestParameters> {
    @Override
    public ResponseEntity<List<CityResponse>> getList(CityRequestParameters requestParameters) {
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

    @Override
    public ResponseEntity<String> uploadCsvData(MultipartFile file) {
        throw new NotImplementedException();
    }
}
