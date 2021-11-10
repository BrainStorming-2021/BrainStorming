class Solution:
    def romanToInt(self, s: str) -> int:
        romans = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
        }

        result = 0

        i = len(s) - 1
        while i > -1:
            char = s[i]
            if (char == 'V' and i != 0 and s[i - 1] == 'I'):
                result += 4
                i -= 2
            elif (char == 'X' and i != 0 and s[i - 1] == 'I'):
                result += 9
                i -= 2
            elif (char == 'L' and i != 0 and s[i - 1] == 'X'):
                result += 40
                i -= 2
            elif (char == 'C' and i != 0 and s[i - 1] == 'X'):
                result += 90
                i -= 2
            elif (char == 'D' and i != 0 and s[i - 1] == 'C'):
                result += 400
                i -= 2
            elif (char == 'M' and i != 0 and s[i - 1] == 'C'):
                result += 900
                i -= 2
            else:
                result += romans[char]
                i -= 1

        return result