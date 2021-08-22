'''
A non-empty array A consisting of N integers is given.

The leader of this array is the value that occurs in more than half of the elements of A.

An equi leader is an index S such that 0 ≤ S < N − 1 and two sequences A[0], A[1], ..., A[S] and A[S + 1], A[S + 2], ..., A[N − 1] have leaders of the same value.

For example, given array A such that:

    A[0] = 4
    A[1] = 3
    A[2] = 4
    A[3] = 4
    A[4] = 4
    A[5] = 2
we can find two equi leaders:

0, because sequences: (4) and (3, 4, 4, 4, 2) have the same leader, whose value is 4.
2, because sequences: (4, 3, 4) and (4, 4, 2) have the same leader, whose value is 4.
The goal is to count the number of equi leaders.

Write a function:

def solution(A)
that, given a non-empty array A consisting of N integers, returns the number of equi leaders.

For example, given:

    A[0] = 4
    A[1] = 3
    A[2] = 4
    A[3] = 4
    A[4] = 4
    A[5] = 2
the function should return 2, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000,000..1,000,000,000].

N개의 정수로 구성된 비어 있지 않은 배열 A가 제공됩니다.
이 배열의 리더는 A 요소의 절반 이상에서 발생하는 값입니다.
동등 리더는 0 ≤ S < N - 1 및 두 시퀀스 A[0], A[1], A[S +1], A[S +2], ..., A[N -1]가 동일한 값의 리더를 갖는 지수 S입니다.

예를 들어, 다음과 같이 배열 A가 지정되어 있습니다.
    A[0] = 4
    A[1] = 3
    A[2] = 4
    A[3] = 4
    A[4] = 4
    A[5] = 2
    두 가지 동등한 리더를 찾을 수 있습니다.

(4)와 (3, 4, 4, 4, 2)의 리더는 같으며 값은 4입니다.
    2의 경우 시퀀스: (4, 3, 4) 및 (4, 4, 2)의 지시선이 같으며 값은 4입니다.
    목표는 동등한 리더의 수를 세는 것입니다.

함수 쓰기:
    용액 제거(A)
    즉, N개의 정수로 구성된 비어 있지 않은 배열 A가 주어지면 동등 리더의 수를 반환합니다.

예를 들어 다음과 같습니다.
    A[0] = 4
    A[1] = 3
    A[2] = 4
    A[3] = 4
    A[4] = 4
    A[5] = 2
    위에서 설명한 것처럼 함수는 2를 반환해야 합니다.

다음 가정에 대한 효율적인 알고리즘을 작성합니다.
    N은 [1] 범위 내의 정수입니다.100,000];
    배열 A의 각 요소는 [-1,000,000,000,000–100,000,000,000] 범위의 정수입니다.

배열에서 가장 많이 중복 된 값
배열길이 절반이상을 넘는 값
'''
# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    # write your code in Python 3.6
    cntDic = {key:0 for key in list(map(int, A))}
    maxKey = max(cntDic.keys(), key=lambda k : cntDic[k])
    
    condition2 = int(len(A)/2)
    for _ in A[:condition2] :
        cntDic[_] = cntDic[_] + 1
    
    # 초기화 한번더
    cntDic = {key:0 for key in list(map(int, A[condition2:]))}
    for _ in A[condition2:] :
        cntDic[_] = cntDic[_] + 1
    # print(cntDic)
    maxKeyLeft = max(cntDic.keys(), key=lambda k : cntDic[k])
    
    cntDic = {key:0 for key in list(map(int, A[:condition2]))}
    for _ in A[:condition2] :
        cntDic[_] = cntDic[_] + 1
    # print(cntDic)
    maxKeyRight = max(cntDic.keys(), key=lambda k : cntDic[k])
    
    if maxKey == maxKeyLeft == maxKeyRight :
        return maxKey


solution([4, 3, 4, 4, 4, 2])

