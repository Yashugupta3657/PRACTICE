# Write your MySQL query statement below
SELECT T1.id FROM
Weather AS T2,Weather AS T1
WHERE
DATEDIFF(T1.recordDate,T2.recordDate)=1 AND
       T1.temperature>T2.temperature ;