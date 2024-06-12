# 최대값 만들기(1) : https://school.programmers.co.kr/learn/courses/30/lessons/120847

def solution(numbers):
    answer = 0
    l = len(numbers)
    numbers.sort();
    answer = numbers[l-1] * numbers[l-2]
    return answer