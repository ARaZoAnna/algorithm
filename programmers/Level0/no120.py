#No.120 : 꼬리 문자열 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181841

def solution(str_list, ex):
    answer = ''
    
    for s in str_list :
        if ex in s :
            continue
        answer += s
    
    return answer