# 백준 - 회사에 있는 사람
# 로그가 주어졌을 때, 현재 회사에 있는 모든 사람을 구하는 프로그램을 작성하시오.
# enter는 출근, leave는 퇴근
# 동명이인 없음
# 직원이름 대소문자 구분함.
# 이름은 5글자 이하
# 출력 : 현재 회사에 있는 사람의 이름을 사전 순의 역순으로 한줄이 한명씩 출력
n = int(input())
punch = {}
people = []
for _ in range(n):
    k, p = input().split()
    punch[k] = p

for name, condition in punch.items():
    if condition == "enter":
        people.append(name)

print("\n".join(sorted(people, reverse=True)))

