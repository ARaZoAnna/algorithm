#No.44 : 간단한 논리 연산
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181917

def solution(x1, x2, x3, x4):
    answer = True
    answer = (x1 or x2) and (x3 or x4)
    return answer