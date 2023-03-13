package com.epam.olympiad.transportation.service;

import com.epam.olympiad.transportation.model.BaseRequestModel;
import com.epam.olympiad.transportation.model.BaseResponseModel;
import com.epam.olympiad.transportation.util.BaseRequestParameters;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface BaseService<R extends BaseRequestModel, A extends BaseResponseModel, T extends BaseRequestParameters> {

    ResponseEntity<List<A>> getList(T requestParameters);

    ResponseEntity<A> listRecordByID(Long id);

    ResponseEntity<Long> createNewRecord(R request);

    ResponseEntity<Long> updateExistingRecord(R request, Long id);

    ResponseEntity<String> deleteExistingRecord(Long id);

    ResponseEntity<String> uploadCsvData(MultipartFile file);
}
