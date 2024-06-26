# 두 수의 합 : https://school.programmers.co.kr/learn/courses/30/lessons/120891

def solution(order):
    answer = 0
    s = str(order)
    
    for num in range(3,10,3) :
        answer += s.count(str(num))
    return answer