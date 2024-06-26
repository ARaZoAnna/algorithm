#No.47 : 9로 나눈 나머
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181914

def solution(number):
    answer = 0
    for n in number :
        answer += int(n)
    answer = answer % 9
    return answer