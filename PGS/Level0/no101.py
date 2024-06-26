#No.101 : 빈 배열에 추가, 삭제하기
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181860

def solution(arr, flag):
    answer = []
    n = len(arr)
    
    for idx in range(n) :
        if flag[idx] == 1 :
            repeat = arr[idx]*2
            for _ in range(repeat) :
                answer.append(arr[idx])
            
        elif flag[idx] == 0 :
            for _ in range(arr[idx]) :
                answer.pop()
            
    return answer