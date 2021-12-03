DROP TABLE IF EXISTS users;

CREATE TABLE users
(
    id         int         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name       varchar(10) NOT NULL,
    created_at datetime    NOT NULL DEFAULT CURRENT_TIMESTAMP
);
