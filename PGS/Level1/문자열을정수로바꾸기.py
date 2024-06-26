def solution(s):
    answer = 0
    n = len(s)

    if s[0] =='-' :
        answer = -int(s[1:n])
    else :
        answer = int(s)
        
    return answer