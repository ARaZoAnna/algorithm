def solution(lst) :
    #두번째 원소로 오름차순하기
    lst.sort(key=lambda x:(x[1],x[0]))
    point = lst[0][1]
    cnt = 1
  #인덱스 1부터 순회
    for start, end in lst[1:] :
        if start >= point :
            point = end
            cnt += 1

    return cnt
if __name__ == "__main__" :
    n = int(input())
    lst = []
    while n > 0 :
        a,b = map(int, input().split())
        lst.append((a,b))
        n -= 1
    print(solution(lst))
