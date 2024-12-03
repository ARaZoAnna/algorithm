#https://school.programmers.co.kr/learn/courses/30/lessons/42839

from itertools import permutations
def solution(numbers):
    answer = []
    lst = []
    s = set()
    for str in numbers :
        lst.append(str)

    n = len(lst)
    for i in range(1, n+1) :
        per = permutations(lst, i)
        #print(list(per))
        for p in per :
            tmp_str = "".join(list(p))
            #print()
            s.add(int(tmp_str))
    print(s)
    # 소수인지 확인하기
    for num in s :
        flag = True
        if num == 0 or num == 1 :
            continue
        for div in range(2,num) :
            if num % div == 0 :
                flag = False
                break
        if flag : answer.append(num)

    result = len(answer)
    print(answer)
    return result
