create database if not exists userDemo ;
use userDemo;

create table userH(
id int primary key auto_increment,
`name` varchar(50),
email varchar(50),
country varchar(50)
);



DELIMITER $$

CREATE PROCEDURE `search`(name_search varchar(120),email_search varchar(220),country_search varchar(120))
BEGIN
  -- statements
  select * from userH where (name like concat ('%',name_search,'%')) and (email like concat ('%',email_search,'%' ) )and (country like concat ('%',country_search,'%'));
END $$

DELIMITER ;


call search("","","");