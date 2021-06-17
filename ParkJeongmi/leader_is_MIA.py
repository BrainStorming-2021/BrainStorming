# 조장이 사라졌다.
def solution(d):
    cnt=0
    m=5
    while d>0:
        if d%m>=0:
            cnt+=d//m
            d=d%m
        m-=1
    return cnt

d=int(input())
print(solution(d))





