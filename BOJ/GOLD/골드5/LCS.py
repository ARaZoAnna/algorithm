#https://www.acmicpc.net/problem/9251

str1 = ' ' +input()
str2 = ' ' +input()

row = len(str1)
col = len(str2)

dp = [[0 for _ in range(col)] for _ in range(row)]

for idxC in range(1, col) :
    for idxR in range(1, row) :
        if str2[idxC] == str1[idxR] :
            dp[idxR][idxC] = dp[idxR-1][idxC-1] + 1
        else :
            dp[idxR][idxC] = max(dp[idxR-1][idxC], dp[idxR][idxC-1])

print(dp[row-1][col-1])
