-- 코드를 입력하세요 
-- 출고여부: 2022년 5월 1일까지 출고완료로 이 후 날짜는 출고 대기로 미정이면 출고미정
SELECT ORDER_ID, PRODUCT_ID, TO_CHAR(OUT_DATE, 'YYYY-MM-DD') AS OUT_DATE,
       CASE WHEN TO_CHAR(OUT_DATE, 'YYYY-MM-DD') <= '2022-05-01' THEN '출고완료'
       WHEN OUT_DATE IS NULL THEN '출고미정'
       ELSE '출고대기'
       END AS 출고여부
FROM FOOD_ORDER
ORDER BY ORDER_ID