#No.81 : 1로 만들기 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181880

def solution(num_list):
    answer = 0
    for num in num_list :
        cnt = 0
        while num >1 :
            if num % 2 == 0 :
                num = num // 2
            else :
                num = (num-1)//2
            cnt += 1
        answer += cnt
    return answer