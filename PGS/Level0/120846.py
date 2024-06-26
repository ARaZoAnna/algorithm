# 합성수 찾기 : https://school.programmers.co.kr/learn/courses/30/lessons/120846

def solution(n):
    answer = 0
    cnt = 0
    for num in range(1, n+1) :
        for num2 in range(1,num+1) :
            if num % num2 == 0 :
                cnt += 1
        if cnt >= 3 :
            answer += 1
        cnt = 0
    return answer