DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 1) PRIMARY KEY,
  name VARCHAR(128)
);