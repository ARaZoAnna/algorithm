#No.126 : 조건에 맞게 수열 변환하기 3
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181835

def solution(arr, k):
    answer = []
    m = 0
    for n in arr :
        if k % 2 == 1 :
            answer.append(n*k)
        else :
            answer.append(n+k)
    return answer