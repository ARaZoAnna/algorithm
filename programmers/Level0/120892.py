#암호해독 : https://school.programmers.co.kr/learn/courses/30/lessons/120892

def solution(cipher, code):
    answer = ''
    n = len(cipher)
    
    for s in cipher[code-1::code] :
        answer += s
    
    return answer