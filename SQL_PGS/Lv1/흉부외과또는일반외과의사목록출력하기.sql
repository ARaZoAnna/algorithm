-- https://school.programmers.co.kr/learn/courses/30/lessons/132203

SELECT DR_NAME, DR_ID, MCDP_CD, date_format(HIRE_YMD, "%Y-%m-%d")
FROM DOCTOR
WHERE MCDP_CD in ("CS", "GS")
ORDER BY HIRE_YMD DESC, DR_NAME ASC
