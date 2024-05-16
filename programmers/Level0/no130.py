#No.130 : 특별한 이차원 배열 2
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181831

def solution(arr):
    answer = 1
    n = len(arr)
    for i in range(n) :
        for j in range(n) :
            if arr[i][j] != arr[j][i] :
                answer = 0
    return answer
