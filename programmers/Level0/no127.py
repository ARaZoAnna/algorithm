#No.127 : l로 만들기
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181834

def solution(myString):
    answer = ''
    l = 'l'
    for s in myString :
        if ord(s) < ord(l) :
            answer+= l
            continue
        answer+= s
    return answer