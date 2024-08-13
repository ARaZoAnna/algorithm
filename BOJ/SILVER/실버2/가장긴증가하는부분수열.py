# https://www.acmicpc.net/problem/11053
N = int(input())
lst = list(map(int, input().split()))
dp = [-1] * N
#초기값 처리
dp[0] = 1

for idx in range(1,N) :
    best = 0
    for pos in range(idx) :
        if lst[pos] < lst[idx] :
            best = max(best, dp[pos])
    dp[idx] = best + 1

print(max(dp))


#내가 푼 풀이 : 그리디에 가까워 틀린 답.
# N = int(input())
# lst = list(map(int, input().split()))
# answer = []
#
# for idx in range(1,N) :
#     tmp = idx
#     cnt = 0
#     for pos in reversed(range(idx)) :
#         if lst[tmp] > lst[pos] :
#            cnt += 1
#            tmp = pos
#         else :
#             tmp = pos
#     answer.append(cnt)
#
# print(max(answer)+1)
