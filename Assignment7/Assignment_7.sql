-- Viết triggers để tránh trường hợp người dùng nhập thông tin module Project không hợp
-- lệ
-- (Project_Modules.ProjectModulesDate < Projects.ProjectStartDate,
-- Project_Modules.ProjectModulesCompletedOn > Projects.ProjectCompletedOn)
USE assignment_6;
DROP TRIGGER IF EXISTS modify_projects;
DELIMITER $$ 
CREATE TRIGGER modify_information
BEFORE INSERT ON project_modules
FOR EACH ROW 
BEGIN 
 DECLARE 		v_ProjectStartDate DATE;
 DECLARE 		v_ProjectCompletedOn DATE;
 SELECT 		ProjectStartDate INTO 	v_ProjectStartDate
 FROM 			projects
 WHERE 			ProjectID = NEW.ProjectID;
 SELECT			ProjectCompletedOn INTO v_ProjectCompletedOn
 FROM			projects
 WHERE 			projectID=NEW.projectID;
 
 IF((NEW.ProjectModulesDate < v_ProjectStartDate) OR (NEW.ProjectModulesCompletedOn > v_ProjectCompletedOn)) THEN SIGNAL SQLSTATE '45000'
 SET MESSAGE_TEXT = 'Can not insert!';


END IF;
END $$
INSERT INTO project_modules
VALUES('M7','ABC2','NEU002','2019-12-23','2017-12-30','abg');
-- ex2 : 
USE fresher;
DROP VIEW IF EXISTS v_pass_test;
CREATE VIEW v_pass_test AS 
SELECT 
full_name as ET_pass
from trainee
WHERE 
					    (ET_IQ + ET_Gmath)>=20
AND 					ET_IQ >=8
AND 					ET_Gmath >= 8
AND 					ET_English	>= 18;

	

