# 삼각형의 완성조건1 : https://school.programmers.co.kr/learn/courses/30/lessons/120889

def solution(sides):
    answer = 0
    m = max(sides)
    sides.remove(m)
    s = sum(sides)
    if m < s :
        answer  = 1
    else : 
        answer = 2
    return answer