# 양꼬치 : https://school.programmers.co.kr/learn/courses/30/lessons/120830

def solution(n, k):
    answer = 0
    service = 0
    service = n // 10
    answer = n * 12000 + (k-service) * 2000
    return answer