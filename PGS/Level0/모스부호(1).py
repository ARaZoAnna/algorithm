# https://school.programmers.co.kr/learn/courses/30/lessons/120838

def solution(letter):
    answer = ''
    splitList = list(letter.split(" "))
    
    morse = ['.-','-...','-.-.','-..','.','..-.',
    '--.','....','..','.---','-.-','.-..',
    '--','-.','---','.--.','--.-','.-.',
    '...','-','..-','...-','.--','-..-',
    '-.--','--..']
    
    for alph in splitList :
        if alph in morse :
            idx = morse.index(alph)
            answer += chr(ord('a') + idx)    
    return answer
