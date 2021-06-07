def solution(numbers, hand):
    sample = {1: "L", 3: "R", 4: "L", 6: "R", 7: "L", 9: "R"}
    answer = ""
    for i in numbers:
        if i in sample:
            answer+=sample[i]
            if sample[i] == "L":
                L = i
            else:
                R = i
        else:
            div_r = abs(int(R - i))
            div_l = abs(int(L - i))
            div_r = div_r % 3 + div_r // 3
            div_l = div_l % 3 + div_l // 3
            if div_r > div_l:
                answer += "L"
                L = i
            elif div_r == div_l:
                answer += hand[0].upper()
            else:
                answer += "R"
                R = i

    else:
        return answer
numbers=[7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]
hand="left"
print(solution(numbers,hand))


'''
def solution(numbers, hand):
    sample = {1: "L", 3: "R", 4: "L", 6: "R", 7: "L", 9: "R"}
    L=""
    R=""
    answer = ""
    for i in numbers:
        if i in sample:
            answer+=sample[i]
            if sample[i] == "L":
                L = i
            else:
                R = i
        else:
            div_r = abs(int(R - i))
            div_l = abs(int(L - i))
            div_r = div_r % 3 + div_r // 3
            div_l = div_l % 3 + div_l // 3
            if div_r > div_l:
                answer += "L"
                L = i
            elif div_r == div_l:
                answer += hand[0].upper()
            else:
                answer += "R"
                R = i

    else:
        return answer

'''