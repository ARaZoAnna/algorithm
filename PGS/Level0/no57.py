#No.57 : 세로 읽기
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181904

def solution(my_string, m, c):
    answer = ''
    tmp = []
    n = len(my_string)
    
    for i in range(0,n,m) :
        answer += my_string[i:i+m][c-1]
    
    for s in tmp :
        answer += s[c-1]
    return answer