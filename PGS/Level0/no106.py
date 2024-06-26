#No.106 : 문자열 묶기
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181855

def solution(strArr):
    answer = 0
    l = [0] * 31
    for s in strArr :
        if l[len(s)] == 0 :
            l[len(s)] = 1
        else :
            l[len(s)] += 1
    answer = max(l)
    return answer