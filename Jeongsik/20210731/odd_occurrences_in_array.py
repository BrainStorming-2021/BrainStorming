'''
    A non-empty array A consisting of N integers is given. 
    The array contains an odd number of elements, 
    and each element of the array can be paired with another element that has the same value, 
    except for one element that is left unpaired.

    For example, in array A such that:

    A[0] = 9  A[1] = 3  A[2] = 9
    A[3] = 3  A[4] = 9  A[5] = 7
    A[6] = 9
        the elements at indexes 0 and 2 have value 9,
        the elements at indexes 1 and 3 have value 3,
        the elements at indexes 4 and 6 have value 9,
        the element at index 5 has value 7 and is unpaired.
    
    Write a function:
        def solution(A)
        that, given an array A consisting of N integers fulfilling the above conditions, 
        returns the value of the unpaired element.

    For example, given array A such that:
        A[0] = 9  A[1] = 3  A[2] = 9
        A[3] = 3  A[4] = 9  A[5] = 7
        A[6] = 9
    the function should return 7, as explained in the example above.

    Write an efficient algorithm for the following assumptions:
        N is an odd integer within the range [1..1,000,000];
        each element of array A is an integer within the range [1..1,000,000,000];
        all but one of the values in A occur an even number of times.
        
    N개의 정수로 구성된 비어 있지 않은 배열 A가 제공됩니다.
    배열에 홀수의 요소가 포함되어 있습니다.
    배열의 각 요소는 동일한 값을 가진 다른 요소와 쌍을 이룰 수 있습니다.
    단, 쌍을 이루지 않은 한 요소는 제외합니다.

    예를 들어, 배열 A에서 다음을 수행합니다.
        A[0] = 9 A[1] = 3 A [2] = 9
        A[3] = 3 A[4] = 9 A [5] = 7
        A[6] = 9
        
        A[0] = 9 
        A[2] = 9
        A[4] = 9
        A[6] = 9
        
        A[1] = 3 
        A[3] = 3  
        
        A[5] = 7
        
        인덱스 0과 2의 요소는 값 9를 가집니다.
        인덱스 1과 3의 요소는 값 3을 가집니다.
        인덱스 4와 6의 요소는 값 9를 가집니다.
        인덱스 5의 요소는 값 7을 가지며 쌍을 이루지 않습니다.

    함수 쓰기:
        용액 제거(A)
            위의 조건을 만족하는 N개의 정수로 구성된 배열 A가 주어졌을 때,
            쌍으로 구성되지 않은 요소의 값을 반환합니다.

    예를 들어, 다음과 같이 배열 A가 지정되어 있습니다.
        A[0] = 9 A[1] = 3 A [2] = 9
        A[3] = 3 A[4] = 9 A[5] = 7
        A[6] = 9
        
        A[1] = 3
        A[3] = 3
        
        A[0] = 9  
        A[2] = 9
        A[4] = 9 
        A[6] = 9
        
        A[5] = 7
        위의 예에서 설명한 것처럼 함수는 7을 반환해야 합니다.

    다음 가정에 대한 효율적인 알고리즘을 작성합니다.
    N은 [1..1,000,000] 범위 내의 홀수 정수입니다.
    배열 A의 각 요소는 [1..1,000,000,000] 범위의 정수입니다.
    A의 값 중 하나를 제외한 모든 값이 짝수 횟수만큼 발생합니다.
'''

def solution(A):
    # write your code in Python 3.6
    stack = {}
    for seq, value in enumerate(A):
        if not value in stack :
            stack[value] = 1
        else :
            stack[value] = stack[value] + 1
    
    for x in stack:
        if(stack[x]%2 != 0) :
            return x
    
'''
A[0] = 9  
A[2] = 9
A[4] = 9  
A[6] = 9

A[1] = 3  
A[3] = 3

A[5] = 7
'''
print(solution([9,3,9,3,9,7,9]))