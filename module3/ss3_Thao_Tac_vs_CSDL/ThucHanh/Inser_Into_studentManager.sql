create database Inser_to_studentManager;
use Inser_to_studentManager;
create table class(
ClassID int,
ClassName varchar(50),
StartDate date,
`Status` int
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
INSERT INTO Subject
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
