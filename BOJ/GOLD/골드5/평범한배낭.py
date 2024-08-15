#https://www.acmicpc.net/problem/12865

N, K = map(int, input().split()) #N:물품의 수, K:총 무게
lst = [(0,0)]
dp = [[0] * (K+1) for _ in range(N+1)] # row는 물건 종류 col은 무게

for _ in range(N) :
    W,V = map(int, input().split())
    lst.append((W,V))

for row in range(1,N+1) :
    for col in range(1,K+1) :
        tmp = col-lst[row][0]
        if tmp >= 0 :
            dp[row][col] = max(dp[row-1][col], dp[row-1][tmp] + lst[row][1])
        else :
            dp[row][col] = dp[row-1][col]

print(dp[N][K])
