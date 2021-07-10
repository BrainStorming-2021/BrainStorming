# 2019 KaKao Blind Open chatting

from collections import deque
def solution(record):
    nickName = {}
    tmp = []
    answer = []
    types = {"Enter": "들어왔습니다.", "Leave": "나갔습니다."}

    for i in record:
        tmp = i.split()
        if tmp[0] == "Enter" or tmp[0] == "Change":
            nickName[tmp[1]] = tmp[2]

    for i in record:
        tmp = i.split()
        if tmp[0] != 'Change':
            answer.append(nickName[tmp[1]] + "님이 " + types[tmp[0]])

    '''
    # dq 사용한 풀이
    dq = deque([])
    for i in record:
        tmp = i.split()
        if tmp[0] == "Enter" or tmp[0] == "Change":
            nickName[tmp[1]] = tmp[2]
        if tmp[0] == "Enter" or tmp[0] == "Leave":
            dq.append([tmp[1], tmp[0]])

    for i in range(len(dq)):
        answer.append(nickName[dq[i][0]] + "님이 " + types[dq[i][1]])

    '''

    return answer


record = ["Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"]
print(solution(record))