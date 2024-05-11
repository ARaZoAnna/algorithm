#No.80 : 조건에 맞게 수열 변환하기 2 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181881

def solution(arr):
    answer = 0
    
    for num in arr  :
        cnt = 0
        if num >= 50 and num % 2 == 0 :
            while num>= 50 :
                num = num // 2
                cnt += 1
            
        elif num < 50 and num % 2 == 1:
            while num < 50 :
                num = num * 2 +1
                cnt += 1
            
        answer = max(answer,cnt)
    return answer