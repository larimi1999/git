-- Assign 2-Exercise 1  :
DROP DATABASE IF EXISTS fresher;
CREATE DATABASE IF NOT EXISTS fresher;
USE fresher;
CREATE TABLE trainee (
    TraineeID          INT AUTO_INCREMENT PRIMARY KEY,
    Full_Name          VARCHAR(55),
    Birth_Date         DATE,
    Gender             ENUM('male', 'female', 'unknown'),
    ET_IQ              TINYINT,
    ET_Gmath           TINYINT,
    ET_English         TINYINT,
    Training_Class     CHAR(5),
    Evaluation_Notes   VARCHAR(255)
);
ALTER TABLE trainee
ADD COLUMN VTI_Account VARCHAR(55) NOT NULL UNIQUE;

