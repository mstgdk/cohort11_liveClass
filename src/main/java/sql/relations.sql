create TABLE department(
id serial PRIMARY KEY,
	name VARCHAR(20),
	location VARCHAR(20)
);

create TABLE developer(
id serial PRIMARY KEY,
	dev_name VARCHAR(20),
	age integer,
	department_id integer REFERENCES department(id)
);
select * from department;
select * from developer;

insert into department (name,location) values ('HR','istanbul');
insert into department (name,location) values ('IT','istanbul');
insert into department (name,location) values ('AB','istanbul');

insert into developer (dev_name,age,department_id) values ('mesut',20,1);
insert into developer (dev_name,age,department_id) values ('kerem',20,2);
insert into developer (dev_name,age,department_id) values ('erdem',20,3);
insert into developer (dev_name,age,department_id) values ('ali',20,3);
insert into developer (dev_name,age,department_id) values ('ayşe',20,1) , ('ali',20,3);

--drop 1
drop table department;
drop table developer;

--2
drop table department cascade;

create TABLE department2(
id serial PRIMARY KEY,
	name VARCHAR(20),
	location VARCHAR(20)
);

create TABLE developer2(
id serial PRIMARY KEY,
	dev_name VARCHAR(20),
	age integer,
	department_id integer REFERENCES department2(id) on delete set null
);

drop table department2 CASCADE;
drop table developer2;
insert into department2 (name,location) values ('HR','istanbul');
insert into department2 (name,location) values ('IT','istanbul');
insert into department2 (name,location) values ('AB','istanbul');

insert into developer2 (dev_name,age,department_id) values ('mesut',20,1);
insert into developer2 (dev_name,age,department_id) values ('kerem',20,2);
insert into developer2 (dev_name,age,department_id) values ('erdem',20,3);
insert into developer2 (dev_name,age,department_id) values ('ali',20,3);
insert into developer2 (dev_name,age,department_id) values ('ayşe',20,1) , ('ali',20,3);

delete from department2 where id =2





