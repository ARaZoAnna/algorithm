#No.76 : 할 일 목록 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181885 

def solution(todo_list, finished):
    answer = []
    for idx in range(len(finished)) :
        if finished[idx] == 0 :
            answer.append(todo_list[idx])
    return answer