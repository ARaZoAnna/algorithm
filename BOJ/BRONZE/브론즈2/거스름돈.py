#https://www.acmicpc.net/problem/5585

paid = int(input())

change = 1000 - paid

answer = 0 #잔돈의 개수

#잔돈 500엔의 개수
answer += change // 500
change = change % 500
#잔돈 100엔의 개수
answer += change // 100
change = change % 100
#잔돈 50엔의 개수
answer += change // 50
change = change % 50
#잔돈 10엔의 개수
answer += change // 10
change = change % 10
#잔돈 5엔의 개수
answer += change // 5
change = change % 5
#잔돈 1엔의 개수
answer += change // 1

print(answer)
