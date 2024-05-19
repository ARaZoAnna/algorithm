# 중앙값 구하기 : https://school.programmers.co.kr/learn/courses/30/lessons/120811

def solution(array):
    answer = 0
    array.sort()
    n = len(array)
    n = n //2               
    answer = array[n]
    return answer