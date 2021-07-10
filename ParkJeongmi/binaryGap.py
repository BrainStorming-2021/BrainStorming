# 1. Make it to Binary
# 2. Count 0
# 3. return longest length
# 4. if there is no binary gap then return 0
import math

def cal(N):
    pre_num = 0
    max_num = 0
    while N > 0:
        num = int(math.log2(N))
        N = N - (2 ** num)
        if (pre_num - num - 1) > max_num:
            max_num = (pre_num - num - 1)
        elif max_num <= 0 and (pre_num - num - 1) <= 0:
            max_num = 0
        pre_num = num
    return max_num

print(cal(19))