# https://school.programmers.co.kr/learn/courses/30/lessons/120896

def solution(s):
    answer = ''
    for str in s :
        if s.count(str) == 1 :
            answer += str
    answer = ''.join(sorted(answer)) 
    return answer
