#No.56 : 문자열 뒤집기
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181905

def solution(my_string, s, e):
    answer = ''
    n = len(my_string)
    answer = my_string[:s] + my_string[e-n:s-n-1:-1] + my_string[e+1:]
    return answer

    