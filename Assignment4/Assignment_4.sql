DROP DATABASE IF EXISTS quanli;
CREATE DATABASE IF NOT EXISTS quanli;
USE quanli;
CREATE TABLE Department 
(
  Department_Number   INT ,
  Department_Name     VARCHAR(55)
  
);
CREATE TABLE Employee_Table
(
   Employee_Number    INT ,
   Employee_Name      VARCHAR(55),
   Department_Number  INT
);
CREATE TABLE Employee_Skill_Table
(
Employee_Number       INT ,
Skill_Code            Char(10),
Date_Registered       DATE
); 
INSERT INTO department(Department_Number,Department_Name)
VALUES  
			('101','Physics'),
		    ('102','Math'),
		    ('103','Philosophy'),
		    ('104','Psychonogy'),
		    ('105','History'),
            ('106','Literature'),
		    ('107','Information'),
            ('108','Passwork'),
            ('109','Biology'),
            ('110','Geography');
INSERT INTO employee_table(Employee_Number,Employee_Name,Department_Number)
VALUES    
			(1001,'Braum','101'),
		    (1002,'Elise','101'),
		    (1003,'Soraka','101'),
		    (1004,'Darius','101'),
		    (1005,'Brand','102'),
			(1006,'Lux','102'),
			(1007,'Blitcrank','102'),
			(1008,'Thresh','102'),
			(1009,'Ekko','103'),
			(1010,'Nautilus','104');
INSERT INTO employee_skill_table(Employee_Number,Skill_Code,Date_Registered)
VALUES
			(1001,'Java','2000-12-12'),
			(1002,'C++','1998-03-30'),
			(1003,'C#','1995-04-29'),
			(1004,'C++','1993-05-15'),
			(1005,'Java','1992-06-09'),
			(1006,'C','1990-05-07'),
            (1007,'Java','1994-03-21'),
			(1008,'HTML','1993-07-03'),
			(1009,'C','2005-03-02'),
			(1010,'Java','2004-02-07'),
            (1001,'C#','2005-03-08'),
            (1002,'Java','2006-07-08');
 -- Question 3 :Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java
 SELECT e.Employee_Number as ID,
        e.Employee_Name   as 'Ho ten',
        d.Skill_code      as 'Ki nag'
FROM employee_table e 
JOIN employee_skill_table d ON e.Employee_Number = d.Employee_Number
WHERE d.Skill_Code='Java'
ORDER BY e.Employee_Name;

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên 
SELECT a.Department_Name, a.department_number
FROM   Department a 
JOIN employee_table e  ON  a.Department_Number = e.Department_Number 
GROUP BY department_number
HAVING COUNT(Employee_Number) > 3;

-- Question 5 : Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban.
-- Hướng dẫn: sử dụng GROUP BY

SELECT  a.department_number,a.department_name , group_concat(e.employee_name) 
FROM    department a
JOIN    employee_table e ON a.Department_Number = e.Department_Number 
GROUP BY department_number;

-- Question 6 :  Viết lệnh để lấy ra danh sách nhân viên có > 1 skills.
 -- Hướng dẫn: sử dụng DISTINCT
 
SELECT e.employee_number,e.employee_name, e.department_number
FROM   employee_table e 
JOIN employee_skill_table d ON  e.employee_number= d.employee_number
GROUP BY employee_number
HAVING COUNT(Skill_Code) > 1;














