#No.122 : 주사위 게임 1
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181839

def solution(a, b):
    answer = 0
    
    if a % 2 == 1 and b % 2 == 1 :
        answer = a**2 + b**2
    elif a % 2 == 0 and b % 2 == 0 :
        answer = abs(a-b)
    else :
        answer = 2 * (a+b)
    
    return answer