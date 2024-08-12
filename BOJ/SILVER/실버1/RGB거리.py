#https://www.acmicpc.net/problem/1149
N = int(input())
color = []
for _ in range(N) :
    color.append(list(map(int, input().split())))

dp = [[0 for _ in range(3)] for _ in range(N)]

#초기값 설정
for i in range(3) :
    dp[0][i] = color[0][i]

for house in range(1,N) :
    for c in range(3) :
        if c == 0 :
            dp[house][c] = min(dp[house-1][1],dp[house-1][2]) + color[house][c]
        if c == 1 :
            dp[house][c] = min(dp[house-1][0], dp[house-1][2]) + color[house][c]
        if c == 2 :
            dp[house][c] = min(dp[house-1][0], dp[house-1][1]) + color[house][c]

print(min(dp[N-1]))
