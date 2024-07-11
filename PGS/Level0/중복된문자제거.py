#https://school.programmers.co.kr/learn/courses/30/lessons/120888

def solution(my_string):
    answer = ''
    n = len(my_string)
    for idx in range(n) :
        if my_string[idx] in my_string[:idx] :
            continue
        answer += my_string[idx]
    return answer
