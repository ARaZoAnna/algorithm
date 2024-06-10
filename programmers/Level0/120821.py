# 배열 뒤집기 : https://school.programmers.co.kr/learn/courses/30/lessons/120821

def solution(num_list):
    answer = []
    l = len(num_list)-1
    n = len(num_list) // 2
    
    for i in range(n) :
        num_list[i], num_list[l-i] = num_list[l-i], num_list[i]
    return num_list