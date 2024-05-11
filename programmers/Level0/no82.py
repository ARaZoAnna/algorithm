#No.82 : 길이의 따른 연산
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181879

from functools import reduce
def solution(num_list):
    answer = 0
    if len(num_list) >= 11 :
        answer = sum(num_list)
    elif len(num_list) <= 10 :
        answer = reduce(lambda x,y: x*y, num_list)
    return answer