DROP TABLE IF EXISTS ticket;
DROP TABLE IF EXISTS account;
DROP TABLE IF EXISTS session;
DROP TABLE IF EXISTS hall;

CREATE TABLE account (
    id SERIAL PRIMARY KEY,
    username VARCHAR NOT NULL,
    email VARCHAR NOT NULL UNIQUE,
    phone VARCHAR NOT NULL UNIQUE
);

CREATE TABLE hall (
    id SERIAL PRIMARY KEY,
    row INT NOT NULL,
    cell INT NOT NULL
);
INSERT INTO hall(id, row, cell)
VALUES(1, 5, 10),
      (2, 20, 30);

CREATE TABLE session (
    id SERIAL PRIMARY KEY,
    name VARCHAR NOT NULL,
    time TIMESTAMP NOT NULL,
    hall_id INT NOT NULL REFERENCES hall(id)
);
INSERT INTO session(id, name, time, hall_id)
VALUES(1, 'The Forever Purge', '2021-06-04 20:00:00', 1),
      (2, 'Ci sha xiao shuo jia', '2051-06-04 22:00:00', 1),
      (3, 'Somos Calentura: We Are The Heat', '2051-06-04 19:30:00', 2);

CREATE TABLE ticket (
    id SERIAL PRIMARY KEY,
    session_id INT NOT NULL REFERENCES session(id),
    row INT NOT NULL,
    cell INT NOT NULL,
    account_id INT NOT NULL REFERENCES account(id),
    CONSTRAINT "unique_ticket" UNIQUE (session_id, row, cell)
);