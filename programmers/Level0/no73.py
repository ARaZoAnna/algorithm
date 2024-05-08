#No.73 : n개 간격의 원소들
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181888

def solution(num_list, n):
    answer = num_list[::n]
    return answer