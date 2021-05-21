# 나는 행복합니다.

n,m,k=map(int,input().split())
list=[0]*n
for i in range(n):
    list[i]=(m-1)+(m*i)

for idx,x in enumerate(list):
    if k>x:
        continue
    else:
        print(idx,(m-1)-(x-k))
        break