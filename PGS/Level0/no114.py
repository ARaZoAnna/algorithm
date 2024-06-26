#No.114 : 0 떼기
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181847

def solution(n_str):
    answer = ''
    check = 0
    for n in n_str :
        if n == '0' and check == 0 :
            continue
        check = 1
        answer += n
    return answer