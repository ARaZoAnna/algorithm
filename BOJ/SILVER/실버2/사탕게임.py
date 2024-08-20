#https://www.acmicpc.net/problem/3085

#연속된 캔디 개수 확인
def countCandy() :
    global lst

    best = 0
    #좌우 검수
    for r in range(N) :
        bef = '-'
        cnt = 0
        for c in range(N) :
            if lst[r][c] == bef :
                cnt += 1
            else :
                cnt = 1
            best = max(best, cnt)
            bef = lst[r][c]
    #상하 검수
    for c in range(N) :
        bef = '-'
        cnt = 0
        for r in range(N) :
            if lst[r][c] == bef :
                cnt += 1
            else :
                cnt = 1
            best = max(best, cnt)
            bef = lst[r][c]
    return best

rn = [0,1]
cn = [1,0]
answer = 0

N = int(input())
lst = []
for _ in range(N) :
    lst.append(list(input()))

#오른쪽, 아래 검사
for curR in range(N) :
    for curC in range(N) :
        for dir in range(2) :
            nextR = curR + rn[dir]
            nextC = curC + cn[dir]
            #범위를 벗어나지 않게 인덱스 검사
            if nextR < 0 or nextR >= N or nextC < 0 or nextC >= N :
                continue
            if lst[curR][curC] != lst[nextR][nextC] :
                # 서로 다른 캔디 바꾸기
                lst[curR][curC], lst[nextR][nextC] = lst[nextR][nextC], lst[curR][curC]
                answer = max(answer,countCandy())
                lst[curR][curC], lst[nextR][nextC] = lst[nextR][nextC], lst[curR][curC]
print(answer)
