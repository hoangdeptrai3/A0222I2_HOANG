create database ERD_Sang_MoHinh_QH;
use ERD_Sang_MoHinh_QH;

create table PhieuXuat(
id int not null primary key,
SoPX varchar(50),
NgayXuat date
);
-- 1
create table Chi_Tiet_Phieu_Xuat(
id_PhieuXuat int,
id_VatTu int,
DGXuat varchar(50),
SLXUAT int,
primary key(id_PhieuXuat,id_VatTu),
foreign key(id_PhieuXuat) references PhieuXuat(id),
foreign key(id_VatTu) references VatTu(id)
);

create table VatTu(
id int primary key not null,
MaVTU varchar(50),
TenVTU varchar(50)
);
-- 2
create table Chi_Tiet_Phieu_Nhap(
id_VatTu int,
id_PhieuNhap int,
DGNHAP varchar(50),
SLNHAP int,
primary key(id_VatTu,id_PhieuNhap),
foreign key(id_VatTu) references VatTu(id),
foreign key(id_PhieuNhap) references PhieuNhap(id)
);

create table PhieuNhap(
id int primary key not null,
SoPN varchar(50),
NgayNhap date
);
-- 3
create table Chi_Tiet_Don_Dat_Hang(
id_VatTu int not null,
id_DONDH int,
primary key(id_VatTu,id_DONDH),
foreign key(id_VatTu) references VatTu(id),
foreign key(id_DONDH) references DONDH(id)
);

create table DONDH(
id int not null primary key,
SoDH varchar(50),
NgayDH date,
nha_cung_cap_id int,
foreign key(nha_cung_cap_id ) references NhaCC(id)
);

create table NhaCC(
id int primary key not null,
MaNCC varchar(50),
TenNCC varchar(50),
DiaChi varchar(50),
sdt_id int,
foreign key(sdt_id) references SDT(id)
);

create table SDT(
id int not null primary key,
so_dien_thoai varchar(50)
);

