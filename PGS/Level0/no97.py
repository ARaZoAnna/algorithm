#No.97 : 문자열 바꿔서 찾기 
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181864

def solution(myString, pat):
    answer = 0
    st = ""
    for s in pat :
        if s == "A" :
            st += "B"
        elif s == "B" :
            st += "A"
    
    if st in myString :
        answer = 1
    else :
        answer = 0