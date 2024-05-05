#No.49 : 배열 만들기5
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181912

def solution(intStrs, k, s, l):
    answer = []
    for num in intStrs :
        tmp = num[s:s+l]
        if int(tmp) > k :
            answer.append(int(tmp))
    return answer
