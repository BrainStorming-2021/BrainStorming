from collections import deque

# 큐 자료구조 사용
def solution(progresses, speeds):
    answer = []
    # 주어진 두 리스트를 deque로 변환
    progresses = deque(progresses)
    speeds = deque(speeds)
    # 모든 기능이 완료될 때 까지 반복
    while progresses:
        # 기능 카운트
        cnt = 0
        # 작업 개수만큼
        # progresses에 하나씩 접근하여 speeds 더하기
        for i in range(len(progresses)):
            # 100보다 큰 경우 넘어가기
            if progresses[i] >= 100:
                break
            # 개발속도를 더한다.
            progresses[i] = progresses[i] + speeds[i]
        # 맨 앞의 기능이 100 이상이면 완료 처리, while로 맨무조건 popleft 처리
        while progresses[0] >= 100:
            progresses.popleft()
            speeds.popleft()
            cnt += 1
            # progresses가 비어 있을 경우에는 break
            if not progresses:
                break
        # answer에 기록
        if cnt > 0:
            answer.append(cnt)
    return answer