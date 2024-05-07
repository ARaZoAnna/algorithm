#No.70 : 순서 바꾸기 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181891

def solution(num_list, n):
    answer = num_list[n:] + num_list[:n]

    return answer