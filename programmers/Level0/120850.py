# 문자열 정렬하기 (1) : https://school.programmers.co.kr/learn/courses/30/lessons/120850?language=python3

def solution(my_string):
    answer = []
    for s in my_string :
        if ord("0") <= ord(s) <= ord("9") :
            answer.append(int(s))
    answer.sort()
    return answer