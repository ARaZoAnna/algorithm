#No.109 : 뒤에서 5등 위로
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181852

def solution(num_list):
    answer = []
    num_list.sort()
    answer = num_list[5:]
    return answer