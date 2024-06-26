# 아이스 아메리카노 : https://school.programmers.co.kr/learn/courses/30/lessons/120819

def solution(money):

    americano = money // 5500
    rest = money % 5500
    answer = [americano, rest]
    
    return answer