#No.91 : ad제거하기 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181870

def solution(strArr):
    answer = []
    for s in strArr :
        if "ad" in s :
            continue
        else :
            answer.append(s)
    return answer