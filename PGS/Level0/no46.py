#No.46 : 글자 이어 붙여 문자열 만들
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181915

def solution(my_string, index_list):
    answer = ''
    for idx in index_list :
        answer += my_string[idx]
    return answer