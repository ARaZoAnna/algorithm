# 대문자와 소문자 : https://school.programmers.co.kr/learn/courses/30/lessons/120893

def solution(my_string):
    answer = ''
    
    for s in my_string : 
        if ord('a') <= ord(s) <= ord('z') :
            answer += chr(ord(s)-ord('a')+ord('A'))
        else :
            answer += chr(ord(s)-ord('A')+ord('a'))
    return answer