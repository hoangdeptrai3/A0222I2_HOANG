create database demoPhone;
use demoPhone;

create table phone(
id int primary key auto_increment,
`name` varchar(50),
price int,
id_color int,
foreign key(id_color) references color(id)
);

create table color(
id int primary key auto_increment,
name_color varchar(50)
);
insert into color(name_color)values('blue');
insert into color(name_color)values('red');
insert into color(name_color)values('green');
insert into color(name_color)values('green');
insert into phone(`name`,price,id_color)
values('tivi',1000,1);

select *from color;
select *from phone;

DELIMITER $$

CREATE PROCEDURE `search`(name_search varchar(120))
BEGIN
  -- statements
  select * from phone where (name like concat ('%',name_search,'%'));
  END $$

DELIMITER ;

call search("");