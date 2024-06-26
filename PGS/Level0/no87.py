#No.87 : A 강조하기
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181874

def solution(myString):
    answer = ''
    for alph in myString :
        if alph == "a" :
            alph = "A"
        elif "B" <= alph <= "Z" :
            alph = chr(ord(alph)+32)
        answer += alph
    return answer