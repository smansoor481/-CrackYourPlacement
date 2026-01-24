# Write your MySQL query statement below
SELECT W1.id
FROM Weather W1
INNER JOIN
Weather W2
WHERE DATEDIFF(w1.recordDate, w2.recordDate) = 1
AND w1.temperature > w2.temperature;
