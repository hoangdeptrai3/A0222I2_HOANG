create database TH_tao_CSDL_QuanLySinhVien;
use TH_tao_CSDL_QuanLySinhVien;
create table Class(
ClassID int not null  auto_increment primary key,
ClassName varchar(60) not null,
StartDate datetime not null,
`status` Bit
);

create table Student(
StudentID int not null primary key auto_increment,
StudentName varchar(30) not null,
Phone varchar(20),
Status Bit,
ClassID int not null,
foreign key(ClassID) references Class(ClassID)

);

create table Subject(
SubID int not null primary key auto_increment,
SubName varchar(30) not null,
Credit Tinyint not null  default  1 check (credit >=1),
`Status` Bit default 1

);

create table Mark(
MarkID int not null primary key auto_increment,
SubID int not null unique key,
StudentID int not null unique key,
Mark float default 0 Check  (Mark between 0  and 100),
UNIQUE (SubId, StudentId),
ExamTimes tinyint default 1,
FOREIGN KEY (SubId) REFERENCES Subject (SubId),
FOREIGN KEY (StudentId) REFERENCES Student (StudentId)
);
drop table hoang;


 
