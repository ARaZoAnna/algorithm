#No.59 : 문자 개수 세기 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181902

def solution(my_string):
    answer = [0] * 52
    
    for s in my_string :
        if ord('A') <= ord(s) <= ord('Z') :
            answer[ord(s)-ord('A')] += 1
        else :
            answer[ord(s)-ord('a')+26] += 1
            
    return answer