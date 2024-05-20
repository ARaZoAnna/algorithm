#자릿수 더하기 : https://school.programmers.co.kr/learn/courses/30/lessons/120906

def solution(n):
    answer = 0
    div = 100000
    if n == 1000000 :
        n += 1
        n = n % 1000000
    
    while div != 0 :
        if n >= div :
            answer += n // div
            n = n % div
        div = div // 10
    
    
    return answer