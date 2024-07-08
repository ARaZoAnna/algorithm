from collections import deque
import sys
import re
if __name__ == "__main__" :
    testCase = int(input())

    for _ in range(testCase) :
        func_str = sys.stdin.readline().rstrip()
        length  = int(input())
        deq = deque(sys.stdin.readline().rstrip()[1:-1].split(","))
        if length == 0:
            deq = []
        count_R = 0 #reverse 개수
        for str in func_str :
            if str == "R" :
                count_R += 1
            elif str == "D" :
                if len(deq) == 0 :
                    break
                if count_R % 2 == 1 :
                    deq.pop()
                else :
                    deq.popleft()

        if len(deq) == 0 :
            print("error")
        else :
            if count_R % 2 == 1 :
                deq.reverse()
            print("[" + ",".join(deq) + "]")

#정답

# import sys
# from collections import deque

# t = int(input())

# for i in range(t):
#     p = sys.stdin.readline().rstrip()
#     n = int(input())
#     arr = sys.stdin.readline().rstrip()[1:-1].split(",")
#     queue = deque(arr)

#     rev, front, back = 0, 0, len(queue)-1
#     flag = 0
#     if n == 0:
#         queue = []
#         front = 0
#         back = 0

#     for j in p:
#         if j == 'R':
#             rev += 1
#         elif j == 'D':
#             if len(queue) < 1:
#                 flag = 1
#                 print("error")
#                 break
#             else:
#                 if rev % 2 == 0:
#                     queue.popleft()
#                 else:
#                     queue.pop()
#     if flag == 0:
#         if rev % 2 == 0:
#             print("[" + ",".join(queue) + "]")
#         else:
#             queue.reverse()
#             print("[" + ",".join(queue) + "]")
