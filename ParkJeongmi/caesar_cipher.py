
'''
A :  65
a :  97
Z :  90
z :  122
'''
# 시저암호
def solution(s,n):
    answer=''
    n=int(n)
    string_list = list(s)
    print(string_list)
    for i in string_list:
        if i == ' ':
            answer += ' '
        else:
            str=ord(i)
            if i.isupper():
                if 90 < str+n:
                    answer += chr(64+(str+n)-90)
                else:
                    answer += chr(str+n)
            else:
                if 122 < str+n:
                    answer += chr(96+((str+n)-122))
                else:
                    answer += chr(str+n)

    return answer

'''
def solution(s, n):
    return ''.join([chr(ord(i) + (not ord(i)==32)*((n%26) -26*((90<(ord(i)+(n%26))*(ord(i)<91)) + (122<(ord(i)+(n%26)))))) for i in s])
'''

