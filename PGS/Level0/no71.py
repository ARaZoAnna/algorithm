#No.71 : 왼쪽 오른쪽 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181890

def solution(str_list):
    answer = []
    if "l" not in str_list and "r" not in str_list:
        return answer
    for idx in range(len(str_list)) :
        if str_list[idx] == "l" :
            answer = str_list[:idx]
            break
        elif str_list[idx] == "r" :
            answer = str_list[idx+1:]
            break
        
        
    return answer