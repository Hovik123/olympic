package com.epam.olympiad.transportation.service;

import com.epam.olympiad.transportation.model.CityResponse;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class CityServiceTest {
    private final CityService cityService = new CityService(); // create an instance of the CityService class

    // Test case for getting a list of cities with default parameters
    @Test
    void testGetListWithDefaultParameters() {
        Map<String, String> requestParameters = new HashMap<>();
        ResponseEntity<List<CityResponse>> response = cityService.getList(requestParameters);

        assertEquals(HttpStatus.OK, response.getStatusCode()); // check if the response status code is OK
        assertFalse(Objects.requireNonNull(response.getBody()).isEmpty()); // check if the list of cities is not empty
    }

    // Test case for getting a list of cities ordered by name in ascending order
    @Test
    void testGetListOrderedByNameAscending() {
        Map<String, String> requestParameters = new HashMap<>();
        requestParameters.put("name_order", "asc");
        ResponseEntity<List<CityResponse>> response = cityService.getList(requestParameters);

        assertEquals(HttpStatus.OK, response.getStatusCode()); // check if the response status code is OK
        assertFalse(Objects.requireNonNull(response.getBody()).isEmpty()); // check if the list of cities is not empty

        // check if the list is ordered by name in ascending order
        for (int i = 0; i < response.getBody().size() - 1; i++) {
            assertTrue(response.getBody().get(i).getName().compareTo(response.getBody().get(i + 1).getName()) <= 0);
        }
    }

    // Test case for getting a list of cities ordered by name in descending order
    @Test
    void testGetListOrderedByNameDescending() {
        Map<String, String> requestParameters = new HashMap<>();
        requestParameters.put("name_order", "desc");
        ResponseEntity<List<CityResponse>> response = cityService.getList(requestParameters);

        assertEquals(HttpStatus.OK, response.getStatusCode()); // check if the response status code is OK
        assertFalse(Objects.requireNonNull(response.getBody()).isEmpty()); // check if the list of cities is not empty

        // check if the list is ordered by name in descending order
        for (int i = 0; i < response.getBody().size() - 1; i++) {
            assertTrue(response.getBody().get(i).getName().compareTo(response.getBody().get(i + 1).getName()) >= 0);
        }
    }

    // Test case for getting a list of cities ordered by population in ascending order
    @Test
    void testGetListOrderedByPopulationAscending() {
        Map<String, String> requestParameters = new HashMap<>();
        requestParameters.put("population_order", "asc");
        ResponseEntity<List<CityResponse>> response = cityService.getList(requestParameters);

        assertEquals(HttpStatus.OK, response.getStatusCode()); // check if the response status code is OK
        assertFalse(Objects.requireNonNull(response.getBody()).isEmpty()); // check if the list of cities is not empty

        // check if the list is ordered by population in ascending order
        for (int i = 0; i < response.getBody().size() - 1; i++) {
            assertTrue(response.getBody().get(i).getPopulation() <= response.getBody().get(i + 1).getPopulation());
        }
    }

    // Test case for getting a list of cities ordered by population in descending order
    @Test
    void testGetListOrderedByPopulationDescending() {
        Map<String, String> requestParameters = new HashMap<>();
        requestParameters.put("population_order", "desc");
        ResponseEntity<List<CityResponse>> response = cityService.getList(requestParameters);

        assertEquals(HttpStatus.OK, response.getStatusCode()); // check if the response status code is OK
        assertFalse(Objects.requireNonNull(response.getBody()).isEmpty()); // check if the list of cities is not empty

        // check if the population values are in descending order
        Long previousPopulation = Long.MAX_VALUE;
        for (CityResponse cityResponse : response.getBody()) {
            assertTrue(cityResponse.getPopulation() <= previousPopulation);
            previousPopulation = cityResponse.getPopulation();
        }
    }


    // Test case for getting a list of cities with name filter
    @Test
    void testGetListWithNameFilter() {
        Map<String, String> requestParameters = new HashMap<>();
        requestParameters.put("name", "Yerevan");
        ResponseEntity<List<CityResponse>> response = cityService.getList(requestParameters);

        assertEquals(HttpStatus.OK, response.getStatusCode()); // check if the response status code is OK
        assertFalse(Objects.requireNonNull(response.getBody()).isEmpty()); // check if the list of cities is not empty

        // check if all cities in the response have the name "Yerevan"
        for (CityResponse cityResponse : response.getBody()) {
            assertEquals("Yerevan", cityResponse.getName());
        }
    }

    // Test case for getting a list of cities with name filter using wildcard at the beginning
    @Test
    void testGetListWithNameFilterStartingWith() {
        Map<String, String> requestParameters = new HashMap<>();
        requestParameters.put("name", "Yer*");
        ResponseEntity<List<CityResponse>> response = cityService.getList(requestParameters);

        assertEquals(HttpStatus.OK, response.getStatusCode()); // check if the response status code is OK
        assertFalse(Objects.requireNonNull(response.getBody()).isEmpty()); // check if the list of cities is not empty

        // check if all cities in the response have names that start with "Yer"
        for (CityResponse cityResponse : response.getBody()) {
            assertTrue(cityResponse.getName().startsWith("Yer"));
        }
    }

    // Test case for getting a list of cities with name filter using wildcard at the end
    @Test
    void testGetListWithNameFilterEndingWith() {
        Map<String, String> requestParameters = new HashMap<>();
        requestParameters.put("name", "*van");
        ResponseEntity<List<CityResponse>> response = cityService.getList(requestParameters);

        assertEquals(HttpStatus.OK, response.getStatusCode()); // check if the response status code is OK
        assertFalse(Objects.requireNonNull(response.getBody()).isEmpty()); // check if the list of cities is not empty

        // check if all cities in the response have names that end with "van"
        for (CityResponse cityResponse : response.getBody()) {
            assertTrue(cityResponse.getName().endsWith("van"));
        }
    }

    // Test case for getting a list of cities with name filter using wildcard in the middle
    @Test
    void testGetListWithNameFilterContaining() {
        Map<String, String> requestParameters = new HashMap<>();
        requestParameters.put("name", "*rev*");
        ResponseEntity<List<CityResponse>> response = cityService.getList(requestParameters);

        assertEquals(HttpStatus.OK, response.getStatusCode()); // check if the response status code is OK
        assertFalse(Objects.requireNonNull(response.getBody()).isEmpty()); // check if the list of cities is not empty

        // check if all cities in the response have names that contain the string "rev"
        for (CityResponse cityResponse : response.getBody()) {
            assertTrue(cityResponse.getName().contains("rev"));
        }
    }

    // Test case for getting a list of cities with population filter
    @Test
    void testGetListWithPopulationFilter() {
        Map<String, String> requestParameters = new HashMap<>();
        requestParameters.put("population", "1000");
        ResponseEntity<List<CityResponse>> response = cityService.getList(requestParameters);

        assertEquals(HttpStatus.OK, response.getStatusCode()); // check if the response status code is OK
        assertFalse(Objects.requireNonNull(response.getBody()).isEmpty()); // check if the list of cities is not empty

        // check if all cities in the response have a population of 1000
        for (CityResponse cityResponse : response.getBody()) {
            assertEquals(1000L, cityResponse.getPopulation());
        }
    }
}