#programmers Leve0 No.39 : 수열과 구간쿼리4
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181922
#다시 풀기

def solution(arr, queries):
    for s, e, k in queries:
        for i in range(s,e+1) :
            if i % k == 0 :
                arr[i] += 1
        
    return arr