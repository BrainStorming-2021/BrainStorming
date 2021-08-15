'''
A small frog wants to get to the other side of the road. 
The frog is currently located at position X and wants to get to a position greater than or equal to Y. 
The small frog always jumps a fixed distance, D.

Count the minimal number of jumps that the small frog must perform to reach its target.

Write a function:

def solution(X, Y, D)

that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

For example, given:

  X = 10
  Y = 85
  D = 30
the function should return 3, because the frog will be positioned as follows:

after the first jump, at position 10 + 30 = 40
after the second jump, at position 10 + 30 + 30 = 70
after the third jump, at position 10 + 30 + 30 + 30 = 100
Write an efficient algorithm for the following assumptions:

X, Y and D are integers within the range [1..1,000,000,000];
X ≤ Y.
Copyright 2009–2021 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
'''
'''
작은 개구리가 목표물에 도달하기 위해 수행해야 하는 최소 점프 수를 세십시오.

함수 쓰기:

def 용액(X, Y, D)

3개의 정수 X, Y, D가 주어지면 위치 X에서 Y보다 크거나 같은 위치로 최소 점프 수를 반환합니다.

예를 들어 다음과 같습니다.

X = 10 # 현재위치
Y = 85 # 목표 위치
D = 30 # 스텝
최소한의 거리 측정
개구리가 다음과 같이 위치하기 때문에 함수는 3을 반환해야 합니다.

첫 번째 점프 후, 10 + 30 = 40 위치에서
두 번째 점프 후, 10 + 30 + 30 = 70 위치에서
세 번째 점프 후, 10 + 30 + 30 + 30 = 100 위치에서
다음 가정에 대한 효율적인 알고리즘을 작성합니다.

X, Y 및 D는 [1..1,000,000,000] 범위의 정수입니다.
X ≤ Y.
Codility Limited의 저작권 2009-2021. All Rights Reserved. 무단 복사, 출판 또는 공개가 금지됩니다.
'''
# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")
import math
def solution(X, Y, D):
    Y = Y - (X + D)
    return math.ceil(Y/D) + 1

solution(10, 85, 30)