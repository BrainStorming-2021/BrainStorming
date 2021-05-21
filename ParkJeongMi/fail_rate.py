def solution(N, stages):
    stages.sort()
    fail_rate = {}

    for i in range(1,N+1):
        fail_rate[i] = stages.count(i) / len(stages)
        while i in stages:
            stages.remove(i)


    else:
        fail_rate = dict(sorted(fail_rate.items(), key=lambda x: x[1], reverse=True))


    return list(fail_rate.keys())

N=5
stages=[2, 1, 2, 6, 2, 4, 3, 3]
print(solution(N,stages))