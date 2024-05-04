#programmers Leve0 No.34 : 마지막 두 원소
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181927

def solution(num_list):
    answer = num_list.copy()
    n = len(num_list)
    
    if answer[n-1] > answer[n-2] :
        answer.append(answer[n-1] - answer[n-2])
    else :
        answer.append(num_list[n-1]*2)
        
    return answer