# 짝수는 싫어요 : https://school.programmers.co.kr/learn/courses/30/lessons/120813

def solution(n):
    answer = []
    
    for num in range(n+1) :
        if num % 2 == 1 :
            answer.append(num)
            
    return answer