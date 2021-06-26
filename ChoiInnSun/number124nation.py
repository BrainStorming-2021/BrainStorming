# 124 나라의 숫자
"""
1. 자연수만 존재한다.
2. 모든 수를 표현할 때 1,2,4 만 사용한다.
"""


def solution(n):
    answer = ''
    while n > 0:
        if n % 3 == 0:
            answer = '4' + answer
            n = int(n / 3) - 1
        else:
            answer = str(n % 3) + answer
            n = int(n / 3)

    return answer
