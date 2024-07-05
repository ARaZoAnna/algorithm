
def solution(num) :
    answer = 0
    lst = [0,0,0,0,0,0,0,0,0]
    s = str(num)

    for tmpS in s :
        if int(tmpS) == 9 :
            lst[6] += 1
            continue
        lst[int(tmpS)] += 1
    if lst[6] % 2 == 1:
        lst[6] = (lst[6] // 2) +1
    else :
        lst[6] = lst[6] // 2
    answer = max(lst)
    return answer
if __name__ == "__main__" :
    num = int(input())
    print(solution(num))
