#programmers Leve0 No.37 : 수열과 구간쿼리3
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181924
#swap 하는 방법

def solution(arr, queries):
    answer = []
    for i, j in queries :
        arr[i], arr[j] = arr[j], arr[i]
    answer= arr.copy()
    return answer