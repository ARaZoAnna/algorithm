#No.112 : 문자열 정수의 합
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181849

def solution(num_str):
    answer = 0
    for s in num_str :
        answer += int(s)
    return answer