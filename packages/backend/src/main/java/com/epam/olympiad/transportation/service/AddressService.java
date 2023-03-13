package com.epam.olympiad.transportation.service;

import com.epam.olympiad.transportation.model.AddressRequest;
import com.epam.olympiad.transportation.model.AddressResponse;
import com.epam.olympiad.transportation.util.AddressRequestParameters;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

@Service
public class AddressService implements BaseService<AddressRequest, AddressResponse, AddressRequestParameters> {

    @Override
    public ResponseEntity<List<AddressResponse>> getList(AddressRequestParameters requestParameters) {
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<AddressResponse> listRecordByID(Long id) {
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<Long> createNewRecord(AddressRequest request) {
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<Long> updateExistingRecord(AddressRequest request, Long id) {
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
