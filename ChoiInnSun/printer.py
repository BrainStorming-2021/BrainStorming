# 프린터

'''
중요도가 높은 문서를 먼저 인쇄하는 프린터를 개발
1. 인쇄 대기목록의 가장 앞에 있는 문서를 대기목록에서 꺼낸다
2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한개라도 존재한다면
# J를 대기목록의 가장 마지막에 넣는다.


1. 값이 똑같을 경우 위치 값을 어떻게 기억할 것인가? 

1) 일단 디큐를 활용한 접근은 맞았음.
2) 최댓값을 찾는 것도 맞았음.
'''

from collections import deque


def solution(priorities, location):
    answer = 0
    queue = deque([(v, i) for i, v in enumerate(priorities)])

    while len(queue):
        num = queue.popleft()
        if queue and max(queue)[0] > num[0]:
            queue.append(num)
        else:
            answer += 1
            if num[1] == location:
                break
    return answer
