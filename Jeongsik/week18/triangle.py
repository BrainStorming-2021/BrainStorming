'''
An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:

A[P] + A[Q] > A[R],
A[Q] + A[R] > A[P],
A[R] + A[P] > A[Q].
For example, consider array A such that:

A[0] = 10    A[1] = 2    A[2] = 5
A[3] = 1     A[4] = 8    A[5] = 20
Triplet (0, 2, 4) is triangular.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.

For example, given array A such that:

A[0] = 10    A[1] = 2    A[2] = 5
A[3] = 1     A[4] = 8    A[5] = 20
the function should return 1, as explained above. Given array A such that:

A[0] = 10    A[1] = 50    A[2] = 5
A[3] = 1
the function should return 0.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
Copyright 2009–2021 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.

N개의 정수로 구성된 배열 A가 제공됩니다. 트리플릿(P, Q, R)은 0 ≤ P < R > N이면 삼각형이다.

A[P] + A[Q] > A[R],
A[Q] + A[R] > A[P],
A[R] + A[P] > A[Q].
예를 들어, 다음과 같이 배열 A를 고려하십시오.

A[0] = 10A[1] = 2A[2] = 5
A[3] = 1 A[4] = 8 A[5] = 20
삼중곱(0, 2, 4)은 삼각형입니다.

함수 쓰기:
    클래스 솔루션 {public int 솔루션(int[] A); }
    즉, N개의 정수로 구성된 배열 A가 주어진 경우 이 배열에 대해 삼각형 삼중수열이 있으면 1을 반환하고 그렇지 않으면 0을 반환합니다.
    예를 들어, 다음과 같이 배열 A가 지정되어 있습니다.

A[0] = 10A[1] = 2A[2] = 5
A[3] = 1 A[4] = 8 A[5] = 20
    위에서 설명한 것처럼 함수는 1을 반환해야 합니다. 주어진 배열 A는 다음과 같습니다.

A[0] = 10A[1] = 50A[2] = 5
A[3] = 1
    함수가 0을 반환해야 합니다.

다음 가정에 대한 효율적인 알고리즘을 작성합니다.

N은 [0] 범위 내의 정수입니다.100,000];
배열 A의 각 요소는 [-2,147,483,648..2,147,483,647] 범위의 정수입니다.
Codility Limited의 저작권 2009-2021. All Rights Reserved. 무단 복사, 출판 또는 공개가 금지됩니다.
'''

# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    # write your code in Python 3.6
    idx = 0
    stack = {}
    
    # 1. 패턴별 더하기
    for P in A:
        for Q in A:
            if max(A) != Q : # 조건 A 의 max 값과 Q 가 같다면 마시막 시퀀스 이다.
                R = Q + 1
            if (P + Q) > R :
                stack[idx]={P, Q, R}
                # print('P Q R 값')
                # print(P, Q, R)
            idx = idx + 1
    
    # 2. 배열정리
    for key in stack :
        if len(stack[key]) == 2:
            del stack[key]
        #print(key, len(stack[key]), sep = '|')
        
    
    pass


solution([10, 2, 5, 1, 8, 20])
# solution([10, 50, 5, 1])