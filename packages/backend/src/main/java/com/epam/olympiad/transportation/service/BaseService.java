package com.epam.olympiad.transportation.service;

import com.epam.olympiad.transportation.model.BaseRequestModel;
import com.epam.olympiad.transportation.model.BaseResponseModel;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface BaseService<R extends BaseRequestModel, A extends BaseResponseModel> {

  ResponseEntity<Page<A>> getList(Map<String, String> requestParameters);

  ResponseEntity<A> listRecordByID(Long id);

  ResponseEntity<Long> createNewRecord(R request);

  ResponseEntity<Long> updateExistingRecord(R request, Long id);

  ResponseEntity<String> deleteExistingRecord(Long id);

}
