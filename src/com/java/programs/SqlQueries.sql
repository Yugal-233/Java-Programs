SQL queries:
second
select max(salary) from employee where salary not in  (select max(salary) from employee);
select max(salary) from employee where salary < (select max(salary) from employee);
select empName, salary from Employee e1 where N-1 = (select count (distinct salary) from employee e2 where e2.salary>e1.salary);

SQL Query to find Max Salary from each department
select deptId, max(salary) from employee group by deptId
select deptName, max(salary) from employee join department on employee.deptId=department.deptId group by deptName;

Write an SQL Query to print the name of the distinct employee whose DOB is between 01/01/1960 to 31/12/1975

select distinct(empName) from employee where dob between  01/01/1960 and 31/12/1975

Write an SQL Query to find the number of employees according to gender whose DOB is between 01/01/1960 to 31/12/1975

select count(*), sex from employee where dob between 01/01/1960 and 31/12/1975 group by sex;

find an employee whose salary is equal to or greater than 10000
select emplName from employee where salary>=10000

find the name of an employee whose name Start with ‘M’
select * from employee where empName like 'M%'

find all Employee records containing the word "Joe", regardless of whether it was stored as JOE, Joe, or joe
select * from employee where upper(empName) like '%JOE%'

How do you find all employees who are also managers
select Employee e, employee m from employee e, employee m where e.mngr_id=m.emp_id;

find duplicates records from the table using query
SELECT email, COUNT(email) AS count FROM users GROUP BY email HAVING COUNT(email) > 1;
SELECT first_name, last_name, COUNT(*) FROM employees GROUP BY first_name, last_name HAVING COUNT(*) > 1;

SELECT column_name, COUNT(column_name) AS count
FROM your_table
GROUP BY column_name
HAVING COUNT(column_name) > 1;


SELECT *
FROM employee
WHERE employee_id IN (
    SELECT employee_id
    FROM employee
    GROUP BY employee_id
    HAVING COUNT(employee_id) > 1
);

WITH RankedEmployees AS (
    SELECT
        employee_id,
        DENSE_RANK() OVER (ORDER BY employee_id) AS rank
    FROM
        employee
)
SELECT
    employee_id
FROM
    RankedEmployees
WHERE
    rank > 1;


WITH RankedEmployees AS (
    SELECT
        employee_id,
        ROW_NUMBER() OVER (PARTITION BY employee_id ORDER BY employee_id) AS rank
    FROM
        employee
)
SELECT
    employee_id
FROM
    RankedEmployees
WHERE
    rank > 1;



********************************************************************************************************
 fetch the EmpId and FullName of all the employees working under the Manager with id – ‘986’.

 select emplId, empName from employee where mngr_id=986

SQL query to fetch all the EmpIds which are present in either of the tables – ‘EmployeeDetails’ and ‘EmployeeSalary’

select  empId from EmployeeDetails union select  empId from EmployeeSalary;

to fetch common records between two tables
SELECT * FROM EmployeeSalary INTERSECT SELECT * FROM ManagerSalary;

Write an SQL query to fetch records that are present in one table but not in another table. EmployeeDetails,EmployeeSalary
SELECT ed.* FROM EmployeeDetails ed LEFT JOIN EmployeeSalary es ON ed.EmpId = es.EmpId WHERE es.EmpId IS NULL;

to fetch the EmpIds that are present in both the tables –  ‘EmployeeDetails’ and ‘EmployeeSalary
SELECT EmpId FROM EmployeeDetails  where EmpId IN (SELECT EmpId FROM EmployeeSalary);

to fetch the EmpIds that are present in EmployeeDetails but not in EmployeeSalary.
SELECT EmpId FROM EmployeeDetails where EmpId Not IN (SELECT EmpId FROM EmployeeSalary);

to fetch employee names having a salary greater than or equal to 5000 and less than or equal to 10000
SELECT FullName FROM EmployeeDetails WHERE EmpId IN (SELECT EmpId FROM EmployeeSalary WHERE Salary BETWEEN 5000 AND 10000);

to fetch the project-wise count of employees sorted by project’s count in descending order.
SELECT ProjectName, COUNT(EmployeeID) AS EmployeeCount FROM Projects GROUP BY ProjectName ORDER BY EmployeeCount DESC;


with rowSalary as
	(select emplname, emplSalary, row_number() over (partition by department order by salary desc) as salary_rank from employee)
		select emplName, salary from rowSalary where salary_rank=2;


With duplicate as(
		select emplName, emplId, row_number() over(partition by emplName order by emplName) as rank
		from employee)
delete from duplicate where rank>1;