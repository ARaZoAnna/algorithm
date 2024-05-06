#No.51 : 문자열 뒤의 n글자
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181910

def solution(my_string, n):
    answer = ''
    l = len(my_string)
    
    answer = my_string[l-n:l]
    return answer