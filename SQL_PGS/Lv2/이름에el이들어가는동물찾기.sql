# https://school.programmers.co.kr/learn/courses/30/lessons/59047
SELECT ANIMAL_ID,NAME
FROM ANIMAL_INS
WHERE ANIMAL_TYPE IN ("DOG") AND NAME LIKE "%EL%"
ORDER BY NAME;
