#No.88 : 특정한 문자를 대문자로 만들기 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181873

def solution(my_string, alp):
    answer = ''
    for s in my_string :
        if s == alp :
            s = chr(ord(s)-32)
        answer += s
    return answer