#https://www.acmicpc.net/problem/10974

N = int(input())
choose= []
check = [False] * N

lst = []
for n in range(1, N+1) :
    lst.append(n)
def permutation(level) :
    if level == N :
        print(' '.join(map(str,choose)))
        return

    for i in range(0, N) :
        if check[i] == True :
            continue

        choose.append(lst[i])
        check[i] = True

        permutation(level+1)

        check[i] = False
        choose.pop()

permutation(0)

#라이브러리 사용
# from itertools import permutations

# N = int(input())
# choose= []
# check = [False] * N

# lst = []
# for n in range(1, N+1) :
#     lst.append(n)

# answer = permutations(lst,N)

# for a in answer :
#     print(' '.join(map(str, a)))
