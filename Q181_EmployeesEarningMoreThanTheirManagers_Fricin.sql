# Write your MySQL query statement below
SELECT a.Name FROM Employee AS a, Employee AS b WHERE a.ManagerId = b.Id AND a.Salary>b.Salary;