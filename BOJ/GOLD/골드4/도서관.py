#https://www.acmicpc.net/problem/1461
N, M = map(int, input().split())
lst = list(map(int, input().split()))

#양수와 음수를 나누어 리스트에 담는다
pos = []
nag = []
for n in lst :
    if n > 0 :
        pos.append(n)
    else :
       nag.append(-n) #양수로 저장하기(거리만 구하면 되기 때문)

#큰수부터 방문하기 위해 내림 차순으로 정렬
pos = sorted(pos)[::-1]
nag = sorted(nag)[::-1]

#멀리 있는 책부터 방문
visited = []

for p in pos[::M] :
    visited.append(p)

for n in nag[::M] :
    visited.append(n)

print(sum(visited)*2 - max(visited))
