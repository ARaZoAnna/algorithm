#No.60 : 배열 만들기1
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181901

def solution(n, k):
    answer = []
    tmp = 1
    
    for i in range(1,1000001) :
        tmp = k * i
        if tmp > n :
            break
        answer.append(tmp)
   
    return answer