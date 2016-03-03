DELETE FROM users;

ALTER TABLE users ALTER COLUMN id RESTART WITH 1;

INSERT INTO users (id, name) VALUES (1, 'user1');
INSERT INTO users (id, name) VALUES (2, 'user2');
INSERT INTO users (id, name) VALUES (3, 'user3');
INSERT INTO users (id, name) VALUES (4, 'user4');