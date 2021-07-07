# 15727 - 조별과제를 하려는데 조장이 사라졌다.
# 분류 - 수학, 사직연산
# 집까지의 거리 입력받기

# 문제 잘못이해해서 틀
# distance = int(input())
# time = []
#
# for i in range(1, 6):
#     if distance % i == 0:
#         time.append(distance // i)
# print(time)
# print(min(time))


# 1분에 최대 5까지 갈 수 있기 때문에
# 5로 나눴을 경우 나머지가 0이면
# 5로 나누고
# 그 외의 경우에는 나눈 후에 1을 더한다.
# 답은 정수 이기 때문.
distance = int(input())
if distance % 5 == 0:
    print(distance // 5)
else:
    print(distance // 5 + 1)
