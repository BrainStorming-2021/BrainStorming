# 카카오 블라인드 문자열 압축
# 시간복잡도가 조금 높게 나와 코드 개선 필요합니다.
def solution(s):
    stp = 1
    size = [''] * (len(s) + 1)

    while True:
        if stp > len(s):
            break
        else:
            list_ = find_len(s, stp, size)
        stp += 1

    min_len = len(s)

    for i in list_:
        if len(i) == 0:
            continue
        if min_len > len(i):
            min_len = len(i)
    return min_len


def find_len(s, stp, size):
    cnt = {}
    for idx, x in enumerate(s):
        if idx % stp == 0:
            if s[idx: idx + stp] not in cnt:
                cnt[s[idx: idx + stp]] = 1
            if s[idx: idx + stp] == s[idx + stp:idx + stp + stp]:
                cnt[s[idx: idx + stp]] += 1
            else:
                if cnt[s[idx: idx + stp]] > 1:
                    size[stp] += str(cnt[s[idx: idx + stp]]) + s[idx: idx + stp]
                else:
                    size[stp] += s[idx: idx + stp]
                del (cnt[s[idx: idx + stp]])
        else:
            continue
    return size


# s = "aabbaccc"
s = "a"
solution(s)
# "aabbaccc"
# "ababcdcdababcdcd"
# "abcabcdede"
# "abcabcabcabcdededededede"
# "xababcdcdababcdcd"
