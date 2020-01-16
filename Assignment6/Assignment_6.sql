DROP DATABASE IF EXISTS Assignment_6;
CREATE DATABASE IF NOT EXISTS Assignment_6;
USE Assignment_6;
DROP TABLE IF EXISTS Employee;
CREATE TABLE IF NOT EXISTS Employee 
(
		EmployeeID        		CHAR(10) PRIMARY KEY,
		EmployeeLastName    	VARCHAR(30) NOT NULL,
		EmployFirstName	    	VARCHAR(30) NOT NULL,
		EmPloyeeHireDate		DATE NOT NULL,
		EmployeeStatus			NVARCHAR(50) NOT NULL,
		SupervisorID    		CHAR(10) NOT NULL,
		SocialSecurityNumber	CHAR(10) NOT NULL
);

INSERT INTO 
		Employee (EmployeeID, EmployeeLastName, EmployFirstName, EmPloyeeHireDate, EmployeeStatus , SupervisorID , SocialSecurityNumber)
VALUES			 ('NEU001','Braum',		'Lucian',		'1999-11-12','Intelligent', 'a12345','147258369'),
				 ('NEU002','Morgala',	'Tristana', 	'1997-09-23','Stupid', 		'a12346','123456798'),
				 ('NEU003','Blitcrank',	'Missfortune',	'1996-08-30','So good',		'a12347','159753258'),
				 ('NEU004','Thresh',	'Xayrah',		'1995-07-29','Hard',		'a12348','987654321'),
				 ('NEU005','Volibear', 	'Syndra',		'1993-06-17','Intelligent', 'a12349','014785236');
			
DROP TABLE IF EXISTS Projects;
CREATE TABLE IF NOT EXISTS Projects
(
	ProjectID  						CHAR(10) PRIMARY KEY,
    EmployeeID						CHAR(10) NOT NULL,
    ProjectName						VARCHAR(30) NOT NULL,
    ProjectStartDate				DATE NOT NULL,
    ProjectDescription				NVARCHAR(100),
    ProjectDetailt					NVARCHAR(255),
    ProjectCompletedOn				DATE,	
    FOREIGN KEY (EmployeeID) 		REFERENCES Employee(EmployeeID)
);
INSERT INTO 
		Projects (ProjectID,  		EmployeeID, 			ProjectName, 	ProjectStartDate, 	ProjectDescription,  ProjectDetailt, ProjectCompletedOn)
VALUES			 ('ABC1',			'NEU001',				'QL Giang Duong',		'2018-11-12',	'Very Hard', 		'P1','2019-08-12'),
				 ('ABC2',			'NEU001',				'QL Can Ho', 			'2018-09-23',	'Important', 		'P1','2019-09-11'),
				 ('ABC3',			'NEU002',				'QL Hoc Sinh',			'2018-08-30',	'Essential',		'P2','2019-07-21'),
				 ('ABC4',			'NEU002',				'QL Tai Chinh',			'2018-07-29',	'Expensive',		'P2','2019-06-22'),
				 ('ABC5',			'NEU003', 				'QL Tinh Cam',			'2019-12-17',	'Crucial', 			'P3','2019-12-21');
DROP TABLE IF EXISTS Project_Modules;
CREATE TABLE IF NOT EXISTS Project_Modules
(
	ModuleID							CHAR(10) PRIMARY KEY NOT NULL,
    ProjectID							CHAR(10) NOT NULL,
    EmployeeID							CHAR(10) NOT NULL,
    ProjectModulesDate					DATETIME NOT NULL,
    ProjectModulesCompletedOn			DATE ,
    ProjectModulesDescription 			NVARCHAR(50) NOT NULL,
    FOREIGN KEY (EmployeeID)  REFERENCES Employee(EmployeeID)  ,
	FOREIGN KEY (ProjectID)   REFERENCES Projects(ProjectID) 
);
INSERT INTO 
		Project_Modules (ModuleID,	ProjectID,	EmployeeID,		ProjectModulesDate,	 ProjectModulesCompletedOn		,	ProjectModulesDescription)
VALUES
						('M1',		'ABC1',			'NEU001',			'2019/01/10',			'2019/01/11',				'bcd'				 ),
                        ('M2',		'ABC1',			'NEU002',			'2019/02/23',					 NULL,				'bcd'				 ),
                        ('M3',		'ABC2',			'NEU002',			'2019/02/10',			'2019/02/15',				'bce'				 ),
                        ('M4',		'ABC2',			'NEU003',			'2019/09/18',			'2019/09/20',				'bce'				 ),
						('M5',		'ABC5',			'NEU005',			'2019/03/30',			'2019/03/30',				'bcf'				 ),	
                        ('M6',      'ABC5',  		'NEU001',			'2019/03/23',					NULL,  				'ghj'				 );
                        
DROP TABLE IF EXISTS Work_Done;
CREATE TABLE IF NOT EXISTS Work_Done
(
	WorkDoneID							CHAR(10) PRIMARY KEY NOT NULL,
    EmployeeID							CHAR(10) NOT NULL,
    ModuleID							CHAR(10) NOT NULL,
    WorkDoneDate						DATE,
    WorkDoneDescription					NVARCHAR(50) ,
    WorkDoneStatus						NVARCHAR(50) NOT NULL ,
    FOREIGN KEY (ModuleID) 				REFERENCES Project_Modules(ModuleID) ,
	FOREIGN KEY (EmployeeID) 			REFERENCES Employee(EmployeeID)
);
INSERT INTO 
		Work_Done	(WorkDoneID,	ModuleID,	EmployeeID,		WorkDoneDate,		WorkDoneDescription,	WorkDoneStatus	)
VALUES	
					('W1',			'M1',		'NEU001',				'2019/01/11',		'123abc',				'Done'			),
                    ('W2',			'M2',		'NEU001',				'2019/01/30',		'123abc',				'Done'			),
                    ('W3',			'M2',		'NEU002',				'2019/02/15',		'123abc',				'Done'			),
                    ('W4',			'M5',		'NEU002',				'2019/09/20',		'123abc',				'Done'			),
                    ('W5',			'M4',		'NEU003',				'2019/03/30',		'123abc',				'Done'			);

-- Question 2 : 
DROP PROCEDURE IF EXISTS d_Delete_date ;
DELIMITER $$
CREATE PROCEDURE d_Delete_date()
BEGIN 
	DROP TABLE IF EXISTS ID_project;
	CREATE TEMPORARY TABLE ID_project
    (
	SELECT ProjectID
	FROM   Projects
	WHERE  ProjectCompletedOn IN (SELECT ProjectCompletedOn
								  FROM 	Projects
                                  WHERE  SUBDATE(CURRENT_DATE(),INTERVAL 90 DAY) >= ProjectCompletedOn) );

SELECT*FROM ID_Project;
DROP TABLE IF EXISTS ID_Module;
CREATE TEMPORARY TABLE ID_Module
(
	SELECT ModuleID
	FROM   Project_Modules
	WHERE  ProjectID
								  IN (SELECT  ProjectID
								  FROM 	Projects
                                  WHERE  SUBDATE(CURRENT_DATE(),INTERVAL 90 DAY) >= ProjectCompletedOn) );
	SELECT*FROM ID_Module;

DROP TABLE IF EXISTS ID_WorkDone;
CREATE TEMPORARY TABLE ID_WorkDone
(
	SELECT WorkDoneID
	FROM   Work_Done
	WHERE  ModuleID
								  IN (SELECT  ModuleID
								  FROM 	ID_Module)
                
);
 SELECT*FROM ID_WorkDone;
 SELECT 
	 (SELECT COUNT(WorkDoneID) FROM ID_WorkDone )   AS 'Dem Work',
     (SELECT COUNT(ModuleID)   FROM ID_Module ) 	AS 'Dem Module',
     (SELECT COUNT(ProjectID)  FROM ID_project ) 	AS 'Dem Project';
     
    
     DELETE FROM work_done WHERE WorkDoneID IN (SELECT*FROM ID_WorkDone);
     SELECT ROW_COUNT() AS 'Da xoa workdone' ;
     DELETE FROM project_modules WHERE ModuleID IN (SELECT*FROM ID_Module);
	 SELECT ROW_COUNT() AS 'Da xoa Module ';
	 DELETE FROM projects WHERE projectID IN (SELECT*FROM ID_project);
	 SELECT ROW_COUNT() AS 'Da xoa project ';
     
     
	

END $$ 
DELIMITER;


-- Question c: Viết stored procedure (có parameter) để in ra các module đang được thực
-- hiện)

DROP PROCEDURE IF EXISTS in_module_thuchien;
DELIMITER $$
CREATE PROCEDURE  in_module_thuchien()
BEGIN 
SELECT 	ModuleID,ProjectID, EmployeeID
FROM  	Project_Modules
WHERE 	ProjectModulesCompletedOn IS NULL;

END$$
DELIMITER;
-- Question d : Viết hàm (có parameter) trả về thông tin 1 nhân viên đã tham gia làm mặc
-- dù không ai giao việc cho nhân viên đó (trong bảng Works)
DROP PROCEDURE IF EXISTS t_trathongtin;
DELIMITER $$
CREATE PROCEDURE t_trathongtin()
BEGIN
SELECT 
EmployeeID,EmployeeLastName,EmployFirstName
FROM Employee 
WHERE EmployeeID NOT IN (SELECT EmployeeID 
							FROM Work_Done);

END $$









                
                        


			
        