# 짝수 홀수 개수 : https://school.programmers.co.kr/learn/courses/30/lessons/120824

def solution(num_list):

    even = 0
    odd = 0
    for num in num_list : 
        if num % 2 == 1 :
            odd += 1
        elif num % 2 == 0 :
            even += 1
    answer = [even,odd]
        
    return answer