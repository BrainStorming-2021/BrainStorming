'''
    20210501 알고리즘 모임 1회차
'''
import random

def testBill():
    bill_list = []
    for i in range(random.randrange(1, 101)):
        bill_list.append(random.randrange(1, 100001))
    return bill_list

def testBudget():
    return random.randrange(1, 10000001)

def solution(d, budget):
    answer = 0
    return answer

#solution(testBill(), testBudget())

# 정미씨 솔루션
def solution_1(d, budget):
    d.sort()
    answer = []
    for i in d:
        answer.append(i)
        if budget < sum(answer) :
            del answer[len(answer)-1]
            break
    return len(answer)

print(testBill(),' 금액을 지불해야하는 배열입니다.')
print(testBudget(),' 전체 예산입니다.')
print(solution_1(testBill(), testBudget()), ' 금액을 지불한 총 배열의 개수입니다.')

