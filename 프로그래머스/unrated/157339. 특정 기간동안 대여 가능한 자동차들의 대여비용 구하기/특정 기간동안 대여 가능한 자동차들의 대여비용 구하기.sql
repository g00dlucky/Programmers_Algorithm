-- 코드를 입력하세요
# CAR_RENTAL_COMPANY_CAR 테이블과 CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블과 CAR_RENTAL_COMPANY_DISCOUNT_PLAN 테이블에서 

# 자동차 종류가 '세단' 또는 'SUV' 인 자동차 중 
# 2022년 11월 1일부터 2022년 11월 30일까지 대여 가능하고 
# 30일간의 대여 금액이 50만원 이상 200만원 미만인 자동차에 대해서 

# 자동차 ID, 자동차 종류, 대여 금액(컬럼명: FEE) 리스트를 출력하는 SQL문을 작성해주세요.
# 결과는 대여 금액을 기준으로 내림차순 정렬하고, 대여 금액이 같은 경우 자동차 종류를 기준으로 오름차순 정렬, 자동차 종류까지 같은 경우 자동차 ID를 기준으로 내림차순 정렬해주세요.

SELECT 
    A.CAR_ID, 
    A.CAR_TYPE, 
    ROUND((A.DAILY_FEE * 30) * (100 - C.DISCOUNT_RATE)/100,0) AS FEE
FROM 
    CAR_RENTAL_COMPANY_CAR AS A
JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY AS B ON A.CAR_ID = B.CAR_ID
JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN AS C ON A.CAR_TYPE = C.CAR_TYPE

#CAR_ID가 해당하는 경우에 없을 때. 즉,이미 빌려간 차량에 해당하지 않을 때 
 WHERE A.CAR_ID NOT IN 
    (SELECT CAR_ID FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
        WHERE START_DATE < '2022-12-01' 
            AND END_DATE > '2022-11-01')
    AND C.DURATION_TYPE = '30일 이상'
   
GROUP BY A.CAR_ID
HAVING FEE >= 500000 AND FEE < 2000000 AND A.CAR_TYPE IN ('세단','SUV')
    
ORDER BY FEE DESC, A.CAR_TYPE ASC, A.CAR_ID DESC;





