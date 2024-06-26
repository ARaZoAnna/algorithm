#No.107 : 배열의 길이에 따라 다른 연산하기
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181854

def solution(arr, n):
    answer = []
    k = len(arr)
    
    for idx in range(k) :
        if k%2 == 1 and idx % 2 == 0 :
            arr[idx] += n
        elif k%2 == 0 and idx % 2 ==1 :
            arr[idx] += n
    
    return arr