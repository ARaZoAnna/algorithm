#programmers Leve0 No.36 : 수 조작하기2 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181925
def solution(numLog):
    answer = ''
    l = len(numLog) - 1
    for n in range(l,0, -1) : #뒤에서 부터 계산
        temp = numLog[n]-numLog[n-1]
        if temp == 1 :
            answer+= "w"
        elif temp == -1 :
            answer+="s"
        elif temp == 10 :
            answer+="d"
        elif temp == -10 :
            answer+="a"

    answer = ''.join(reversed(answer))
    return answer