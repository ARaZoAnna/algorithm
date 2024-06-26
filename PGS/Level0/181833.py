# 특별한 이차원 배열1 : https://school.programmers.co.kr/learn/courses/30/lessons/181833?language=python3

def solution(n):
    answer = [[0 for _ in range(n) ] for _ in range(n) ]
    
    for i in range(n) :
        for j in range(n) :
            if i == j :
                answer[i][j] = 1
            else :
                answer[i][j] = 0
    return answer