#https://www.acmicpc.net/problem/1912

n = int(input())

lst = list(map(int, input().split()))

dp = [0] * n

dp[0] = lst[0]

for idx in range(1,n) :
    dp[idx] = max(dp[idx-1] + lst[idx], lst[idx])

print(max(dp))
