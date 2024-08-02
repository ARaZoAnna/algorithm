#https://www.acmicpc.net/problem/10870
def recursive(n) :
    if n <= 1 :
        return n
    return recursive(n-2) + recursive(n-1)

n = int(input())

print(recursive(n))

