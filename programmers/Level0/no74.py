#No.74 : 홀수 vs 짝
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181887

def solution(num_list):
    answer = 0
    even = 0
    odd = 0
    for idx in range(len(num_list)) :
        if (idx+1) % 2 == 0 :
            even += num_list[idx]
        elif (idx+1) % 2 == 1:
            odd += num_list[idx]
    answer = max(odd, even)
    return answer