# 숨어있는 숫자의 덧셈(1) : https://school.programmers.co.kr/learn/courses/30/lessons/120851

def solution(my_string):
    answer = 0
    
    for s in my_string : 
        if '0'<= s <= '9' :
            answer += int(s)
    return answer