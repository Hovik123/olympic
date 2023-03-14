-- Insert 15 random addresses into the "address" table
INSERT INTO address (street_name, building_no, city_name) VALUES
                                                            ('Main Street', '1A', 'New York'),
                                                            ('Broadway', '25', 'Los Angeles'),
                                                            ('Park Avenue', '100', 'San Francisco'),
                                                            ('King Street', '12B', 'Chicago'),
                                                            ('Elm Street', '2C', 'Boston'),
                                                            ('First Street', '3', 'Seattle'),
                                                            ('Main Boulevard', '15', 'Houston'),
                                                            ('Central Street', '8', 'Dallas'),
                                                            ('Washington Street', '100', 'Miami'),
                                                            ('Pine Street', '22', 'Denver'),
                                                            ('Sunset Boulevard', '10', 'Las Vegas'),
                                                            ('Garden Street', '5', 'Atlanta'),
                                                            ('Maple Avenue', '40', 'Philadelphia'),
                                                            ('Ocean Drive', '17', 'San Diego'),
                                                            ('Market Street', '7', 'Washington DC');

-- Insert 5 routes with 6-10 addresses each
INSERT INTO route (route_id, order_number, workload_index, usage_index, start_date, end_date, address_id) VALUES
                                                                                                            -- Route 1
                                                                                                            (1, 1, 60, 80, UNIX_TIMESTAMP('2023-03-15'), UNIX_TIMESTAMP('2023-03-17'), 1),
                                                                                                            (1, 2, 40, 60, UNIX_TIMESTAMP('2023-03-18'), UNIX_TIMESTAMP('2023-03-20'), 3),
                                                                                                            (1, 3, 20, 40, UNIX_TIMESTAMP('2023-03-21'), UNIX_TIMESTAMP('2023-03-23'), 5),
                                                                                                            (1, 4, 80, 90, UNIX_TIMESTAMP('2023-03-24'), UNIX_TIMESTAMP('2023-03-26'), 6),
                                                                                                            (1, 5, 70, 70, UNIX_TIMESTAMP('2023-03-27'), UNIX_TIMESTAMP('202-03-29'), 10),
                                                                                                            (1, 6, 50, 50, UNIX_TIMESTAMP('2023-03-30'), UNIX_TIMESTAMP('2023-04-01'), 12),
                                                                                                            -- Route 2
                                                                                                            (2, 1, 30, 50, UNIX_TIMESTAMP('2023-03-15'), UNIX_TIMESTAMP('2023-03-17'), 2),
                                                                                                            (2, 2, 40, 70, UNIX_TIMESTAMP('2023-03-18'), UNIX_TIMESTAMP('2023-03-20'), 4),
                                                                                                            (2, 3, 90, 90, UNIX_TIMESTAMP('2023-03-21'), UNIX_TIMESTAMP('2023-03-23'), 6),
                                                                                                            (2, 4, 60, 80, UNIX_TIMESTAMP('2023-03-24'), UNIX_TIMESTAMP('2023-03-26'), 8),
                                                                                                            (2, 5, 50, 60, UNIX_TIMESTAMP('2023-03-27'), UNIX_TIMESTAMP('2023-03-29'), 12),
                                                                                                            (2, 6, 70, 70, UNIX_TIMESTAMP('2023-03-30'), UNIX_TIMESTAMP('2023-04-01'), 14),
                                                                                                            (2, 7, 30, 40, UNIX_TIMESTAMP('2023-04-02'), UNIX_TIMESTAMP('2023-04-04'), 1),

-- Route 3
                                                                                                            (3, 1, 50, 60, UNIX_TIMESTAMP('2023-03-15'), UNIX_TIMESTAMP('2023-03-17'), 3),
                                                                                                            (3, 2, 30, 50, UNIX_TIMESTAMP('2023-03-18'), UNIX_TIMESTAMP('2023-03-20'), 5),
                                                                                                            (3, 3, 80, 80, UNIX_TIMESTAMP('2023-03-21'), UNIX_TIMESTAMP('2023-03-23'), 7),
                                                                                                            (3, 4, 60, 70, UNIX_TIMESTAMP('2023-03-24'), UNIX_TIMESTAMP('2023-03-26'), 9),
                                                                                                            (3, 5, 50, 60, UNIX_TIMESTAMP('2023-03-27'), UNIX_TIMESTAMP('2023-03-29'), 11),
                                                                                                            (3, 6, 70, 70, UNIX_TIMESTAMP('2023-03-30'), UNIX_TIMESTAMP('2023-04-01'), 13),

-- Route 4
                                                                                                            (4, 1, 40, 60, UNIX_TIMESTAMP('2023-03-15'), UNIX_TIMESTAMP('2023-03-17'), 4),
                                                                                                            (4, 2, 60, 80, UNIX_TIMESTAMP('2023-03-18'), UNIX_TIMESTAMP('2023-03-20'), 6),
                                                                                                            (4, 3, 70, 70, UNIX_TIMESTAMP('2023-03-21'), UNIX_TIMESTAMP('2023-03-23'), 8),
                                                                                                            (4, 4, 50, 50, UNIX_TIMESTAMP('2023-03-24'), UNIX_TIMESTAMP('2023-03-26'), 10),
                                                                                                            (4, 5, 30, 40, UNIX_TIMESTAMP('2023-03-27'), UNIX_TIMESTAMP('2023-03-29'), 12),
                                                                                                            (4, 6, 20, 30, UNIX_TIMESTAMP('2023-03-30'), UNIX_TIMESTAMP('2023-04-01'), 14),
                                                                                                            (4, 7, 60, 80, UNIX_TIMESTAMP('2023-04-02'), UNIX_TIMESTAMP('2023-04-04'), 15),
-- Route 5
                                                                                                            (5, 1, 70, 90, UNIX_TIMESTAMP('2023-04-01'), UNIX_TIMESTAMP('2023-04-03'), 3),
                                                                                                            (5, 2, 30, 50, UNIX_TIMESTAMP('2023-04-04'), UNIX_TIMESTAMP('2023-04-06'), 6),
                                                                                                            (5, 3, 50, 70, UNIX_TIMESTAMP('2023-04-07'), UNIX_TIMESTAMP('2023-04-09'), 8),
                                                                                                            (5, 4, 20, 30, UNIX_TIMESTAMP('2023-04-10'), UNIX_TIMESTAMP('2023-04-12'), 12),
                                                                                                            (5, 5, 60, 80, UNIX_TIMESTAMP('2023-04-13'), UNIX_TIMESTAMP('2023-04-15'), 15),

-- Route 6
                                                                                                            (6, 1, 60, 80, UNIX_TIMESTAMP('2023-04-01'), UNIX_TIMESTAMP('2023-04-03'), 1),
                                                                                                            (6, 2, 40, 60, UNIX_TIMESTAMP('2023-04-04'), UNIX_TIMESTAMP('2023-04-06'), 4),
                                                                                                            (6, 3, 80, 90, UNIX_TIMESTAMP('2023-04-07'), UNIX_TIMESTAMP('2023-04-09'), 7),
                                                                                                            (6, 4, 70, 70, UNIX_TIMESTAMP('2023-04-10'), UNIX_TIMESTAMP('2023-04-12'), 10),
                                                                                                            (6, 5, 30, 40, UNIX_TIMESTAMP('2023-04-13'), UNIX_TIMESTAMP('2023-04-15'), 13),
                                                                                                            (6, 6, 20, 30, UNIX_TIMESTAMP('2023-04-16'), UNIX_TIMESTAMP('2023-04-18'), 15),

-- Route 7
                                                                                                            (7, 1, 40, 60, UNIX_TIMESTAMP('2023-04-01'), UNIX_TIMESTAMP('2023-04-03'), 2),
                                                                                                            (7, 2, 60, 80, UNIX_TIMESTAMP('2023-04-04'), UNIX_TIMESTAMP('2023-04-06'), 5),
                                                                                                            (7, 3, 70, 70, UNIX_TIMESTAMP('2023-04-07'), UNIX_TIMESTAMP('2023-04-09'), 8),
                                                                                                            (7, 4, 50, 50, UNIX_TIMESTAMP('2023-04-10'), UNIX_TIMESTAMP('2023-04-12'), 11),
                                                                                                            (7, 5, 30, 40, UNIX_TIMESTAMP('2023-04-13'), UNIX_TIMESTAMP('2023-04-15'), 14),
                                                                                                            (7, 6, 60, 80, UNIX_TIMESTAMP('2023-04-16'), UNIX_TIMESTAMP('2023-04-18'), 15);
