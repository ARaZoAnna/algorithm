#No.61 : 글자 지우기 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181900

def solution(my_string, indices):
    answer = ''
    indices.sort()
    front = 0
    for idx in indices :
        answer += my_string[front:idx]
        front = idx+1
    answer += my_string[front:]
    return answer