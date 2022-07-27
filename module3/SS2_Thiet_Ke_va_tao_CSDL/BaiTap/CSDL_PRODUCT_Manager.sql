CREATE DATABASE CSDL_product_management;

use CSDL_product_management;

CREATE TABLE customer (
	id int PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(50),
	age int
);
insert into customer(`name`,age)
values('Minh Quan',10),
			('Ngoc Oanh',20),
            ('Hong Ha',50);


CREATE TABLE`order` (
	id int PRIMARY KEY AUTO_INCREMENT,
	customer_id int,
	orderDate datetime,
	total_price double,
	FOREIGN KEY (customer_id) REFERENCES customer (id)
);

insert into `order`(customer_id,orderDate,total_price)
values (1,'2006-03-21',null),
			(2,'2006-03-23',null),
			(1,'2006-03-16',null);

CREATE TABLE product (
	id int PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(50),
	price double
);
insert into product(`name`,price)
values('May Giat',3),
			('Tu Lanh',5),
            ('Dieu Hoa',7),
            ('Quat',1),
            ('Bep Dien',2);

CREATE TABLE order_detail (
	order_id int,
	product_id int,
	quantity SMALLINT,
	PRIMARY KEY (order_id, product_id),
	FOREIGN KEY (order_id) REFERENCES `order` (id),
	FOREIGN KEY (product_id) REFERENCES `product` (id)
);
insert into order_detail(order_id,product_id,quantity)
values(1,1,3),
		 (1,3,7),
         (1,4,2),
         (2,1,1),
         (3,1,8),
         (2,5,4),
         (2,3,3);
         