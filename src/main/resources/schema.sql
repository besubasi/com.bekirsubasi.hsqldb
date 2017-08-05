
DROP TABLE student IF EXISTS;
DROP TABLE city IF EXISTS;
DROP TABLE district IF EXISTS;



CREATE TABLE student (
  student_id INTEGER PRIMARY KEY,
  name VARCHAR(30)  NOT  NULL,
  surname  VARCHAR(50)  NOT  NULL,
  mobile_phone VARCHAR(11)  NOT  NULL,
  city_id INTEGER  NOT  NULL,
  district_id INTEGER  NOT  NULL,
  description VARCHAR (1000)
);

CREATE TABLE city (
  city_id INTEGER PRIMARY KEY,
  name VARCHAR(30)  NOT  NULL
);

CREATE TABLE district (
  district_id INTEGER PRIMARY KEY,
  city_id INTEGER NOT  NULL ,
  name VARCHAR(30)  NOT  NULL
);



