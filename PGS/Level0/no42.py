#programmers Leve0 No.42 : 콜라츠 수열 만들기
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181919

def solution(n):
    answer = []
    answer.append(n)
    
    while n != 1 :
        if n % 2 == 0 :
            n = n // 2
        else :
            n = 3 * n + 1
        answer.append(n)
        
    return answer