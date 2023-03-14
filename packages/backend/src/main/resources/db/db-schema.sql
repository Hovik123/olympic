DROP TABLE IF EXISTS route;
DROP TABLE IF EXISTS address;
CREATE TABLE address (
                         id INT NOT NULL AUTO_INCREMENT,
                         street_name VARCHAR(255) NOT NULL,
                         building_no VARCHAR(10) NOT NULL,
                         city_name VARCHAR(100) NOT NULL,
                         PRIMARY KEY (id)
);

CREATE TABLE route (
                       id INT NOT NULL AUTO_INCREMENT,
                       route_id INT NOT NULL,
                       order_number INT NOT NULL,
                       workload_index INT,
                       usage_index INT,
                       start_date INT(11),
                       end_date INT(11),
                       address_id INT NOT NULL,
                       PRIMARY KEY (id),
                       FOREIGN KEY (address_id) REFERENCES address(id)
);
