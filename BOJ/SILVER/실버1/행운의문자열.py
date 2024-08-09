#https://www.acmicpc.net/problem/1342
from itertools import permutations

s = input() # str로 받는다
n = len(s) # 입력의 길이
answer = 0

def factorial(c) :
    if c == 0 :
        return 1
    return factorial(c-1) *c

for st in permutations(s,n) :
    ok = True
    for idx in range(0,n-1) :
        if st[idx] == st[idx+1] :
            ok = False
    if ok :
        answer += 1 #연속된 문자가 같지 않으면 카운팅

for i in range(ord('a'),ord('z')+1) :
    answer //= factorial(s.count(chr(i)))

print(answer)
