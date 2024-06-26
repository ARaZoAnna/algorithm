# 정사각형으로 만들기 : https://school.programmers.co.kr/learn/courses/30/lessons/181830?language=python3

def solution(arr):
    
    row = len(arr)
    col = len(arr[0])
    
    longSize = 0 
    if col > row :
        longSize = col
    else :
        longSize = row
    
    answer = [[0 for _ in range(longSize)] for _ in range(longSize)]
    
    for i in range(longSize) :
        for j in range(longSize) :
               if i < row and j < col :
                    answer[i][j] = arr[i][j]
              
                                      
                                         
    return answer