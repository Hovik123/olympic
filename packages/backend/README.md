# Build instructions: 

1. run "mvn clean install" to build the project
2. run "docker build --tag=olympiad-app:latest ." to build the docker image 
3. run "docker run -p8080:8080 olympiad-app:latest" command to start the docker image. 
4. Swagger can be accessible via link: "http://localhost:8080/swagger-ui/index.html"

# Project requirements and description 

## Description

The transportation services interacts with 3 different models: 
1. City: Represents City resource, contains information such as name, blazor (a file URL that can be displayed in the UI), population count.
2. Address: Represents certain addresses in the City, contains information such as city name, street name, building number.
3. Route: Represents a certain route to reach from Address A to Address B, contains information such us the stops, workload and usage indicator.

The base URL for the API is `/api`
## Cities API

1. `GET /cities` Retrieves a list of all cities in the database.
   1. Supports ordering by name and population
   2. Supports filtering by: 
      1. Name: operations 'equals' and 'like' are applicable. 
         _example:_ 
      
                    GET /cities?name=Yerevan - will find all the cities where name EQUALS Yerevan
                    GET /cities?name=Yer* - will fnd all the cities that STARTS WITH 'Yer' 
                    GET /cities?name=*van -  will fnd all the cities that ENDS WITH 'van'
                    GET /cities?name=*rev* -  will fnd all the cities that CONTAINS 'rev'
      2. Population: operation 'equals', 'greater than or equals' and 'less than or equals' are applicable. 
         _example:_
      
                     GET /cities?population=1000 - will find all the cities, where population EQUALS to 1000
                     GET /cities?population>=1000 - will find all the cities, where population GREATER THAN OR EQUALS to 1000
                     GET /cities?population<=100 - will find all the cities, where population LESS THAN OR EQUALS to 1000
2. `GET /cities/{id}` Retrieves a specific city by its unique identifier.
3. `POST /cities` Creates a new city in the database.
4. `PUT /cities/{id}` Updates an existing city in the database.
5. `DELETE /cities/{id}` Deletes an existing city from the database. When deleting a city all the related Addresses and Routes should be deleted too

_Note: all the filters can be applied in combination with others using '&' (AND) and '|' (OR) symbols._

## Addresses API

1. `GET /addresses` Retrieves a list of all addresses in the database. 
   1. Supports ordering by street and city name. 
   2. Supports filtering by: 
      1. Street: operations 'equals' and 'like' are applicable
         _example:_
      
                     GET /addresses?street=Teryan - will find all the addresses where street EQUALS to 'Teryan'
                     GET /addresses?street=Ter* - will find all the addresses where street STARTS WITH to 'Ter'
                     GET /addresses?street=*yan - will find all the addresses where street ENDS WITHS to 'yan'
                     GET /addresses?street=*ery* - will find all the addresses where street CONTAINS to 'ery'
      2. Building Number: only 'equals' operation is applicable
         _example:_
      
                     GET /addresses?building_no=10 - will find all the addresses where building number EQUALS to 10
      3. City name: operations 'equals' and 'like' are applicable
         _example:_
      
                     GET /addresses?city_name=Yerevan - will find all the addresses for which city name EQUALS Yerevan
                     GET /addresses?city_name=Yer* - will fnd all the find all the addresses for which city name STARTS WITH 'Yer'
                     GET /addresses?city_name=*van -  will fnd all the addresses for which city name ENDS WITH 'van'
                     GET /addresses?city_name=*rev* -  will find all the addresses for which city name CONTAINS 'rev'
2. `GET /addresses/{id}` Retrieves a specific address by its unique identifier.
3. `POST /addresses` Creates a new address in the database.
4. `PUT /addresses/{id}` Updates an existing address in the database.
5. `DELETE /addresses/{id}` Deletes an existing address from the database.When deleting an Address all the related Routes should be deleted too


## Routes API
1. `GET /routes` Retrieves a list of all routes in the database.
   1. Supports ordering by workload and usage index.
   2. Supports filtering by:
      1. Combination of first and final stops:
         _example:_
            
                     GET /routes?sartAt=[addressID]&endAt=[addressID] - will return all the possible routes from start address to end address.
      2. Final stop: 
         _example:_
               
                     GET /routes?endAt=[addressID] - will return all the possible routes that end at the given address. 
   
2. `GET /routes/{id}` Retrieves a specific route by its unique identifier.
3. `POST /routes` Creates a new route in the database.
4. `PUT /routes/{id}` Updates an existing route in the database.
5. `DELETE /routes/{id}` Deletes an existing route from the database, When deleting a Route, make sure to NOT DELETE related addresses. 
6. 

## CSV API