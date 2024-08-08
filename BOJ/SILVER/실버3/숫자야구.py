#https://www.acmicpc.net/problem/2503

from itertools import permutations
N = int(input())

#민혁이가 질문한 것들을 담은 리스트
info = [input().split() for _ in range(N)]

#모든 순열 요소들을
answer = 0
for cur in permutations([1,2,3,4,5,6,7,8,9], 3) : #int 형 숫자임
    ok = True
    for num, s, b in info :
        cur_st = cur_bl = 0
        for idx in range(3) :
            if str(cur[idx]) == num[idx] :
                cur_st +=1
            elif str(cur[idx]) in num :
                cur_bl += 1
        if cur_st != int(s) or cur_bl != int(b) :
            ok = False
            break

    if ok :
        answer += 1

print(answer)
