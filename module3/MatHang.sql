create database quanlymatbang;
use quanlymatbang;

create table matbang(
	maMatBang varchar(50) primary key,
    trang_thai varchar(50),
    dien_tich double,
    tang int,
    mo_ta_chi_tiet varchar(50),
    gia_cho_thue int,
    ngay_bat_dau varchar(50),
    id_loai_mat_bang int,
    foreign key(id_loai_mat_bang) references loaimatbang(id)
);

create table loaimatbang(
id int primary key auto_increment,
`name_mb` varchar(50)
);
insert into loaimatbang(`name_mb`)
values('van phong cho thue'),('van phong tron goi');

	insert into matbang(maMatBang,trang_thai,dien_tich,tang,mo_ta_chi_tiet,gia_cho_thue,ngay_bat_dau, id_loai_mat_bang)
	values('A01','Trong',200,2,'dep',1000,'20/01/2022',1);

select * from matbang;
select *from loaimatbang;