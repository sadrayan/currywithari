-- DROP TABLE IF EXISTS customer;
-- CREATE TABLE customer (
--   id int GENERATED BY DEFAULT AS IDENTITY  (START WITH 1) NOT NULL ,
--   first_name varchar(255) NOT NULL ,
--   last_name varchar(255) NOT NULL ,
--   address varchar(255) DEFAULT NULL,
--   telephone varchar (255) DEFAULT NULL,
--   PRIMARY KEY (id)
-- );
--
-- DROP TABLE IF EXISTS meal;
-- CREATE TABLE meal (
--   id integer NOT NULL,
--   customer_id integer NOT NULL,
--   date date NOT NULL,
--   quantity integer DEFAULT NULL,
--   rating integer,
--   ordered_at timestamp default now,
--   PRIMARY KEY (id)
-- );


-- INSERT INTO customer (id, first_name, last_name, address, telephone) VALUES (1, 'david', 'gilmour', 'endless river st', NULL);
-- INSERT INTO customer (id, first_name, last_name, address, telephone) VALUES (2, 'roger', 'waters', 'final cut st', NULL);
-- INSERT INTO customer (id, first_name, last_name, address, telephone) VALUES (3, 'john', 'locke', 'enlightenment st', NULL);

-- INSERT INTO meal (id, customer_id, date, quantity, rating, ordered_at) VALUES (1, 1, '2014-11-05', 1, NULL, '2014-11-01 22:27:42');
-- INSERT INTO meal (id, customer_id, date, quantity, rating, ordered_at) VALUES (2, 2, '2014-11-06', 1, NULL, '2014-11-01 22:28:02');
-- INSERT INTO meal (id, customer_id, date, quantity, rating, ordered_at) VALUES (3, 3, '2014-11-06', 1, NULL, '2014-11-01 22:28:02');
-- INSERT INTO meal (id, customer_id, date, quantity, rating, ordered_at) VALUES (4, 3, '2014-11-07', 1, NULL, '2014-11-01 22:28:02');
-- INSERT INTO meal (id, customer_id, date, quantity, rating, ordered_at) VALUES (5, 3, '2014-11-08', 1, NULL, '2014-11-01 22:28:02');


-- select * from customer;