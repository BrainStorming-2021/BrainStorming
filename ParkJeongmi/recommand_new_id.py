import re
#

def solution(new_id):
    # 1단계 소문자로 변환
    new_id = new_id.lower()
    # 2단계 숫자,영어,-_. 이외 모두 제거
    new_id = re.sub('[^a-z0-9-_.]', '', new_id)
    # 3단계 ..연속 제거
    new_id = re.sub('\.+', '../../../BrainStorming/ParkJeongMi', new_id)
    # 4단계 앞뒤 . 제거
    if new_id:
        if new_id[0] == ".":
            new_id = new_id[1:]
    if new_id:
        if new_id[-1] == ".":
            new_id = new_id[:-1]
    # 5단계 빈값일경우 a 대입
    if not new_id:
        new_id = 'a'

    # 6단계 길이 15 제한
    new_id = new_id[0:15]

    if new_id:
        if new_id[-1] == ".":
            new_id = new_id[:-1]
    # 7단계 3자리미만 마지막글자 반복으로 붙이기
    if len(new_id) < 3:
        new_id = new_id + new_id[-1] * (3 - len(new_id))

    return new_id