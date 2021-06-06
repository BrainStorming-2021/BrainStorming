# 프로그래머스 - 레벨 2 - H-index
def solution(citations):
    citations.sort()
    cnt = len(citations)
    for i in range(cnt):
        print(citations[i], ' >>> ', cnt - i)
        if citations[i] >= cnt - i:
            # 논문이 인용된 횟수(h번 이상) >= 인용된 논문의 개수(h개 == h번)
            return cnt - i
    return 0


print(solution([0, 1, 3, 5, 6, 6, 6, 6, 6]))
