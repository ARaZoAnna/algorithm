#No.45 : 주사위 게임3
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181916

def solution(a, b, c, d):
    answer = 0
    origin = [a,b,c,d]
    cnt = list(set(origin))
    
    if len(cnt) == 1 :
        answer = 1111*cnt[0]
    elif len(cnt) == 2 :
        if origin.count(cnt[0]) == 3 :
            answer = (10 * cnt[0] + cnt[1]) **2
        elif origin.count(cnt[1]) == 3 :
            answer = (10 * cnt[1] + cnt[0]) **2
        else :
            answer = (cnt[0]+cnt[1])*abs(cnt[0]-cnt[1])
    elif len(cnt) == 3 :
        for i in range(3) :
            if origin.count(cnt[i]) == 2 :
                cnt.remove(cnt[i])
                break
        answer = cnt[0] * cnt[1]
    elif len(cnt) == 4 :
        answer = min(origin)
    return answer