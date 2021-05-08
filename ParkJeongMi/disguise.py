# 위장
import collections
def solution(clothes):
    clothes=dict(clothes)
    new_clothes=[]
    tmp=1

    for i in clothes.values():
        new_clothes.append(i);

    counter = collections.Counter(new_clothes)

    for i in counter.values():
        tmp=tmp*i

    if len(counter)>1:
        answer=tmp+len(new_clothes)
    else:
        answer=tmp
    return answer

