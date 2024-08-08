#https://www.acmicpc.net/problem/1182
from itertools import combinations
N, S = map(int, input().split())
lst = list(map(int, input().split()))
answer = 0

for i in range(1,N+1) :
    plus = list(combinations(lst,i))
    for p in plus :
        if sum(p) == S :
          answer += 1

print(answer)
