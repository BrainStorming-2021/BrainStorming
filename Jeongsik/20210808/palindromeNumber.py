'''
Given an integer x, 
return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. 
For example, 121 is palindrome while 123 is not.

Example 1:
    Input: x = 121
    Output: true
Example 2:
    Input: x = -121
    Output: false
    Explanation: From left to right, 
    it reads -121. From right to left, 
    it becomes 121-. Therefore it is not a palindrome.
Example 3:
    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Example 4:
    Input: x = -101
    Output: false
    
정수 x가 주어지면,
x가 palindrome 정수이면 true를 반환합니다.

정수는 앞으로와 동일하게 거꾸로 읽힐 때 창호지입니다.
예를 들어, 121은 팔레드롬이고 123은 그렇지 않습니다.
'''
class Solution:
    def isPalindrome(self, x: int) -> bool:
        x = list(str(x))
        if x[0] == x[-1] :
            return True
        else :
            return False

sol = Solution()
sol.isPalindrome(12321)