-- Question 1 :
INSERT INTO 
trainee (  Full_Name , Birth_Date , Gender , ET_IQ , ET_Gmath ,  ET_English ,Training_Class , Evaluation_Notes, VTI_Account )
VALUES  ( 'Braum' , 		'1998-01-01' , 	'male' , 	 08 , 20 , 25 , 'Class 1 ', 'good' ,		'Braum@gmail' ),
		(  'Leona' , 		'1999-05-12' , 	'male' , 	 10 , 19 , 50 , 'Class 2 ', 'bad' ,			'Leona@gmail' ),
        (  'Nautilus' , 	'1998-08-25' , 	'male' ,	 15 , 15 , 15 , 'Class 3 ', 'Exellent' ,	'Nautilus@gmail' ),
        (  'Thresh' , 		'2000-09-30' , 	'female' ,	 20 , 16 , 30 , 'Class 2 ', 'Incredible' ,	'Thresh@gmail' ),
        (  'Blitcrank' ,  	'1999-07-25' , 	'female' ,	 19 , 15 , 25 , 'Class 3 ', 'good good' ,	'Blitcrank@gmail' ),
        (  'Lulu'	 , 	 	'1992-03-26' , 	'female' ,	 03 , 19 , 46 , 'Class 4 ', 'good' ,		'Lulu@gmail' ),
        (  'Soraka' ,  		'1893-08-21' , 	'male' , 	 17 , 20 , 36 , 'Class 5 ', 'so bad' ,		'Soraka@gmail' ),
        (  'Brand'  , 		'2005-12-23' , 	'female' ,	 20 , 10 , 12 , 'Class 2 ', 'impressive' ,	'Brand@gmail' ),
        (  'Victor' ,  		'1890-12-23' , 	'male' , 	 15 , 02 , 31 , 'Class 5 ', 'good' ,		'Victor@gmail' ),
        (  'Sona' 	 , 		'1991-09-25' , 	'male' , 	 18 , 13 , 45 , 'Class 1 ', 'good' ,		'Sona@gmail' );
-- Question 2:

SELECT MONTH(Birth_Date) AS 'Thang sinh', GROUP_CONCAT(Full_Name) AS 'Ho ten'
FROM trainee 
GROUP BY MONTH(Birth_Date); 

-- Question 3:
SELECT 
    *
FROM
    trainee
WHERE
    LENGTH(Full_Name) = (SELECT 
	                         MAX(LENGTH(Full_Name))
                         FROM
                              trainee);
-- Question 4:

SELECT 
    *
FROM
    trainee
WHERE
    ET_IQ + ET_Gmath >= 20 AND ET_IQ >= 8
                           AND ET_Gmath >= 8
                           AND ET_English >= 18;

-- Question 5:

DELETE FROM trainee
WHERE TraineeID = 3;

-- Question 6:

UPDATE Trainee
SET    Training_Class='Class 2'
WHERE  TraineeID=5 ;

