create database if not exists USERdemo;
use USERdemo;

create table user(
id int(3) not null auto_increment primary key,
`name` varchar(120) not null,
email varchar(220) not null,
country varchar(120)
);

insert into user(name, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into user(name, email, country) values('Kante','kante@che.uk','Kenia');
