create database demoProduct;
use demoProduct;

create table product(
id int primary key auto_increment,
`name` varchar(50),
price int ,
quantity int,
color varchar(50),
id_category int,
foreign key(id_category) references category(id)
);

create table category(
id int primary key auto_increment,
name_category varchar(50)
);


insert into category(name_category)
values('television'),
			("phone");    

select  * from product;
select  * from category;
drop table category;
drop table product

DELIMITER $$

CREATE PROCEDURE `search`(name_search varchar(120))
BEGIN
  -- statements
  select * from product where (name like concat ('%',name_search,'%'));
  END $$

DELIMITER ;

call search("");