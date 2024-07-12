# https://school.programmers.co.kr/learn/courses/30/lessons/120848

def solution(n):
    answer = 0
    result = 1
    num = 1
    while result <= n :
        result *= num
        num += 1
    answer = num-2
    return answer
