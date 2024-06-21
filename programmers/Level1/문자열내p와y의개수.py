
def solution(s):
    answer = True
    p = 0
    y = 0
    str = s.lower()
    for c in str :
        if c == 'p':
            p += 1
        elif c == 'y' :
            y += 1
    
    if p == 0 and y == 0:
        return True
    
    elif p == y :
        return True
    elif p !=  y:
        return False
    else :
        return False
    
 
