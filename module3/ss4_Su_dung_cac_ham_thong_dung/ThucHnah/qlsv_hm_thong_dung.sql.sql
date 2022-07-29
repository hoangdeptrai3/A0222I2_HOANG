create database QLSV_GroupBy;
use QLSV_GroupBy;

create table student(
student_id int not null primary key auto_increment,
`name` varchar(50),
age int,
address varchar(50)

);
insert into student(student_id,`name`,age,address)
value(1,'hoang',21,'vn'),
			(2,'hoang2',23,'TQ'),
            (3,'hoang3',21,'vn');

create table mark(
id_mark int primary key,
credit double,
foreign key(id_mark) references student(student_id)
);

select address, count(student_id) as 'so luong'
from student
group by address;

select age ,count(student_id) as 'so luong tuoi'
from student
group by age;

select age,avg(age) as 'trung binh tuoi'
from student
group by age;
