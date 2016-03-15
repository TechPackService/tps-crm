DELETE FROM users;

ALTER TABLE users ALTER COLUMN id RESTART WITH 1;

INSERT INTO users (id, login, password) VALUES (1, 'user1', 'password1');
INSERT INTO users (id, login, password) VALUES (2, 'user2', 'password2');
INSERT INTO users (id, login, password) VALUES (3, 'user3', 'password3');
INSERT INTO users (id, login, password) VALUES (4, 'user4', 'password4');