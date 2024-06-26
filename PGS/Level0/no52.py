#No.52 : 접미사 배열
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181909

def solution(my_string):
    answer = []
    n = len(my_string)
    for i in range(n) :
        answer.append(my_string[i:])
    answer.sort()
    return answer