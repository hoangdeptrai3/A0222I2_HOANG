create database if not exists Module3;
use Module3;
create table student(
id int,
`name` varchar(50) ,
birthday date
);
--     them moi
insert into student
values(1, 'hoang' , '2001-01-02');
insert into student(id,name,birthday)
values(2, 'hoang2' , '2001-01-02'),
		   (3, 'hoang3' , '2001-01-02');
           -- lay thong tin
select s.id,s.`name` 
from student s;
select * from   student;       

-- thay doi thong tin
update student
set name = 'hoang1',birthday = '2000-02-03'
where id = 1;

-- xoa thong tin record
delete from student
where name = 'hoang' ;
-- them moi 1 truong 
alter table student
add column `point` int;
-- xoa bang
drop table student;

-- xoa csdl
drop database Module3;




