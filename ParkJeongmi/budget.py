# 프로그래머스 예산
# stack 자료구조 활용
def solution(d, budget):
    d.sort()
    while budget < sum(d):
        d.pop()
    return len(d)