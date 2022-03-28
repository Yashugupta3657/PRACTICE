# Write your MySQL query statement below
SELECT  a.name as Employee from Employee a,Employee b where a.salary>b.salary and a.managerId=b.id;