# 세수정렬
# 버블 정렬
num_list=list(map(int,input().split()))
tmp=0
for i in range(len(num_list)):
    for j in range(len(num_list)-i-1):
        if num_list[j]>num_list[j+1]:
            tmp=num_list[j]
            num_list[j]=num_list[j+1]
            num_list[j+1]=tmp

# sorting 함수 사용w
# num_list.sort()

print(num_list[0],num_list[1],num_list[2])



