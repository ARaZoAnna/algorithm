#No.95 : 문자열 잘라서 정렬하기 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181866

def solution(myString):
    answer = []
    answer = myString.split("x")
    while '' in answer :
        answer.remove('')
    answer.sort()
    
    return answer