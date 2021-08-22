def solution(n, lost, reserve):
    reserve_set = set(reserve)-set(lost)
    lost_set =  set(lost)-set(reserve)
    
    for x in reserve_set:
        if x - 1 in lost_set:
            lost_set.remove(x - 1)
        elif x + 1 in lost_set:
            lost_set.remove(x + 1)
    
    return n - len(lost_set)