-- https://school.programmers.co.kr/learn/courses/30/lessons/131535
SELECT count(*) as users
from user_info
where Year(joined) = '2021' and age between 20 and 29;
