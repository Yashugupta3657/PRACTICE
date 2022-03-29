# Write your MySQL query statement below
SELECT currentDay.id FROM
Weather AS currentDay,Weather AS previousDay
WHERE
DATEDIFF(currentDay.recordDate,previousDay.recordDate)=1 AND
       currentDay.temperature>previousDay.temperature ;