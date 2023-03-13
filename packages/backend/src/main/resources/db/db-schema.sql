CREATE TABLE city (
                      id INT NOT NULL AUTO_INCREMENT,
                      name VARCHAR(255) NOT NULL,
                      blazer VARCHAR(100000),
                      population INT,
                      PRIMARY KEY (id)
);

CREATE TABLE address (
                         id INT NOT NULL AUTO_INCREMENT,
                         street_name VARCHAR(255) NOT NULL,
                         building_no VARCHAR(10) NOT NULL,
                         city_id INT NOT NULL,
                         PRIMARY KEY (id),
                         FOREIGN KEY (city_id) REFERENCES city(id)
);

CREATE TABLE route (
                       id INT NOT NULL AUTO_INCREMENT,
                       order_number INT NOT NULL,
                       workload_index INT,
                       usage_index INT,
                       address_id INT NOT NULL,
                       PRIMARY KEY (id),
                       FOREIGN KEY (address_id) REFERENCES address(id)
);
