#https://www.acmicpc.net/problem/1026
N = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

tmpA = sorted(A)
tmpB = sorted(B, reverse=True)

answer = 0
for idx in range(N) :
    answer += tmpA[idx] * tmpB[idx]

print(answer)
