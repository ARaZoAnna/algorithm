#No.68 : 배열조각하
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181893

def solution(arr, query):
    answer = arr[:]
    
    for idx in range(len(query)) :
        if idx % 2 == 0 :
            answer = answer[:query[idx]+1]
        elif idx % 2 == 1 :
            answer = answer[query[idx]:]
    return answer