def solution(n):
    # 입력값 bin code 로 변환
    binary = bin(n)
    print(binary[2:])

    # 들어오는 값 위치 확인
    binaryRange = []
    for index, value in enumerate(binary[2:]) :
        # print(index, value, sep='|')
        if value == '1':
            # binary gap range array
            binaryRange.append(index)

    return binaryGap(binaryRange)
    
def binaryGap(binaryRange):
    binaryGap = []
    for index in range(len(binaryRange)-1):
        binaryGap.append(binaryRange[index+1] - binaryRange[index] - 1)
    return max(binaryGap)

print(solution(10000000))