# K번째 수
def solution(array, commands):
    answer = []*len(commands)
    for com_list in commands:
        res=[]*(com_list[1]-com_list[0]+1)
        if com_list:
            res=array[com_list[0]-1:com_list[1]]
            res.sort()
            answer.append(res[com_list[2]-1])
    else:
        return answer


array=[1, 5, 2, 6, 3, 7, 4]
commands=[[2, 5, 3], [4, 4, 1], [1, 7, 3]]
'''
def solution(array, commands):
    return list(map(lambda x:sorted(array[x[0]-1:x[1]])[x[2]-1], commands))
'''
print(solution(array,commands))