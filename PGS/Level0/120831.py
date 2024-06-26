# 짝수의 합 : https://school.programmers.co.kr/learn/courses/30/lessons/120831

def solution(n):
    answer = 0
    
    for num in range(n+1) :
        if num % 2 == 0 :
            answer += num
    return answer