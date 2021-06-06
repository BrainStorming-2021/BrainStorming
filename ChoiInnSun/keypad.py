# 프로그래머스 - 키패드 누르기
def solution(numbers, hand):
    answer = ''
    last_l = 10
    last_r = 12

    for currentNo in numbers:
        if currentNo in [1, 4, 7]:
            answer += "L"
            last_l = currentNo
        elif currentNo in [3, 6, 9]:
            answer += "R"
            last_r = currentNo
        else:
            div_l = distance(last_l, currentNo)
            div_r = distance(last_r, currentNo)

            if div_l > div_r:
                answer += "R"
                last_r = currentNo
            elif div_l < div_r:
                answer += "L"
                last_l = currentNo
            elif div_l == div_r:
                if hand == "right":
                    answer += "R"
                    last_r = currentNo
                else:
                    answer += "L"
                    last_l = currentNo
    return answer


def distance(hand_no, number):
    find_distance = {
        '1': (0, 0), '2': (0, 1), '3': (0, 2),
        '4': (1, 0), '5': (1, 1), '6': (1, 2),
        '7': (2, 0), '8': (2, 1), '9': (2, 2),
        '10': (3, 0), '0': (3, 1), '12': (3, 2)
    }
    hand_no = str(hand_no)
    number = str(number)
    x_h, y_h = find_distance[hand_no]
    x_n, y_n = find_distance[number]
    return abs(x_n - x_h) + abs(y_n - y_h)
