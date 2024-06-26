#No.67 : 2의 영역 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181894

def solution(arr):
    answer = []
    start = -1
    end = -1
    for idx in range(len(arr)) :
        if arr[idx] == 2 :
            if start == -1 :
                start = idx
            else :
                end = idx
    if start == -1 :
        answer.append(-1)
    elif end == -1 :
        answer.append(arr[start])
    else:
        answer = arr[start:end+1]
    return answer