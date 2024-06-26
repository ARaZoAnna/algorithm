#No.62 : 카운트 다운 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181899

def solution(start, end_num):
    answer = []
    for num in range(start, end_num-1, -1) :
        answer.append(num)
    return answer
