# https://programmers.co.kr/learn/courses/30/lessons/81301
# 숫자 문자열과 영단어
def solution(s):
    dic = {
        'zero': '0',
        'one': '1',
        'two': '2',
        'three': '3',
        'four': '4',
        'five': '5',
        'six': '6',
        'seven': '7',
        'eight': '8',
        'nine': '9'
    }
    answer = s
    for key, value in dic.items():
        answer = answer.replace(key, value)
    return int(answer)
