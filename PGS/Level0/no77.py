#No.77 : n보다 커질 때까지 더하기 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181884

def solution(numbers, n):
    answer = 0
    for idx in range(len(numbers)) :
        answer += numbers[idx]
        if answer > n :
            break
    return answer