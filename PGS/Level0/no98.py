#No.98 : rny_string
#링크 :https://school.programmers.co.kr/learn/courses/30/lessons/181863

def solution(rny_string):
    answer = ''
    n = len(rny_string)
    point = 0
    
    for idx in range(n) :
        if rny_string[idx]  == "m" :
            
            answer += rny_string[point:idx] + "rn"
            point = idx+1
    if point < n :
        answer += rny_string[point:n]
    return answer