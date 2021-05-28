# 세수 정렬
# 언어별로 정렬 속도 순위 매긴 자료
# https://www.acmicpc.net/blog/view/58
# 첫번째 내 풀이, 시간: 76m
number = list(map(int, input().split()))
number.sort()
for i in number:
    print(i, end=' ')

# 두번째 참고 풀이, 시간: 80m
number = list(map(int, input().split()))
number.sort()
print(number[0], number[1], number[2])

# 세번째 풀이: 가변적으로 인자를 받아서 바로 출력, 시간: 72m
# 참고: https://potensj.tistory.com/64
print(*sorted(map(int, input().split())))

