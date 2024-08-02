#https://www.acmicpc.net/problem/4779
def recursive(n) :
    if n == 1 :
        return "-"
    left = recursive(n//3)
    center = " "*(n//3)
    return left + center + left

while True :
    try :
        N = int(input())
        answer = recursive(3**N)
        print(answer)
    except :
        break
