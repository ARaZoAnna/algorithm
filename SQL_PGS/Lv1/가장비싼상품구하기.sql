-- https://school.programmers.co.kr/learn/courses/30/lessons/131697
SELECT PRICE AS MAX_PRICE
FROM PRODUCT
WHERE PRICE = (SELECT MAX(PRICE)
              FROM PRODUCT
              );
