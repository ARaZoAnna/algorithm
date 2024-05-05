#No.50 : 부분 문자열 이어붙여 문자열 만들기
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181911

def solution(my_strings, parts):
    answer = ''
    n = len(my_strings) 
    
    for i in range(n) :
        answer += my_strings[i][parts[i][0]:parts[i][1]+1]
    return answer