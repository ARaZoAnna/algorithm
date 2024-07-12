#https://school.programmers.co.kr/learn/courses/30/lessons/120835

def solution(emergency):
    n = len(emergency)
    answer = [0] * n
    tmp = []
    
    for idx in range(n) :
        tmp.append((emergency[idx],idx))
    tmp.sort(reverse = True)
    for rank in range(n) :
        answer[tmp[rank][1]] = rank+1
        
                   
    return answer
