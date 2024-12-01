def solution(brown, yellow):
    answer = []
    for i in range(1, yellow+1) :
        if yellow % i == 0 :
            a = yellow // i
            b = i
            if (a * 2) + (b * 2) + 4 == brown :
                answer.append(a+2)
                answer.append(b+2)
                break
    answer.sort(reverse = True)
    return answer
