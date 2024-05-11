#No.89 : 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181872

def solution(myString, pat):
    answer = ''
    n = len(myString)
    m = len(pat)
    last = pat[m-1]
    for idx in reversed(range(n)) :
        if myString[idx] == last :
            ix = idx
            for inx in reversed(range(m)) :
                if myString[ix] != pat[inx] :
                    ix = 0
                    break
                else : 
                    ix -= 1
            if ix == 0 :
                continue
            answer += myString[0:idx+1]
            break
        
    return answer