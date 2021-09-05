'''
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two one's added together. 
12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. 
However, the numeral for four is not IIII. Instead, the number four is written as IV. 
Because the one is before the five we subtract it making four. 
The same principle applies to the number nine, which is written as IX. 
There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Example 1:
    Input: s = "III"
    Output: 3
Example 2:
    Input: s = "IV"
    Output: 4
Example 3:
    Input: s = "IX"
    Output: 9
Example 4:
    Input: s = "LVIII"
    Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 5:
    Input: s = "MCMXCIV"
    Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

로마 숫자는 I, V, X, L, C, D, M의 7가지 기호로 표현된다.

기호 값
I   1
V   5
X   10
L   50
C   100
D   500
M   1000

예를 들어, 2는 로마 숫자로 II로 쓰고, 둘만 더하면 된다. 
12는 X+II로 표기됩니다. 숫자 27은 XXVII라고 쓰여 있는데, XX+V+II입니다.

로마 숫자는 보통 왼쪽에서 오른쪽으로 가장 크고 작은 숫자로 쓰입니다. 
그러나 4의 숫자는 III가 아니다. 대신, 숫자 4는 IV로 적습니다. 
왜냐하면 하나는 5보다 먼저 빼서 4가 되기 때문이다. 
IX로 표기된 숫자 9에도 같은 원칙이 적용된다. 
감산을 사용하는 예는 6가지입니다.

나는 V (5)와 X (10) 앞에 4와 9를 만들 수 있다. 
X는 L(50)과 C(100) 앞에 배치하여 40과 90을 만들 수 있습니다. 
C는 D(500)와 M(1000) 앞에 놓아 400과 900을 만들 수 있습니다.
로마 숫자가 지정된 경우 정수로 변환합니다.

예 1:
    입력: s = "III"
    출력: 3
예 2:
    입력: s = "IV"
    출력: 4
예 3:
    입력: s = "IX"
    출력: 9
예 4:
    입력: s = "LVIII"
    출력: 58
설명: L = 50, V = 5, III = 3.
예 5:
    입력: s = "MCMXCIV"
    출력: 1994
설명: M = 1000, CM = 900, XC = 90 및 IV = 4.
'''
class Solution:
    def romanToInt(self, s: str) -> int:
        roman2value={
            'M':1000,
            'CM':900,
            'D':500,
            'CD':400,
            'C':100,
            'XC':90,
            'L':50,
            'XL':40,
            'X':10,
            'IX':9,
            'V':5,
            'IV':4,
            'I':1
            }
            
        value=0
        temp=''
        cursor=0
        while cursor<len(s):
            if (cursor+1)!=len(s) and s[cursor]+s[cursor+1] in roman2value:
                value+=roman2value[s[cursor]+s[cursor+1]]
                cursor+=2
            else:
                value+=roman2value[s[cursor]]
                cursor+=1

        return value