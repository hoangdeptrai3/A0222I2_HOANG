create database studentManager;
use studentManager;
-- tao bang class
create table Class(
id int,
`name` nvarchar(50)
);

-- tao bang teacher

create table Teacher(
id int,
`name` nvarchar(50),
age int,
country nvarchar(50)
);

-- lay thong tin

select c.id,c.`name`
from Class c;
select * from Class;

select t.id,t.`name`,t.age,t.country
from Teacher t;
select *from Teacher;
