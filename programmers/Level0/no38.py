#programmers Leve0 No.38 : 수열과 구간쿼리2
#링크 :https://school.programmers.co.kr/learn/courses/30/lessons/181923
#다시풀기
#문제 이해가 잘 안됐음

def solution(arr, queries):
    answer = []
    for s,e,k in queries :
        
        lis = arr[s:e+1]
        lis.sort()
        
        temp = list(filter(lambda x : x>k, lis))
        if len(temp) > 0 :
            answer.append(temp[0])
        else :
            answer.append(-1)
    return answer