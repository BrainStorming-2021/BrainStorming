# 휴대폰번호
def solution(phone_book):
    for idx, x in enumerate(phone_book):
        for i in phone_book[idx+1:]:
            if x==i[0:len(x)]:
                return False
    else:
        return True
