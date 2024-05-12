#No.99 : 세 개의 구분자 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181862 

def solution(myStr):
    answer = []
    n = len(myStr)
    point = 0
    for idx in range(n)  :
        if "a" == myStr[idx] :
            if len(myStr[point:idx]) != 0 :
                answer.append(myStr[point:idx])
            point = idx+1
        if "b" == myStr[idx] :
            if len(myStr[point:idx]) != 0 :
                answer.append(myStr[point:idx])
            point = idx+1
        if "c" == myStr[idx] :
            if len(myStr[point:idx]) != 0 :
                answer.append(myStr[point:idx])
            point = idx+1
            
    if point < n :
        answer.append(myStr[point:n])
        
    if len(answer) == 0 :
        answer.append("EMPTY")
    return answer