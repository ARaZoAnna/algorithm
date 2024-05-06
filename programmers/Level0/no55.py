#No.55 : 접두사인지 확인하기
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181906

def solution(my_string, is_prefix):
    answer = 0
    n = len(my_string)
    tmp = []
    
    for i in range(n) :
        tmp.append(my_string[:i+1]) 
    if is_prefix in tmp :
        answer = 1
    else :
        answer = 0
    
    return answer