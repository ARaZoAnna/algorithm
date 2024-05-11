#No.86 : 배열에서 문자열 대소문자 변환하기
#링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181875

def solution(strArr):
    answer = []
    for idx in range(len(strArr)) :
        if idx % 2 == 1 :
            st = ''
            for s in strArr[idx] :
                if "a" <= s <="z" :
                    tmp = ord("A") +(ord(s)- ord("a"))
                    s = chr(tmp)
                st += s
            answer.append(st)
        elif idx % 2 == 0 :
            st = ''
            for s in strArr[idx] :
                if "A" <= s <= "Z" :
                    tmp = ord("a") + (ord(s)-ord("A"))
                    s = chr(tmp)
                st += s
            answer.append(st)
    return answer