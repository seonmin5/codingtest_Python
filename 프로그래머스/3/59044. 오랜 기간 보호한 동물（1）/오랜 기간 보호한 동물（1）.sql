-- 아직 입양을 못 간 동물
-- 가장 오래 보호소에 있던 동물 3마리 이름, 보호 시작일
-- 보호 시작일 순으로 조회
SELECT NAME, DATETIME
FROM (SELECT NAME, DATETIME
      FROM ANIMAL_INS
      WHERE ANIMAL_ID NOT IN (SELECT ANIMAL_ID
                              FROM ANIMAL_OUTS)
      ORDER BY DATETIME)
WHERE ROWNUM <= 3