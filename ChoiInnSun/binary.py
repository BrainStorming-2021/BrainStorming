def solution(N):
    binary_num = bin(N).lstrip('0b')
    count = 0
    max_cnt = 0
    for i in binary_num:
        if i == '1':
            if max_cnt < count:
                max_cnt = count
                count = 0
            else:
                count = 0
        else:
            count += 1
    return max_cnt
