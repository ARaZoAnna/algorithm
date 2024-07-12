# https://school.programmers.co.kr/learn/courses/30/lessons/120886

def solution(before, after):
    answer = 1
    for s in before :
        if before.count(s) == after.count(s) :
            continue
        answer = 0
        break
    return answer
