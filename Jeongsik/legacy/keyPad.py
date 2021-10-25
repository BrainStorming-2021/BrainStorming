#-*-coding:utf-8-*-
'''
    이 전화 키패드에서 왼손과 오른손의 엄지손가락만을 이용해서 숫자만을 입력하려고 합니다.
    맨 처음 왼손 엄지손가락은 * 키패드에 오른손 엄지손가락은 # 키패드 위치에서 시작하며, 엄지손가락을 사용하는 규칙은 다음과 같습니다.

    엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당합니다.
    왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
    오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
    가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다.
    4-1. 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.
    순서대로 누를 번호가 담긴 배열 numbers, 왼손잡이인지 오른손잡이인 지를 나타내는 문자열 hand가 매개변수로 주어질 때, 각 번호를 누른 엄지손가락이 왼손인 지 오른손인 지를 나타내는 연속된 문자열 형태로 return 하도록 solution 함수를 완성해주세요.

    [제한사항]
    numbers 배열의 크기는 1 이상 1,000 이하입니다.
    numbers 배열 원소의 값은 0 이상 9 이하인 정수입니다.
    hand는 "left" 또는 "right" 입니다.
    "left"는 왼손잡이, "right"는 오른손잡이를 의미합니다.
    왼손 엄지손가락을 사용한 경우는 L, 오른손 엄지손가락을 사용한 경우는 R을 순서대로 이어붙여 문자열 형태로 return 해주세요.
    입출력 예
    numbers	hand	result
    [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"	"LRLLLRLLRRL"
    [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]	"left"	"LRLLRRLLLRR"
    [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]	    "right"	"LLRLLRLLRL"
'''
def array_check(numbers):
    if count(numbers) >= 1 or count(numbers) <= 1000:
        for x in numbers:
            if x >= 9:
                return False
        return numbers
    else :
        return False

def same_distance(num, hand, temp):
    # 같은 거리
    if (temp['right'] - temp['left']) == 2 :
        if hand == 'left' :
            return 'L'
        else :
            return 'R'
    else :

def distribute_number(numbers, hand):
    result_array = []
    temp_num = {'left':0,'right':0}
    for i in numbers:
        if x == 1 or x == 4 or x == 7:
            result_array += 'L'
            temp_num['left'] = x
        elif x == 3 or x == 6 or x == 9:
            result_array += 'R'
            temp_num['right'] = x
        elif x == 2 or x == 5 or x == 8 or x == 0:
            result_array += same_distance(x, hand, temp_num)

def solution(numbers, hand):
    # 배열 범위체크
    array_check(numbers)
    
    # 체크로그
    distribute_number(array_check(numbers))
    
    answer = ''
    return answer

# 테스팅
solution([1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5], "right")
#solution([7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2], "left")
#solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 0], "right")

#distribute_number()