# 인덱스 바꾸기 : https://school.programmers.co.kr/learn/courses/30/lessons/120895

def solution(my_string, num1, num2):
    answer = ''
    l = len(my_string)
    
    for idx in range(l) :
        if idx == num1 :
            answer += my_string[num2]
        elif idx == num2 :
            answer += my_string[num1]
        else :
            answer += my_string[idx]
    return answer