def solution(n, lost, reserve):
    answer = 0
    new_lost =list(set(lost) - set(reserve))
    new_reserve=set(reserve) - set(lost)
    for i in new_lost:
       if i -1 in new_reserve:
           new_reserve.remove(i - 1)
       elif i +1 in new_reserve:
           new_reserve.remove(i + 1)
       else:
           n=n-1

    else:
        answer=n
        return answer
'''
참고 풀이법 
def solution(n, lost, reserve):
    _reserve = [r for r in reserve if r not in lost]
    _lost = [l for l in lost if l not in reserve]
    for r in _reserve:
        f = r - 1
        b = r + 1
        if f in _lost:
            _lost.remove(f)
        elif b in _lost:
            _lost.remove(b)
    return n - len(_lost)
'''