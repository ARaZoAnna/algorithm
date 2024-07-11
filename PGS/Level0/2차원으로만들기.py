#https://school.programmers.co.kr/learn/courses/30/lessons/120842

def solution(num_list, n):
    answer = []
    l = len(num_list)
    idxStart = 0
    for idx in range(n-1,l,n) :
        print(idx)
        answer.append(num_list[idxStart:idx+1])
        idxStart = idx+1
    return answer
