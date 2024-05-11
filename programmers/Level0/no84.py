#No.84 : 대문자로 바꾸기 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181877

def solution(myString):
    answer = ''
    for alph in myString :
        tmp = 0
        if "a"<=alph <= "z" :
            tmp = ord("A")+(ord(alph) - ord("a"))
            alph = chr(tmp)
        answer += alph
    return answer