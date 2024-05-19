# 배열의 평균값 : https://school.programmers.co.kr/learn/courses/30/lessons/120817

def solution(numbers):
    answer = 0
    n = len(numbers)
    result = 0
    for num in numbers :
        result += num
    result = float(result) / float(n)
    answer = '%.1f' %result  
    return answer