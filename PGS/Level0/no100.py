#No.100 : 배열의 원소만큼 추가하기
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181861

def solution(arr):
    answer = []
    
    for num in arr :
        for _ in range(num) :
            answer.append(num)
    return answer