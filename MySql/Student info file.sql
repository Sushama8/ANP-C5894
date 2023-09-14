show databases;
use studentinfo;
show tables;
select * from students;

create table Student1
( sid int,
name varchar(100),
department varchar(100),
marks int,
address varchar(100),
city varchar(100)
);

alter table Student1
add constraint primary key (sid); 


