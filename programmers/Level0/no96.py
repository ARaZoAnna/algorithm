#No.96 : 간단한 식 계산하기 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181865

def solution(binomial):
    answer = 0
    listed = binomial.split(" ")
    
    
    if listed[1] == "+" :
        answer = int(listed[0])+int(listed[2])
    elif listed[1] == "-":
        answer = int(listed[0])-int(listed[2])
    elif listed[1] == "*":
        answer = int(listed[0])*int(listed[2])
        
    return answer