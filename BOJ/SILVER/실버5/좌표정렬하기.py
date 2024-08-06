#https://www.acmicpc.net/problem/11650

N = int(input())
lst = []

for _ in range(N) :
    x, y = map(int, input().split())
    lst.append((x,y))

answer = sorted(lst)

for x, y in answer :
    print(str(x) + " " + str(y))

