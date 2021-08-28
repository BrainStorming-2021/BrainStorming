'''
Given an array of integers arr, sort the array by performing a series of pancake flips.

In one pancake flip we do the following steps:

Choose an integer k where 1 <= k <= arr.length.
Reverse the sub-array arr[0...k-1] (0-indexed).
For example, if arr = [3,2,1,4] and we performed a pancake flip choosing k = 3, we reverse the sub-array [3,2,1], so arr = [1,2,3,4] after the pancake flip at k = 3.

Return an array of the k-values corresponding to a sequence of pancake flips that sort arr. Any valid answer that sorts the array within 10 * arr.length flips will be judged as correct.



Example 1:

Input: arr = [3,2,4,1]
Output: [4,2,4,3]
Explanation: 
We perform 4 pancake flips, with k values 4, 2, 4, and 3.
Starting state: arr = [3, 2, 4, 1]
After 1st flip (k = 4): arr = [1, 4, 2, 3]
After 2nd flip (k = 2): arr = [4, 1, 2, 3]
After 3rd flip (k = 4): arr = [3, 2, 1, 4]
After 4th flip (k = 3): arr = [1, 2, 3, 4], which is sorted.
Example 2:

Input: arr = [1,2,3]
Output: []
Explanation: The input is already sorted, so there is no need to flip anything.
Note that other answers, such as [3, 3], would also be accepted.


Constraints:

1 <= arr.length <= 100
1 <= arr[i] <= arr.length
All integers in arr are unique (i.e. arr is a permutation of the integers from 1 to arr.length).

정수의 배열이 지정된 경우 일련의 팬케이크 뒤집기를 수행하여 배열을 정렬합니다.

팬케이크 뒤집기에서는 다음 단계를 수행합니다.

1 = k = arr.length인 정수 k를 선택합니다.
하위 배열 배열[0...k-1](0-indexed)을 반전합니다.
예를 들어, arr = [3,2,1,4]이고 k = 3을 선택하는 팬케이크 플립을 수행했다면, 하위 어레이 [3,2,1]을 반전시켰으므로, k = 3에서 팬케이크 플립 후 arr = [1,2,3,4]입니다.

정렬된 팬케이크 플립 시퀀스에 해당하는 k-값 배열을 반환합니다. 배열을 10 * arr.length 플립 내에서 정렬하는 유효한 답변은 모두 올바른 것으로 판단됩니다.



예 1:

입력: arr = [3,2,4,1]
출력: [4,2,4,3]
설명: 
우리는 k 값 4, 2, 4, 3으로 4번의 팬케이크 뒤집기를 수행합니다.
시작 상태: arr = [3, 2, 4,1]
첫 번째 플립 후(k = 4): arr = [1, 4, 2, 3]
두 번째 플립 후(k = 2): arr = [4, 1, 2,3]
세 번째 플립 후(k = 4): arr = [3, 2, 1, 4]
네 번째 플립(k = 3) 후: arr = [1, 2, 3, 4], 정렬됩니다.
예 2:

입력: arr = [1,2,3]
출력: []
설명: 입력이 이미 정렬되었으므로 아무것도 뒤집을 필요가 없습니다.
[3,3]과 같은 다른 답변도 수락됩니다.


제약 조건:

1 = 배열 길이 = 100
1 = arr[i] = arr.길이
배열의 모든 정수는 고유합니다(즉, 배열은 1에서 배열 길이까지의 정수의 순열입니다.
'''