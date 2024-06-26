#No.105 : 배열 비교하기
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181856

def solution(arr1, arr2):
    answer = 0
    an = len(arr1)
    bn = len(arr2)
    
    if an == bn :
        if sum(arr1) > sum(arr2) :
            answer = 1
        elif sum(arr1) < sum(arr2) :
            answer = -1
        else : 
            answer = 0
    else :
        if an > bn :
            answer = 1
        elif an < bn :
            answer = -1
    return answer