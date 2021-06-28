'''
    https://leetcode.com/problems/add-two-numbers/
    
    A binary gap within a positive integer N is any maximal sequence of consecutive zeros 
    that is surrounded by ones at both ends in the binary representation of N.

    For example, number 9 has binary representation 1001 and contains a binary gap of length 2. 
    The number 529 has binary representation 1000010001 and contains two binary gaps: 
    one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 
    1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

    Write a function:
        def solution(N)

    that, given a positive integer N, returns the length of its longest binary gap. 
    The function should return 0 if N doesn't contain a binary gap.

    For example, given N = 1041 the function should return 5, 
        because N has binary representation 10000010001 and so its longest binary gap is of length 5. 
        Given N = 32 the function should return 0, 
        because N has binary representation '100000' and thus no binary gaps.
        Write an efficient algorithm for the following assumptions:
        N is an integer within the range [1..2,147,483,647].
'''

def solution(n):
    answer = ''
    x = int(n / 2)
    y = int(n % 2)
    print(y)
    for seq in range(x-1):
        answer = answer + '0'
    else :
        answer = '1' + answer
    
    print(answer)
    return 0

solution(10)
solution(101)
#solution(1000)
#solution(10000)

'''
1   1
2   10
3   11
4   100
5   101
6   110
7   111
8   1000
9   1001
10  1010
11  1011
12  1100
13  1101
14  1110
15  1111
16  10000
17  10001
18  10010
19  10011
20  10100
21  10101
22  10110
23  10111
25  11000

'''