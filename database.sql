CREATE TABLE mytable(
   id            DATE  NOT NULL PRIMARY KEY
  ,first_name    VARCHAR(8) NOT NULL
  ,last_name     VARCHAR(6) NOT NULL
  ,date_of_birth VARCHAR(6) NOT NULL
  ,gender        VARCHAR(1) NOT NULL
  ,gpa           NUMERIC(3) NOT NULL
  ,email         VARCHAR(50) NOT NULL
);
INSERT INTO mytable(id,first_name,last_name,date_of_birth,gender,gpa,email) VALUES ('111111','John','Doe','Jan-00','M',8.8,'jdoe@example.com');
INSERT INTO mytable(id,first_name,last_name,date_of_birth,gender,gpa,email) VALUES ('111112','Jane','Smith','May-01','F',9.2,'jsmith@example.com');
INSERT INTO mytable(id,first_name,last_name,date_of_birth,gender,gpa,email) VALUES ('111113','Sarah','Thomas','Nov-00','M',7.6,'sthomas@example.com');
INSERT INTO mytable(id,first_name,last_name,date_of_birth,gender,gpa,email) VALUES ('111114','Frank','Brown','Oct-00','M',6.5,'fbrown@example.com');
INSERT INTO mytable(id,first_name,last_name,date_of_birth,gender,gpa,email) VALUES ('111115','Mike','Davis','Jan-00','F',7.5,'mdavis@example.com');
INSERT INTO mytable(id,first_name,last_name,date_of_birth,gender,gpa,email) VALUES ('111116','Jennifer','Wilson','Jan-02','M',9.8,'jwilson@example.com');
INSERT INTO mytable(id,first_name,last_name,date_of_birth,gender,gpa,email) VALUES ('111117','Jessica','Garcia','Mar-00','F',8,'jgarcia@example.com');
INSERT INTO mytable(id,first_name,last_name,date_of_birth,gender,gpa,email) VALUES ('111118','Fred','Clark','Sep-02','F',8.3,'fclark@example.com');
INSERT INTO mytable(id,first_name,last_name,date_of_birth,gender,gpa,email) VALUES ('111119','Bob','Lopez','Apr-02','F',9.1,'blopez@example.com');
use college;
alter table mytable modify email varchar(50);
alter table mytable modify first_name varchar(50);
alter table mytable modify last_name varchar(50);
alter table mytable modify gpa NUMERIC(10);