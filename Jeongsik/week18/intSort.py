'''
문제
    N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
    첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 
    둘째 줄부터 N개의 줄에는 수 주어진다. 
    이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

출력
    첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

예제 입력 1  복사   예제 출력 1  복사
5
5                1   
2                2   
3                3   
4                4   
1                5
'''

nStack = []
iNum = int(input())

for _ in range(iNum):
    nStack.append(int(input()))

for idx in range(len(nStack)): # 앞으로 갈 가장 작은값
    minIndex = idx
    for com in range(idx + 1, len(nStack)): # 비교 교체 값
        if nStack[minIndex] > nStack[com]: # 계속해서 작은수의 index 값을 찾아서 비교하고 넣는다.
            minIndex = com
    nStack[idx], nStack[minIndex] = nStack[minIndex], nStack[idx]

for result in nStack:
    print(result)

