package com.epam.olympiad.transportation.service;

import com.epam.olympiad.transportation.model.RouteRequest;
import com.epam.olympiad.transportation.model.RouteResponse;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RouteService implements BaseService<RouteRequest, RouteResponse> {
  @Override
  public ResponseEntity<Page<RouteResponse>> getList(Map<String, String> requestParameters) {
    throw new UnsupportedOperationException();
  }

  @Override
  public ResponseEntity<RouteResponse> listRecordByID(Long id) {
    throw new UnsupportedOperationException();
  }

  @Override
  public ResponseEntity<Long> createNewRecord(RouteRequest request) {
    throw new UnsupportedOperationException();
  }

  @Override
  public ResponseEntity<Long> updateExistingRecord(RouteRequest request, Long id) {
    throw new UnsupportedOperationException();
  }

  @Override
  public ResponseEntity<String> deleteExistingRecord(Long id) {
    throw new UnsupportedOperationException();
  }

}
