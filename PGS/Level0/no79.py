#No.79 : 조건에 맞게 수열 변환하기 1 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181882

def solution(arr):
    answer = []
    for num in arr :
        if num >= 50 and num % 2 == 0 :
            answer.append(num // 2)
        elif num < 50 and num % 2 == 1 :
            answer.append(num * 2)
        else :
            answer.append(num)
    return answer