#No.103 : 무작위로 K의 개수 뽑기 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181858

def solution(arr, k):
    answer = []
    cnt = 0
    for n in arr :
        if n in answer :
            continue
        elif cnt < k :
            cnt += 1
            answer.append(n)
    if cnt < k :
        for _ in range(k-cnt) :
            answer.append(-1)
        
    return answer