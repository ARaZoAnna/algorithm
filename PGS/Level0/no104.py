#No.104 : 배열의 길이를 2의 거듭제곱으로 만들기
#링크 :https://school.programmers.co.kr/learn/courses/30/lessons/181857

def solution(arr):
    answer = []
    n = len(arr)
    two = 1
    while n > two :
        two = two * 2
    if two > n :
        for _ in range(two-n) :
            arr.append(0)
            
    return arr