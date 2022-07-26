create database QuanLyDiemThi;
use QuanLyDiemThi;

create table HocSinh(
MaHS  varchar(50) not null primary key,
TenHS varchar(50) not null,
NgaySinh date,
Lop int,
GT varchar(50)
);

create table MonHoc(
MaMH varchar(50) primary key,
TenMH varchar(50),
MaGV varchar(50)
);

create table BangDiem(
MaHS varchar(50) ,
MaMH varchar(50),
DiemThi float,
NgayKT date,
primary key(MaHS,MaMH),
foreign key(MaHS) references HocSinh(MaHS),
foreign key(MaMH) references MonHoc(MaMH)

);

create table GiaoVien(
MaGV varchar(20) primary key,
TenGV varchar(50),
SDT varchar(10)
);
alter table MonHoc add MaGV varchar(20);
ALTER TABLE MonHoc add constraint
FK_MaGV foreign key (MaGV) references GiaoVien(MaGV);
