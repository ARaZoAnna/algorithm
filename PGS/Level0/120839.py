#가위 바위 보 : https://school.programmers.co.kr/learn/courses/30/lessons/120839

def solution(rsp):
    answer = ''
    
    for s in rsp :
        if s == '2' :
            answer += '0'
        elif s == '0' :
            answer += '5'
        elif s == '5' :
            answer += '2'
    return answer