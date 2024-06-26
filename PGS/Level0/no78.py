#No.78 : 수열과 구간 쿼리1
#링크 :https://school.programmers.co.kr/learn/courses/30/lessons/181883

def plus(x) :
    return x+1

def solution(arr, queries):

    for s,e in queries :
        arr = arr[:s] + list(map(plus,arr[s:e+1])) + arr[e+1:]
    
    return arr