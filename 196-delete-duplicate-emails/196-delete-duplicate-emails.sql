# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
DELETE t1 from Person as t1, Person as t2 WHERE t1.email=t2.email and t1.id>t2.id