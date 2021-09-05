'''
    `₩`A non-empty array A consisting of N integers is given. 
    The consecutive elements of array A represent consecutive cars on a road.

    Array A contains only 0s and/or 1s:

    0 represents a car traveling east,
    1 represents a car traveling west.
    The goal is to count passing cars. 
    We say that a pair of cars (P, Q), where 0 ≤ P < Q < N, is passing when P is traveling to the east and Q is traveling to the west.

    For example, consider array A such that:

    A[0] = 0
    A[1] = 1
    A[2] = 0`
    A[3] = 1
    A[4] = 1
    We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).

    Write a function:

    class Solution { public int solution(int[] A); }

    that, given a non-empty array A of N integers, returns the number of pairs of passing cars.

    The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.

    For example, given:

    A[0] = 0
    A[1] = 1
    A[2] = 0
    A[3] = 1
    A[4] = 1
    the function should return 5, as explained above.

    Write an efficient algorithm for the following assumptions:

    N is an integer within the range [1..100,000];
    each element of array A is an integer that can have one of the following values: 0, 1.
    
    N개의 정수로 구성된 비어 있지 않은 배열 A가 제공됩니다. 
    배열 A의 연속 요소는 도로 위의 연속된 차량을 나타냅니다.
    어레이 A에는 0 및/또는 1만 포함됩니다.
        0은 동쪽으로 이동하는 자동차를 나타냅니다.
        1은 서쪽으로 이동하는 자동차를 나타냅니다.
    
    목표는 지나가는 차를 세는 것이다. 
    P가 동쪽으로, Q가 서쪽으로 이동할 때 0 ≤ P < Q > N인 한 쌍의 차(P, Q)가 지나간다고 합니다.

    예를 들어, 다음과 같이 배열 A를 고려하십시오.
    A[0] = 0
    A[1] = 1
    A[2] = 0
    A[3] = 1
    A[4] = 1
    (0, 1), (0, 3), (0, 4), (2, 3), (2, 4)의 다섯 쌍의 지나가는 자동차가 있습니다.

    함수 쓰기:

    클래스 솔루션 {public int 솔루션(int[] A); }
    n개의 정수 중 비어 있지 않은 배열 A가 주어진 경우 지나가는 차 쌍 수를 반환합니다.
    지나가는 차량 쌍 수가 100만 대를 초과하면 함수가 -1을 반환해야 합니다.

    예를 들어 다음과 같습니다.
    A[0] = 0
    A[1] = 1
    A[2] = 0
    A[3] = 1
    A[4] = 1
    위에서 설명한 것처럼 함수는 5를 반환해야 합니다.

    다음 가정에 대한 효율적인 알고리즘을 작성합니다.

    N은 [1] 범위 내의 정수입니다.100,000];
    배열 A의 각 요소는 0, 1 중 하나의 값을 가질 수 있는 정수입니다.
'''
def solution(A):
    sumN = 0
    west = 0
    for x in A:
        if x == 0:
            west += 1
        if x == 1:
            sum += west
    
    if sum > 1000000000:
        return -1
    return sum