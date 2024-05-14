#No.102 : 배열 만들기 6
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181859

def solution(arr):
    answer = []
    n = len(arr)
    
    for i in range(n) :
        if len(answer) == 0 :
            answer.append(arr[i])
            continue
        last = answer.pop()
        if last == arr[i] :
            continue
        elif last != arr[i] :
            answer.append(last)
            answer.append(arr[i])
            continue
    if len(answer) == 0 :
        answer.append(-1)
    return answer