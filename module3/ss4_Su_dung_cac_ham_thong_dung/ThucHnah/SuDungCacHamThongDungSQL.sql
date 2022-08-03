CREATE DATABASE IF NOT EXISTS student_manager3;

use student_manager3;

CREATE TABLE  class (
	id INT PRIMARY KEY,
	`name` VARCHAR(50) NOT NULL,
	start_date DATETIME NOT NULL,
	`status` BIT
);

insert into class
VALUES (1, 'A1', '2008-12-20', 1);
INSERT INTO Class
VALUES (2, 'A2', '2008-12-22', 1);
INSERT INTO Class
VALUES (3, 'B3', current_date, 0);



CREATE TABLE student (
	id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
	`name` varchar(30) NOT NULL,
	address varchar(50),
	phone varchar(20),
	`status` bit,
	class_id int NOT NULL,
	FOREIGN KEY (class_id) REFERENCES class (id)
);

INSERT INTO student (`name`, address , phone, `status`, class_id )
VALUES ('Hung', 'Ha Noi', '09121131137', 1, 1);
INSERT INTO student (`name`, address , phone, `status`, class_id )
VALUES ('Hoa', 'Hai phong','01233', 1, 1);
INSERT INTO student (`name`, address , phone, `status`, class_id )
VALUES ('Manh', 'HCM', '0123123123', 0, 2);


CREATE TABLE IF NOT EXISTS `subject` (
	id int PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(30) NOT NULL,
	credit tinyint NOT NULL DEFAULT 1,
	`status` bit DEFAULT 1,
	CHECK (Credit >= 1)
);
insert into `subject`
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);

CREATE TABLE IF NOT EXISTS Mark (
	id int PRIMARY KEY AUTO_INCREMENT,
	sub_id int NOT NULL,
	student_id int NOT NULL,
	mark float DEFAULT 0,
	exam_times tinyint DEFAULT 1,
	UNIQUE (sub_id, student_id),
CHECK (mark BETWEEN 0 AND 100),
FOREIGN KEY (sub_id) REFERENCES `subject` (id),
FOREIGN KEY (student_id) REFERENCES student (id)
);

insert into Mark (sub_id, student_id, mark, exam_times)
values  (1, 1, 8, 1),
			(1, 2, 10, 2),
			(2, 1, 12, 1);
            -- Hiển thị số lượng sinh viên ở từng nơi
		select address ,count(id) as 'số lượng học viên từng nơi'
		from student
		group by address;
			-- Tính điểm trung bình các môn học của mỗi học viên
		select s.id,s.`name`, avg(m.mark) as 'TB cua moi hoc vien'
		from student s join Mark m on s.id = m.student_id
		group by s.id;
            -- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
		select s.id,s.`name`,avg(m.mark) as avg_mark
		from student s join Mark m on s.id = m.student_id
		group by s.id
		having avg_mark > 20;
        
        select s.id, s.name,c.name as class_name
		from student s 
        join class c  
		on s.class_id = c.id;
        -- Hiển thị thông tin học viên có điểm trung bình lớn nhất
		select s.id, s.`name` , avg(m.mark) as 'max avg point'
        from student s join Mark m on s.id = m.student_id
        group by s.id
        having avg(Mark) >= all (select avg(Mark) from Mark group by Mark.student_id);
        
        select *from `subject`;