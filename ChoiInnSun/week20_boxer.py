"""
1. 변수정리
weights => 복서 선수들의 몸무게
head2head => 복서 선수들의 전적 => N, W, L
head2head[i] 는 i+1번 복서의 전적을 의미
head2head[i][j]는 i+1번 복서와 j+1번 복서의 매치 결과를 의미
N => 두 복서가 아직 붙어본 적이 없음을 의미.
W => i+1번 복서가 j+1번 복서를 이겼음을 의미
L =>  i+1번 복사가 j+1번 복서에게 졌음을 의미

2. 문제 이해
1) 전체 승률이 높은 복서의 번호가 앞쪽으로 간다. => desc
2) 승률이 동일할 경우, 자신보다 몸무게가 더 나가는 복서를 이긴 횟수가 많으면 앞쪽으로 간다 => 승률 same, 몸무게 기준
3) 2)번도 동일할 경우에는 몸무게가 무거운 사람이 앞으로 간다.
4) 3)번도 동일할 경우에는 작은 번호가 앞으로 간다.

3. 위와 같이 정렬 후, return 한다.

4. HOW?
1)
"""


def solution(weights, head2head):
    boxers = []
    for pair in zip(weights, head2head):
        boxers.append(pair)
    boxers.sort(key=lambda x: str(x[1]).count('W'), reverse=True)
    print(boxers)
    
    answer = []
    return answer


weights1 = [50, 82, 75, 120]
weights2 = [145, 92, 86]
weights3 = [60, 70, 60]

head2head1 = ["NLWL", "WNLL", "LWNW", "WWLN"]
head2head2 = ["NLW", "WNL", "LWN"]
head2head3 = ["NNN", "NNN", "NNN"]

solution(weights1, head2head1)
