#No.94 : x 사이의 개수
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181867

def solution(myString):
    answer = []
    listed = myString.split("x")
    
    for s in listed :
        answer.append(len(s))
    return answer