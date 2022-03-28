# Write your MySQL query statement below
SELECT name as Customers from Customers where Customers.id NOT IN 
(SELECT Customerid from orders)
