# 주사위의 개수 : https://school.programmers.co.kr/learn/courses/30/lessons/120845

def solution(box, n):
    answer = 1
    
    for num in box :
        answer = answer * (num // n)
    return answer