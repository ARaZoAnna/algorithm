#programmers Leve0 No.35 : 수 조작하기 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181926
def solution(n, control):
    answer = 0
    for c in control :
        if c == "w" :
            n += 1
        elif c == "s" :
            n -= 1
        elif c == "d" :
            n += 10 
        elif c == "a" :
            n -= 10
    answer = n
    return answer