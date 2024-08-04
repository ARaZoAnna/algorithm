#https://www.acmicpc.net/problem/6603
def combination(idx, level) :
    if level == r :
        choose.sort()
        for i in range(r) :
            print(choose[i], end=" ")
        print()
        return

    for idx in range(idx,k) :
        choose.append(lst[idx])
        combination(idx+1,level+1)
        choose.pop()

lst = []
r = 6 #로또 뽑는 고정 개수
while True :
    lst = list(map(int,input().split()))
    k = lst[0]
    del lst[0]
    if k == 0 :
        break

    choose = []
    combination(0,0)
    print()
