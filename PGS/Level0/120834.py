# 외계행성의 나이 : https://school.programmers.co.kr/learn/courses/30/lessons/120834

def solution(age):
    answer = ''
    s = str(age)
    
    for num in s :
        answer += chr(ord("a") + int(num))
    return answer