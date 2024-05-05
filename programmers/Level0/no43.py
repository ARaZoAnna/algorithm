#No.43 : 배열 만들기4
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181918

def solution(arr):
    stk = []
    n = len(arr)
    i = 0
    
    while i < n :
        if len(stk) == 0 :
            stk.append(arr[i])
            i+=1
            continue
        tmp = len(stk)
        if stk[tmp-1] < arr[i] :
            stk.append(arr[i])
            i += 1
            continue
        stk.pop()
              
    return stk