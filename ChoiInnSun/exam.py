import math

# 백준 - 5532번 - 방학 숙제
# 링크 - https://www.acmicpc.net/problem/5532
total_day = int(input())
korean_total = int(input())
math_total = int(input())
max_korean = int(input())
max_math = int(input())

max_day = max(math.ceil(math_total/max_math), math.ceil(korean_total/max_korean))
result = total_day - max_day
print(result)
