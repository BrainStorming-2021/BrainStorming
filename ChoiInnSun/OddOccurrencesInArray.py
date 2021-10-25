# 리스트 A가 주어진다. N개의 정수가 있다. 인덱스는 0부터 시작한다. 리스트의 value는 홀수로 이루어져 있다.
# 한 원소 외에, 다른 원소들은 짝이 있음.
# 짝이 없는 걸 return
from collections import Counter

# 내 풀이
from functools import reduce


def solution(A):
    answer = 0
    if len(A) == 1:
        answer = A[0]
    odd = Counter(A)
    for k, v in odd.items():
        if v == 1:
            answer = k


# total score = 66로 다른 코드도 참고
def solution2(A):
    return reduce(lambda x, y: x ^ y, A)
