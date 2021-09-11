from typing import List


class Solution:
    # 문자열 중에 가장 긴 접두사를 구하는 문제.
    def longestCommonPrefix(self, strs: List[str]) -> str:
        prefix = []
        # zip(*iterable)은 동일한 개수로 이루어진 자료형을 묶어 주는 역할을 하는 함수이다.
        # ※ 여기서 사용한 *iterable은 반복 가능(iterable)한 자료형 여러 개를 입력할 수 있다는 의미
        for x in zip(*strs):
            # print(x)
            # print('>>>>>')
            # print(set(x))
            if len(set(x)) == 1:
                prefix.append(x[0])
            else:
                break
        return "".join(prefix)
