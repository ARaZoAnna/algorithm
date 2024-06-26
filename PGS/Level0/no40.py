#programmers Leve0 No.40 : 배열 만들기 2
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181921
# 다시보기

def solution(l, r):
    answer = []
    while l<=r :
        temp = l
        togle = 1
        if temp // 100000 != 0 and temp // 100000 != 5 :
            togle = 0
            l+=1
            continue
        temp = temp % 100000
        if temp // 10000 != 0 and temp // 10000 != 5 :
            togle = 0
            l+=1
            continue
        temp = temp % 10000
        if temp // 1000 != 0 and temp // 1000 != 5 :
            togle = 0
            l+=1
            continue
        temp = temp % 1000
        if temp // 100 != 0 and temp // 100 != 5 :
            togle = 0
            l+=1
            continue
        temp = temp % 100
        if temp // 10 != 0 and temp // 10 != 5 :
            togle = 0
            l+=1
            continue
        temp = temp % 10
        if temp // 1 != 0 and temp // 1 != 5 :
            togle = 0
            l+=1
            continue
        answer.append(l)
        l+=1
        
    if len(answer) == 0 :
        answer.append(-1)
    return answer