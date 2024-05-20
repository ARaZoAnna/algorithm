# 제곱수 판별하기 : https://school.programmers.co.kr/learn/courses/30/lessons/120909

def solution(n):
    answer = 0
    num = n ** (1/2)
    if num % 1 == 0 :
        answer = 1
    else : 
        answer = 2
    return answer