#-*- coding:utf-8 -*-
'''
'''
def solution(n):
    binary = bin(n)
    print(binary)
    binaryRange = []
    for index, value in enumerate(binary[2:]) :
        if value == '1':
            binaryRange.append(index)
    return binaryGap(binaryRange)

def binaryGap(binaryRange):
    binaryGap = []
    for index in range(len(binaryRange)-1):
        binaryGap.append(binaryRange[index+1] - binaryRange[index] - 1)
    return max(binaryGap)

solution(10000000)