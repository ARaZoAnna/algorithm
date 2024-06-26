# 모음 제거 : https://school.programmers.co.kr/learn/courses/30/lessons/120849

def solution(my_string):
    li = ["a","e","i","o","u"]
    
    for n in li :
        if n in my_string :
            my_string = my_string.replace(n,"")
    return my_string