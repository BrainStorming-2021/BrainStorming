def solution(S):
    dic = {'}': '{',
           ']': '[',
           ')': '('
           }
    stack = []
    for i in S:
        if i in '({[':
            stack.append(i)
        elif i in ')}]':
            if stack:
                curr = stack.pop()  # (
                if dic[i] != curr:
                    return 0
            else:
                return 0
    return 1


number = '{[()()]}'
number2 = '([)()]'
a = solution(number2)
print(a)
