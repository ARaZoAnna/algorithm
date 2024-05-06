#No.53 : 접미사인지 확인하기
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181908

def solution(my_string, is_suffix):
    answer = 0
    tmp = []
    n = len(my_string)
    
    for i in range(n) :
        tmp.append(my_string[i:])
    if is_suffix in tmp :
        answer = 1
    else :
        answer = 0
    return answer