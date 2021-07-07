# coding=utf-8
# 프로그래머스 - 예산
# 1. 오름차순으로 정렬한다.
# 2. STACK 자료구조를 사용한다.
# 3. 신청금액이 예산보다 많으면 맨위에 있는 신청금액을 pop 한다.
# 4. 신청금액의 길이를 계산해서 return 한다.

def solution(d, budget):
    d.sort()
    while budget < sum(d):
        d.pop()
    return len(d)
