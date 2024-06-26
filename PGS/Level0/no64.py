#No.64 : 리스트 자르기 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181897

def solution(n, slicer, num_list):
    answer = []
    a = slicer[0]
    b = slicer[1]
    c = slicer[2]
    if n == 1 :
        answer = num_list[0:b+1]
    elif n == 2 :
        answer = num_list[a:]
    elif n == 3 :
        answer = num_list[a:b+1]
    elif n == 4 :
        answer = num_list[a:b+1:c]
        
    return answer