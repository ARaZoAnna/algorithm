# 가장 큰 수 찾기 : https://school.programmers.co.kr/learn/courses/30/lessons/120899

def solution(array):
    
    n = len(array)
    m = 0
    midx = -1
    for idx in range(n) :
        if array[idx] > m :
            m = array[idx]
            midx = idx
    answer = [m, midx]
    return answer