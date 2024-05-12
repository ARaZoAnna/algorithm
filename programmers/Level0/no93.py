#No.93 : 공백으로 구분하기2
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181868

def solution(my_string):
    answer = []
    answer = my_string.split(" ")
    while '' in answer :
        answer.remove('')
        
    return answer