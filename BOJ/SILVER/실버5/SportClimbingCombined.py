#https://www.acmicpc.net/problem/23246

N = int(input())
note = []
for _ in range(N) :
    num, a, b, c = map(int,input().split())
    mul = a*b*c
    plus = a+b+c
    note.append((mul, plus, num))

answer = sorted(note)

for a,b,c in answer[:3] :
    print(c, end=" ")
