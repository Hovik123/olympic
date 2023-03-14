package com.epam.olympiad.transportation.service;

import com.epam.olympiad.transportation.model.AddressRequest;
import com.epam.olympiad.transportation.model.AddressResponse;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AddressService implements BaseService<AddressRequest, AddressResponse> {

  @Override
  public ResponseEntity<Page<AddressResponse>> getList(Map<String, String> requestParameters) {
    throw new UnsupportedOperationException();
  }

  @Override
  public ResponseEntity<AddressResponse> listRecordByID(Long id) {
    throw new UnsupportedOperationException();
  }

  @Override
  public ResponseEntity<Long> createNewRecord(AddressRequest request) {
    throw new UnsupportedOperationException();
  }

  @Override
  public ResponseEntity<Long> updateExistingRecord(AddressRequest request, Long id) {
    throw new UnsupportedOperationException();
  }

  @Override
  public ResponseEntity<String> deleteExistingRecord(Long id) {
    throw new UnsupportedOperationException();
  }

}
