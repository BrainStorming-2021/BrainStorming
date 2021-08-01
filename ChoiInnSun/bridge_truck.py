# 다리를 지나는 트럭
# https://programmers.co.kr/learn/courses/30/lessons/42583

# 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 한다.
# 다리에 올라갈 수 있는 트럭 수 bridge_length
# 다리가 견딜 수 있는 무게 weight
# 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 한다.
from collections import deque


def solution(bridge_length, weight, truck_weights):
    answer = 0
    ongoing = [0] * bridge_length
    while ongoing:
        answer += 1
        ongoing.pop(0)
        if truck_weights:
            if sum(ongoing) + truck_weights[0] <= weight:  # 초과하지 않을 시 다리에 트럭을 올림
                ongoing.append(truck_weights.pop(0))
            else:
                ongoing.append(0)  # 중량 초과를 하면 다리에 트럭을 올리지 않음
    return answer


solution(2, 10, [7, 4, 5, 6])
