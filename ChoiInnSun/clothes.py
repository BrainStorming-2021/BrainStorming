# 체육복
def solution(n, lost, reserve):
    reserve_change = list(set(reserve) - set(lost))
    lost_change = list(set(lost) - set(reserve))

    for i in reserve_change:
        if i - 1 in lost_change:
            lost_change.remove(i - 1)
        elif i + 1 in lost_change:
            lost_change.remove(i + 1)
    return n - len(lost_change)