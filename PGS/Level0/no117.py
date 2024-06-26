#No.117 : 배열의 원소 삭제하기
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181844

def solution(arr, delete_list):
    answer = []

    for n in delete_list :
        if n in arr :
            arr.remove(n)
    
    return arr