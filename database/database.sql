CREATE DATABASE inventory_db;
CREATE DATABASE inventory_db;

USE inventory_db;

CREATE TABLE product (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    quantity INT,
    price DOUBLE
);
