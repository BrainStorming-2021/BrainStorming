# https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/

from collections import deque


def solution(A, K):
    if len(A) == 0:  # 배열이 비어있는 경우도 고려.
        return A
    q = deque(A)
    for i in range(K):
        no = q.pop()
        q.appendleft(no)
    return list(q)


print(solution([3, 8, 9, 7, 6], 3))
