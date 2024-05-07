#No.65 : 첫번째로 나오는 음수 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181896

def solution(num_list):
    answer = -1
    
    for idx in range(len(num_list)) :
        if num_list[idx] < 0 :
            answer = idx
            break
    return answer