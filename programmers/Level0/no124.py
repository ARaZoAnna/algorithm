#No.124 : 커피 심부름
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181837 

def solution(order):
    answer = 0
    
    for s in order :
        if "americano" in s :
            answer += 4500
        elif "cafelatte" in s :
            answer += 5000
        elif "anything" in s :
            answer += 4500
    return answer