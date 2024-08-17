def check(startR, startC) :
    global chess, collectW, collectB
    checkWhite = 0
    checkBlack = 0

    for r in range(startR,startR+8) :
        for c in range(startC,startC+8) :
            if chess[r][c] != collectW[r-startR][c-startC] :
                checkWhite += 1
            if chess[r][c] != collectB[r-startR][c-startC] :
                checkBlack += 1
    return min(checkWhite, checkBlack)


row, col = map(int, input().split())

chess = []

collectW = ['WBWBWBWB','BWBWBWBW','WBWBWBWB','BWBWBWBW','WBWBWBWB','BWBWBWBW','WBWBWBWB','BWBWBWBW']
collectB = ['BWBWBWBW','WBWBWBWB','BWBWBWBW','WBWBWBWB','BWBWBWBW','WBWBWBWB','BWBWBWBW','WBWBWBWB']

for _ in range(row) :
    s = input()
    chess.append(s)
answer = 100000

#좌표를 하나씩 체크하기 위해
for moveR in range(row-7) :
    for moveC in range(col-7) :
        tmp = check(moveR, moveC)
        if answer > tmp :
            answer = tmp

print(answer)
