# 피자 나눠먹기(2) : https://school.programmers.co.kr/learn/courses/30/lessons/120815

def solution(n):
    answer = 1
    pizza = 6
    while (pizza % n) != 0 :
        answer += 1
        pizza = 6 * answer
        
        
    return answer