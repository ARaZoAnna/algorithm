#https://www.acmicpc.net/problem/1759

from itertools import combinations
r, n = map(int, input().split())
lst = list(map(str, input().split()))

result = list(combinations(sorted(lst),r))

for tmp in result :
    jaum_count = 0 #자음개수
    moum_count = 0 #모음개수(a e i o u)

    for s in tmp :
        if s in 'aeiou' :
            moum_count += 1
        else :
            jaum_count += 1

    if moum_count >= 1 and jaum_count >=2 :
        for d in tmp :
            print(d, end="")
        print()


# count = 0
# def combination(idx, level) :
#
#     if level == r :
#         choose.sort()
#         count = 0
#         for s in choose :
#             if s in check :
#                 count += 1#모음의 개수
#         #print(count)
#         if count >= 1 and (r-count) >= 2 :
#             for s in choose :
#                 print(s, end=" ")
#         print()
#         #print(choose)
#         return
#
#     for i in range(idx,n) :
#         choose.append(lst[i])
#         combination(i+1,level+1)
#         choose.pop()
#
# check = ['a','e','i','o','u']
#
# r, n = map(int, input().split())
# lst = list(map(str, input().split()))
# choose = []
# combination(0,0)
