#No.48 : 문자열 여러번 뒤집기
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181913

def solution(my_string, queries):
    answer = ''
    n = len(my_string)
    for s,e in queries :
        my_string = my_string[0:s] + my_string[e:s:-1] + my_string[s] + my_string[e+1:n]
    
    return my_string