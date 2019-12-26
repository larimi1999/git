
-- Question 1:Viết 1 query lấy thông tin "Name" từ bảng Production.Product có name
-- của ProductSubcategory là 'Saddles'.
SELECT 
    p.`Name`
FROM
    Product p
WHERE
    p.ProductSubcategoryID IN (SELECT 
										ProductSubcategoryID
							   FROM
										productsubcategory s
                               WHERE
										s.`name` = 'Saddles');
            
-- Question 2: 
SELECT 
    p.`Name`
FROM
    Product p
WHERE
						p.ProductSubcategoryID IN (SELECT 
															ProductSubcategoryID
												   FROM
															productsubcategory s
                                                   WHERE
															s.`name` LIKE 'Bo%')
ORDER BY `name` DESC;
-- Question 3 : 
SELECT 
    `name`
FROM
    product
WHERE
    ProductSubcategoryID = 3
			    AND listprice IN (SELECT 
									MIN(listprice)
							  FROM
									product
							  WHERE
									ProductSubcategoryID = 3);
						
                        
                        
-- Question 4 : 

SELECT 
				p.`name` AS Country,
                s.`name` AS Province
FROM
				countryregion p
JOIN
                stateprovince s 
ON 				p.CountryRegionCode = s.CountryRegionCode;


-- Question 5 : 
SELECT 
				(p.`name` ) AS Country,
                 s.name AS Province
FROM
				countryregion p
JOIN
                stateprovince s 
ON 				p.CountryRegionCode = s.CountryRegionCode
WHERE p.`name` LIKE 'Canada%' OR p.`name` LIKE 'Germany%' ;

-- Question 6: 
SELECT 
			a.SalesOrderID,
			a.OrderDate,
			b.SalesPersonID,
			b.SalesPersonID AS BusinessEntityID,
			b.Bonus,
			b.SalesYTD
FROM
		    salesorderheader a
JOIN
			salesperson b 
ON 			a.SalesPersonID = b.SalesPersonID;

-- Question  7: 


