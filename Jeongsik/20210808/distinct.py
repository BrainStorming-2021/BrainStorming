'''
Write a function

def solution(A)

that, given an array A consisting of N integers, returns the number of distinct values in array A.

For example, given array A consisting of six elements such that:

A[0] = 2    A[1] = 1    A[2] = 1
A[3] = 2    A[4] = 3    A[5] = 1
the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].

함수 쓰기
용액 제거(A)

즉, N개의 정수로 구성된 배열 A가 주어진 경우 배열 A의 고유 값 수를 반환합니다.

예를 들어, 6개의 요소로 구성된 주어진 배열 A는 다음과 같습니다.

A[0] = 2 A[1] = 1 A[2] = 1
A[3] = 2 A[4] = 3 A[5] = 1
어레이 A에 표시되는 3개의 고유 값, 즉 1, 2, 3이 있기 때문에 함수는 3을 반환해야 합니다.

다음 가정에 대한 효율적인 알고리즘을 작성합니다.

N은 [0] 범위 내의 정수입니다.100,000];
배열 A의 각 요소는 [-1,000,000,000-1,000,000] 범위의 정수입니다.
'''
# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    return len(set(A))

solution([2,1,1,2,3,1])
