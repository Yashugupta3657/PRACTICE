# Write your MySQL query statement below
# SELECT Distinct t1.email from Person as t1,Person as t2 where t1.email=t2.email and t1.id!=t2.id
SELECT Email from Person group by Email having count(Email)>1