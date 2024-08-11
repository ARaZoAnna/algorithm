#https://www.acmicpc.net/problem/11048
#DP top-down 방식 / bottom-up을 추천
import sys
sys.setrecursionlimit(1000000)
# 파이썬의 재귀함수 최대 깊이는 1000이다 이문제에서 나올 수 있는 재귀의 깊이는 1000보다 깊다.
# 재귀 깊이의 제한을 넉넉하게 설정해 주어야 오류가 나지 않는다.
def dp(n,m) :
    if dpTable[n][m] != -1 : # 0이라면
        return dpTable[n][m]

    dpTable[n][m] = max(dp(n-1,m), dp(n,m-1), dp(n-1,m-1)) + candy[n][m]
    return dpTable[n][m]


row, col = map(int, input().split())
#사탕 개수가 들어간 미로 만들기 + row줄 col줄 0으로 추가하기
candy = [[0]+ list(map(int, input().split())) for _ in range(row)]
candy = [[0] * (col+1)] + candy
#메모이제이션 할 DP 테이블 만들기(-1)로 초기화
dpTable = [[-1 for _ in range(col+1)] for _ in range(row+1)]
#dpTable의 row,col 줄 0으로 초기화
for i in range(row+1) :
    dpTable[i][0] = 0
for j in range(col+1) :
    dpTable[0][j] = 0

print(dp(row,col))


#시간 초과가 걸린 나의 코드 
#이유 : 메모이제이션이 전혀 작동하지 않음 계산했던 곳을 또 계산함.. baseCase의 문제..
# def dp(n,m) :
#     if n == 0 or m == 0:
#         return dpTable[n][m]
#
#     # if n < 0 or m < 0 :
#     #     return -1
#
#     dpTable[n][m] = max(dp(n-1,m), dp(n,m-1), dp(n-1,m-1)) + candy[n][m]
#     return dpTable[n][m]
#
#
# row, col = map(int, input().split())
# #사탕 개수가 들어간 미로 만들기
# candy = [list(map(int, input().split())) for _ in range(row)]
# #메모이제이션 할 DP 테이블 만들기
# dpTable = [[0 for _ in range(col)] for _ in range(row)]
# #초기값 설정하기
# dpTable[0][0] = candy[0][0]
# for i in range(1,row) :
#     dpTable[i][0] = dpTable[i-1][0] + candy[i][0]
# for j in range(1,col) :
#     dpTable[0][j] = dpTable[0][j-1] + candy[0][j]
#
# print(dp(row-1,col-1))
