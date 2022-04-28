CREATE DATABASE IF NOT EXISTS Demo;
USE Demo;
CREATE TABLE IF NOT EXISTS user
(
    id   INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30),
    age  INT(4),
    INDEX (name)
) engine = InnoDB;

