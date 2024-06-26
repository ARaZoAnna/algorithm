#No.108 : 뒤에서 5등까지
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181853

def solution(num_list):
    answer = []
    
    num_list.sort()
    answer = num_list[:5]
    return answer