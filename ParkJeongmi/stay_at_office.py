# 회사에 있는 사람
'''
4
Baha enter
Askar enter
Baha leave
Artem enter

Askar
Artem
'''

'''
# 시간 초과
num=int(input())
list=[]
for i in range(num):
    name,type=input().split()
    if type=="enter":
        list.append(name)
    else:
        list.remove(name)
else:
    for i in list:
        print(i)
'''
import sys

num=int(sys.stdin.readline())
result={}

for i in range(num):
    name,type=sys.stdin.readline().split()
    if type=="enter":
        result[name]=True
    else:
        del result[name]

print("\n".join(sorted(result.keys(),reverse=True)))

