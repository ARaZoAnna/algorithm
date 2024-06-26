#No.58 : qr code
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181903

def solution(q, r, code):
    answer = ''
    n = len(code)
    
    for idx in range(n) :
        if idx % q == r :
            answer += code[idx]
    return answer