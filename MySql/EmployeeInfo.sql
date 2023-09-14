SHOW databases;

USE employeeinfo;

SHOW TABLES;

DROP TABLE employeestatus;

CREATE TABLE employeeinfo (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(255),
    job_name VARCHAR(255),
    manager_id INT,
    hire_date DATE,
    salary DECIMAL(10, 2),
    commission DECIMAL(10, 2),
    dep_id INT
);

-- Insert data into the employeedetails table
INSERT INTO employeedetails (emp_id, emp_name, job_name, manager_id, hire_date, salary, commission, dep_id)
VALUES
  (68319, 'KAYLING', 'PRESIDENT', NULL, '1991-11-18', 6000.00, NULL, 1001),
  (66928, 'BLAZE', 'MANAGER', 68319, '1991-05-01', 2750.00, NULL, 3001),
  (67832, 'CLARE', 'MANAGER', 68319, '1991-06-09', 2550.00, NULL, 1001),
  (65646, 'JONAS', 'MANAGER', 68319, '1991-04-02', 2957.00, NULL, 2001),
  (67858, 'SCARLET', 'ANALYST', 65646, '1997-04-19', 3100.00, NULL, 2001),
  (69062, 'FRANK', 'ANALYST', 65646, '1991-12-03', 3100.00, NULL, 2001),
  (63679, 'SANDRINE', 'CLERK', 69062, '1990-12-18', 900.00, NULL, 2001),
  (64989, 'ADELYN', 'SALESMAN', 66928, '1991-02-20', 1700.00, 400.00, 3001),
  (65271, 'WADE', 'SALESMAN', 66928, '1991-02-22', 1350.00, 600.00, 3001),
  (66564, 'MADDEN', 'SALESMAN', 66928, '1991-09-28', 1350.00, 1500.00, 3001),
  (68454, 'TUCKER', 'SALESMAN', 66928, '1991-09-08', 1600.00, 0.00, 3001),
  (68736, 'ADNRES', 'CLERK', 67858, '1997-05-23', 1200.00, NULL, 2001),
  (69000, 'JULIUS', 'CLERK', 66928, '1991-12-03', 1050.00, NULL, 3001),
  (69324, 'MARKER', 'CLERK', 67832, '1992-01-23', 1400.00, NULL, 1001);

-- Specify the database
USE employeeinfo;

-- Create the employeedetails table
CREATE TABLE employeedetails (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(255),
    job_name VARCHAR(255),
    manager_id INT,
    hire_date DATE,
    salary DECIMAL(10, 2),
    commission DECIMAL(10, 2),
    dep_id INT
);

-- Insert data into the employeedetails table
INSERT INTO employeedetails (emp_id, emp_name, job_name, manager_id, hire_date, salary, commission, dep_id)
VALUES
  (68319, 'KAYLING', 'PRESIDENT', NULL, '1991-11-18', 6000.00, NULL, 1001),
  (66928, 'BLAZE', 'MANAGER', 68319, '1991-05-01', 2750.00, NULL, 3001),
  (67832, 'CLARE', 'MANAGER', 68319, '1991-06-09', 2550.00, NULL, 1001),
  (65646, 'JONAS', 'MANAGER', 68319, '1991-04-02', 2957.00, NULL, 2001),
  (67858, 'SCARLET', 'ANALYST', 65646, '1997-04-19', 3100.00, NULL, 2001),
  (69062, 'FRANK', 'ANALYST', 65646, '1991-12-03', 3100.00, NULL, 2001),
  (63679, 'SANDRINE', 'CLERK', 69062, '1990-12-18', 900.00, NULL, 2001),
  (64989, 'ADELYN', 'SALESMAN', 66928, '1991-02-20', 1700.00, 400.00, 3001),
  (65271, 'WADE', 'SALESMAN', 66928, '1991-02-22', 1350.00, 600.00, 3001),
  (66564, 'MADDEN', 'SALESMAN', 66928, '1991-09-28', 1350.00, 1500.00, 3001),
  (68454, 'TUCKER', 'SALESMAN', 66928, '1991-09-08', 1600.00, 0.00, 3001),
  (68736, 'ADNRES', 'CLERK', 67858, '1997-05-23', 1200.00, NULL, 2001),
  (69000, 'JULIUS', 'CLERK', 66928, '1991-12-03', 1050.00, NULL, 3001),
  (69324, 'MARKER', 'CLERK', 67832, '1992-01-23', 1400.00, NULL, 1001);
  



-- Q1.Select all rows from the employeedetails table
SELECT * FROM employeedetails;

/*Q2. From the following table, write a SQL query to find the salaries of all employees. Return salary.*/
SELECT salary FROM employeedetails;

/*Q3. From the following table, write a SQL query to find the unique designations of the employees. Return job name.*/
SELECT DISTINCT job_name FROM employeedetails;

/*Q4.From the following table, write a SQL query to list the employees’ name, increased their
 salary by 15%, and expressed as number of Dollars.*/
SELECT emp_name, ROUND(salary * 1.15, 2) AS increased_salary_in_dollars FROM employeedetails;

 /*Q5.From the following table, write a SQL query to list the employee's name and job name as a format of "Employee & Job".*/
 SELECT CONCAT(emp_name, ' & ', job_name) AS employee_and_job FROM employeedetails;

/*Q6.Write a query in SQL to produce the output of employees as follows Employee.*/
SELECT emp_name AS Employee FROM employeedetails;

/*Q7.From the following table, write a SQL query to find those employees with hire date in the format like February 22, 1991.
 Return employee ID, employee name, salary, hire date.*/
 SELECT
    emp_id AS Employee_ID,
    emp_name AS Employee_Name,
    salary AS Salary,
    DATE_FORMAT(hire_date, '%M %d, %Y') AS Hire_Date
FROM employeedetails;

/*Q8.From the following table, write a SQL query to count the number of characters except the spaces for each employee name.
 Return employee name length.*/
SELECT emp_name AS Employee_Name,
LENGTH(REPLACE(emp_name, ' ', '')) AS Employee_Name_Length
FROM employeedetails;

/*Q9.From the following table, write a SQL query to find the employee ID, salary, and commission of all the employees.*/
SELECT emp_id AS Employee_ID, salary AS Salary, commission AS Commission FROM employeedetails;

/*Q10.From the following table, write a SQL query to find the unique department with jobs. Return department ID, Job name.*/
SELECT DISTINCT dep_id AS Department_ID, job_name AS Job_Name FROM employeedetails;

/*Q.11 From the following table, write a SQL query to find those employees who do not belong to the department 2001.
 Return complete information about the employees.*/
 SELECT * FROM employeedetails WHERE dep_id <> 2001;
 
 /*Q.12 From the following table, write a SQL query to find those employees who joined before 1991.
 Return complete information about the employees.*/
SELECT * FROM employeedetails WHERE YEAR(hire_date) < 1991;

/*Q.13 From the following table, write a SQL query to calculate the average salary of employees who work as analysts.
 Return average salary.*/
SELECT AVG(salary) AS Average_Salary
FROM employeedetails
WHERE job_name = 'ANALYST';

/*Q.14.	From the following table, write a SQL query to find the details of the employee ‘BLAZE’.*/
SELECT * FROM employeedetails WHERE emp_name = 'BLAZE';

/*Q.15 From the following table, write a SQL query to identify employees whose commissions exceed their salaries.
 Return complete information about the employees.*/
SELECT * FROM employeedetails WHERE commission > salary;

/*Q.16 From the following table, write a SQL query to identify those employees whose salaries exceed 3000 after receiving a 25% salary increase.
 Return complete information about the employees*/
SELECT * FROM employeedetails WHERE (salary * 1.25) > 3000;

/*Q.17 From the following table, write a SQL query to find the names of the employees whose length is six. Return employee name.*/
SELECT emp_name AS Employee_Name FROM employeedetails WHERE LENGTH(emp_name) = 6;

/*Q.18.	From the following table, write a SQL query to find out which employees joined in the month of January.
 Return complete information about the employees.*/
SELECT * FROM employeedetails WHERE MONTH(hire_date) = 1;

/*19. From the following table, write a SQL query to separate the names of employees and their managers by the string 'works for'*/
SELECT e.emp_name || ' works for ' || m.emp_name AS Employee_and_Manager
FROM employeedetails e
LEFT JOIN employeedetails m ON e.manager_id = m.emp_id;

/*20. From the following table, write a SQL query to find those employees whose designation is ‘CLERK’.
 Return complete information about the employees.*/
 SELECT * FROM employeedetails WHERE job_name = 'CLERK';


