from collections import deque
def solution(num):
    stack = []
    x = deque([seq+1 for seq in range(num)])
    for loop in range(len(x)):
        try :
            stack = x.popleft()
            print(stack)
            x.append(x.popleft())  
        except :
            return 1;

solution(7)
#solution(9)
#solution(10)
#solution(6)