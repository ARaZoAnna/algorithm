# 가까운 1 찾기 : https://school.programmers.co.kr/learn/courses/30/lessons/181898

def solution(arr, idx):
    answer = -1
    for i in range(idx,len(arr)) :
        if arr[i] == 1:
            answer = i
            break
    
    return answer