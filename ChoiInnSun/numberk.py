# 나의 풀이
def solution(array, commands):
    answer = []

    for i in range(len(commands)):
        i, j, k = commands[i][0], commands[i][1], commands[i][2]
        split = array[i - 1:j]
        split.sort()
        answer.append(split[k - 1])

    return answer


# 다른 사람 풀이2
def solution2(array, commands):
    return list(map(lambda x: sorted(array[x[0] - 1:x[1]])[x[2] - 1], commands))


# 다른 사람 풀이3
def solution3(array, commands):
    answer = []
    for command in commands:
        i, j, k = command
        answer.append(list(sorted(array[i - 1:j]))[k - 1])
        print(list(sorted(array[i - 1:j]))[k - 1])

    return answer
