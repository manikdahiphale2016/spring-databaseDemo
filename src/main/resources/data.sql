create table person	
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);


INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES (10001,'Manik','Pune',sysdate());

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES (10002,'Rod','Hydrabad',sysdate());

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES (10003,'Peter','France',sysdate());