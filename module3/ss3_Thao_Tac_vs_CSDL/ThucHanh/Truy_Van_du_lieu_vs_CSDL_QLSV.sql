CREATE database Truy_Van_du_lieu_vs_CSDL_QLSV;
use Truy_Van_du_lieu_vs_CSDL_QLSV;

create table class(
ClassID int,
ClassName varchar(50),
StartDate date,
`Status` boolean
);
insert into class
VALUES (1, 'A1', '2008-12-20', 1);
INSERT INTO Class
VALUES (2, 'A2', '2008-12-22', 1);
INSERT INTO Class
VALUES (3, 'B3', current_date, 0);

create table Student(
StudentName varchar(50),
Address varchar(50),
Phone varchar(11),
`Status` int,
ClassId int
);

INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO Student (StudentName, Address, Status, ClassId)
VALUES ('Hoa', 'Hai phong', 1, 1);
INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Manh', 'HCM', '0123123123', 0, 2);

create table Subject(
STT int primary key auto_increment,
MaSV varchar(50),
numberST int,
numberST2 int
);
INSERT INTO `Subject`
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
 -- 1 dispay all student
 select *from Student;
 -- 2 Hiển thị danh sách các học viên đang theo học.
 SELECT *
FROM Student
WHERE Status = true;
-- 3 Hiển thị danh sách các môn học có thời gian học nhỏ hơn 10 giờ.
select *from Subject
where numberST < 10;
-- 4 Hiển thị danh sách học viên lớp A1
select  s.ClassId, s.StudentName,c.ClassName as  ClassName
from Student s inner join class c 
on s.ClassId = c.ClassID where c.ClassName = 'A1';

-- Hiển thị điểm môn CF của các học viên
select *from Student s join `Subject` s2
on s.ClassId = s2.STT where MaSV = 'CF';
