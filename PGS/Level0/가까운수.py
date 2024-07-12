# https://school.programmers.co.kr/learn/courses/30/lessons/120890

def solution(array, n):
    answer = 0
    minus = 10000
    for num in array :
        if abs(num-n) == minus :
            if answer > num : answer = num
            continue
        if abs(num-n) < minus :
            minus = abs(num - n)
            answer = num
    return answer
