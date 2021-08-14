'''
    10. Regular Expression Matching    
        Given an input string s and a pattern p, 
        implement regular expression matching with support for '.' and '*' where:
        '.' Matches any single character.​​​​
        '*' Matches zero or more of the preceding element.
        The matching should cover the entire input string (not partial).
    Example 1:
        Input: s = "aa", p = "a"
        Output: false
        Explanation: "a" does not match the entire string "aa".
    Example 2:
        Input: s = "aa", p = "a*"
        Output: true
        Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, 
        by repeating 'a' once, it becomes "aa".
    Example 3:
        Input: s = "ab", p = ".*"
        Output: true
        Explanation: ".*" means "zero or more (*) of any character (.)".
    Example 4:
        Input: s = "aab", p = "c*a*b"
        Output: true
        Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore, it matches "aab".
    Example 5:
        Input: s = "mississippi", p = "mis*is*p*."
        Output: false 
    Constraints:
        1 <= s.length <= 20
        1 <= p.length <= 30
        s contains only lowercase English letters.
        p contains only lowercase English letters, '.', and '*'.
        It is guaranteed for each appearance of the character '*', 
        there will be a previous valid character to match.
        
    10. 정규식 일치
        입력 문자열과 패턴 p가 주어지면,
        '.' 및 '*'에 대한 지원을 통해 정규식 일치를 구현합니다. 
        여기서:
            '.' 단일 문자와 일치합니다.​​​​
            '*' 앞 요소 중 0개 이상과 일치합니다.
            일치는 전체 입력 문자열을 포함해야 합니다(부분이 아님).
        예 1:
            입력: s = "aa", p = "a"
            출력: false
            설명: "a"가 전체 문자열 "aa"와 일치하지 않습니다.
        예 2:
            입력: s = "aa", p = "a*"
            출력: true
            설명: '*'는 앞의 요소 'a' 중 0개 이상을 의미합니다. 그렇기 때문에.
            'a'를 한 번 반복하면 'aa'가 됩니다.
        예 3:
            입력: s = "ab", p = ".*"
            출력: true
            설명: ".*"는 "모든 문자(.) 중 0 이상(*)"을 의미합니다.
        예 4:
            입력: s = "aab", p = "c*a*b"
            출력: true
            설명: c는 0회 반복할 수 있고, a는 1회 반복할 수 있습니다. 따라서 "aab"과 일치합니다.
        예 5:
            입력: s = "dispippi", p = "mis*is*p*"
            출력: false
        제약 조건:
            1 = s.길이 = 20
            1 = 페이지 길이 = 30
            s에는 소문자 영어만 포함됩니다.
            p에는 '.' 및 '*' 소문자만 포함됩니다.
            캐릭터 '*'의 등장마다 보증됩니다.
            일치시킬 이전 유효한 문자가 있습니다.
'''
class Solution:
    def isMatch(self, s: str, p: str) -> bool:
        
        return 
    
    
def astric():
    pass
def dot():
    pass

sol = Solution();
sol.isMatch("aa", "a")
sol.isMatch("aa", "a*")
sol.isMatch("ab", ".*")
sol.isMatch("aab", "c*a*b")
sol.isMatch("dispippi", "mis*is*p*")