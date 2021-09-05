# 위치를 찾는 함수
def parse(str):
    # 올바른 문자열인지 확인
    correct = True
    left = 0  # 열린 괄호
    right = 0  # 닫힌 괄호

    mystack = []

    # for 문을 돌면서 하나 하나 처리
    for i in range(len(str)):
        if str[i] == "(":  # 열린 괄호면
            left += 1  # 카운팅
            mystack.append('(')  # 스택에 넣어준다.
        else:
            right += 1  # 닫힌 괄호 카운팅
            if len(mystack) == 0:  # 쌍이 안맞는 경우에는
                correct = False  # 올바른 문자열인지 확인했던 곳을 True로 해준다.
            else:
                mystack.pop()  # 쌍이 맞는 열린 괄호를 pop한다.
        if left == right:
            return i + 1, correct
    return 0, False


def solution(p):
    if len(p) == 0:
        return p

    pos, correct = parse(p)
    u = p[:pos]
    v = p[pos:]
    if correct:
        # solution 함수를 재호출
        return u + solution(v)

    answer = '(' + solution(v) + ')'
    for i in range(1, len(u) - 1):
        if u[i] == '(':
            answer += ')'
        else:
            answer += '('
    return answer