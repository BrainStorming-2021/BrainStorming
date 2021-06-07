# 크레인 인형뽑기

def solution(board, moves):
    stack =[]
    cnt = 0
    for i in moves:
        for j in board[i - 1][-1:]:
            if j == 0:
                continue
            else:
                idx = j
                board[i - 1].pop()
                break
        else:
            continue

        print("boad i ",i)
        print("idx ",idx)
        if len(stack)>0:
            if stack[-1] == idx:
                stack.pop()
                cnt += 1
            else:
                stack.append(idx)
        else:
            stack.append(idx)
        print(stack)

        print("board : ",board)
        print("###################")
    else:
        return cnt*2

board=[[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]
moves=[1,5,3,5,1,2,1,4]
print('[START]')
print(solution(board,moves))
print('[END]')