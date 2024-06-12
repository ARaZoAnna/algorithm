# 배열 회전하기 : https://school.programmers.co.kr/learn/courses/30/lessons/120844

from collections import deque;

def solution(numbers, direction):
    answer = []
    n = len(numbers)
    if direction == "right" :
        answer.append(numbers[n-1])
        for idx in range(n-1) :
            answer.append(numbers[idx])
    
    elif direction == "left" : 
        for idx in range(1,n) :
            answer.append(numbers[idx])
        answer.append(numbers[0])    
    return answer